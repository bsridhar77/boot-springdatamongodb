package com.company.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

	

	/**
	 * Saves the given {@link Quote}. #
	 * 
	 * @param quote
	 * @return
	 */
	Quote save(Quote quote);

	/**
	 * Returns the {@link Quote} with the given {@link EmailAddress}.
	 * 
	 * @param string
	 * @return
	 */
	List<Quote> findByCreatedByUser(String createdUser);
	
	List<Quote> findByAgentWritingTIN(String agentWritingTIN);
	
	
	Quote findByQuoteReferenceNumber(String quoteReferenceNumber);
	
	long deleteQuoteByQuoteReferenceNumber(String quoteReferenceNumber);
	
	
}
