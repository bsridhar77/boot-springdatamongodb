package com.company.service;

import java.math.BigInteger;
import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.annotation.Nonnull;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.company.exception.ResourceNotFoundException;
import com.company.helper.PlanHelper;
import com.company.model.Quote;
import com.company.repository.MongoSequenceRepository;
import com.company.repository.QuoteRepository;

@RestController
@RequestMapping("/quote")
public class QuoteService {

	@Autowired
	QuoteRepository quoteRepository;

	@Autowired
	MongoSequenceRepository mongoSequenceRepository;
	
	@Autowired
	PlanHelper planHelper;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<Page<Quote>> getAllQuotes(Pageable pageable) {

		Page<Quote> quoteList = quoteRepository.findAll(pageable);

		if (quoteList == null || quoteList.getTotalPages()== 0) {
			throw new ResourceNotFoundException(
					"No Quotes found in the System ");
		}

		return new ResponseEntity<>(quoteList, HttpStatus.OK);
	}

	@RequestMapping(value = "/agent/{agentTIN}", method = RequestMethod.GET)
	public ResponseEntity<Page<Quote>> getAgentQuotes(
			@Valid @Nonnull @PathVariable String agentTIN,Pageable pageable) {

		
		Page<Quote> quoteList = quoteRepository.findByAgentWritingTIN(agentTIN,pageable);

		if (quoteList == null || quoteList.getTotalPages() <= 0) {
			throw new ResourceNotFoundException(
					"No Quotes found for Agent Writing TIN: " + agentTIN);
		}

		return new ResponseEntity<>(quoteList, HttpStatus.OK);
	}

	@RequestMapping(value = "/{qrefno}", method = RequestMethod.GET)
	public ResponseEntity<Quote> getQuote(@PathVariable String qrefno) {
		Quote quote = quoteRepository.findOne(qrefno);

		if (quote == null) {
			throw new ResourceNotFoundException(
					"Quote with Quote Reference Id " + qrefno + " not found");
		}
		
		//Pass Product/Plan/Contract Codes as required to Plan Service and fetch Plan and Benefit Details
		//Add the response from Plan Service to Quote Object and send the response
		
		planHelper.addPlanBenefitsToQuote(quote);
		
		return new ResponseEntity<>(quote, HttpStatus.OK);
	}



	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<?> createQuote(@Valid @RequestBody Quote quote) {

		// Set the Current Date of quote creation
		quote.setCreatedOn(new Date());

		// Get the Next Sequence Number to use for Quote Reference Number
		BigInteger nextQuoteRefNo = mongoSequenceRepository
				.getNextSequence("quote");

		quote.setQuoteReferenceNumber("" + nextQuoteRefNo);

		// Save the Quote
		Quote rQuote = quoteRepository.save(quote);

		// Set the location header for the newly created resource
		HttpHeaders responseHeaders = new HttpHeaders();
		URI newQuoteUri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(rQuote.getQuoteReferenceNumber())
				.toUri();
		responseHeaders.setLocation(newQuoteUri);

		return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);

	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public ResponseEntity<?> updateQuote(@RequestBody Quote quote) {

		verifyQuote(quote.getQuoteReferenceNumber());

		// Set the Current Date of quote updation Date
		quote.setLastModifiedOn(new Date());
		quoteRepository.save(quote);

		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(value = "/{quoteReferenceNumber}", method = RequestMethod.DELETE)
	public long deleteQuote(@PathVariable String quoteReferenceNumber) {
		verifyQuote(quoteReferenceNumber);
		return quoteRepository
				.deleteQuoteByQuoteReferenceNumber(quoteReferenceNumber);
	}

	
	
	protected void verifyQuote(String quoteReferenceNumber)
			throws ResourceNotFoundException {
		Quote quote = quoteRepository.findOne(quoteReferenceNumber);
		if (quote == null) {
			throw new ResourceNotFoundException(
					"Quote with Quote Reference Number " + quoteReferenceNumber
							+ " not found");
		}
	}

}