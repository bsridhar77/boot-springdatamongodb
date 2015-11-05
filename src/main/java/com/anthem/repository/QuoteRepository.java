package com.anthem.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.anthem.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

	

	Page<Quote> findByCreatedByUser(String createdUser,Pageable pageable);
	
	Page<Quote> findByAgentWritingTIN(String agentWritingTIN,Pageable pageable);
	
	
	Quote findByQuoteReferenceNumber(String quoteReferenceNumber);
	
	long deleteQuoteByQuoteReferenceNumber(String quoteReferenceNumber);
	
	
}
