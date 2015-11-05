package com.company.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.company.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

	

	Page<Quote> findByCreatedBy(String createdBy,Pageable pageable);
	
	@Query("{ 'broker.writingAgentTin' : ?0 }")
	Page<Quote> findByAgentWritingTIN(String agentWritingTIN,Pageable pageable);
	
	
	Quote findByQuoteReferenceNumber(String quoteReferenceNumber);
	
	long deleteQuoteByQuoteReferenceNumber(String quoteReferenceNumber);
	
	
}
