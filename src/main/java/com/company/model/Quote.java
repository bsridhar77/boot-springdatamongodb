
package com.company.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quote { 

	
	@Id
	private String quoteReferenceNumber;

	@NotEmpty
	private String premiumAmount;

	@NotEmpty
	private String productOption;
	
	private QuoteDemographics quoteDemographics;	
	

	@Valid
	private List<Applicant> applicant;
	
	private List<PlanProduct> productRating;
	

	public String getQuoteReferenceNumber() {
		return quoteReferenceNumber;
	}




	public void setQuoteReferenceNumber(String quoteReferenceNumber) {
		this.quoteReferenceNumber = quoteReferenceNumber;
	}




	public String getPremiumAmount() {
		return premiumAmount;
	}




	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}




	public String getProductOption() {
		return productOption;
	}




	public void setProductOption(String productOption) {
		this.productOption = productOption;
	}




	public QuoteDemographics getQuoteDemographics() {
		return quoteDemographics;
	}




	public void setQuoteDemographics(QuoteDemographics quoteDemographics) {
		this.quoteDemographics = quoteDemographics;
	}




	public List<Applicant> getApplicant() {
		return applicant;
	}




	public void setApplicant(List<Applicant> applicant) {
		this.applicant = applicant;
	}




	public List<PlanProduct> getProductRating() {
		return productRating;
	}




	public void setProductRating(List<PlanProduct> productRating) {
		this.productRating = productRating;
	}




	public Date getEffectiveDate() {
		return effectiveDate;
	}




	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}




	public Date getValidUptoDate() {
		return validUptoDate;
	}




	public void setValidUptoDate(Date validUptoDate) {
		this.validUptoDate = validUptoDate;
	}




	public String getLastModifiedBy() {
		return lastModifiedBy;
	}




	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}




	public Date getCreatedOn() {
		return createdOn;
	}




	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}




	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}




	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}




	public String getCreatedBy() {
		return createdBy;
	}




	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Broker getBroker() {
		return broker;
	}




	public void setBroker(Broker broker) {
		this.broker = broker;
	}




	@NotNull
	private Date effectiveDate;
	
	@NotNull
	private Date validUptoDate;

	
	@NotEmpty
	private String lastModifiedBy;
	
	@NotNull
	private Date createdOn;
	

	@NotNull
	private Date lastModifiedOn;

	@NotEmpty
	private String createdBy;
		
	@NotEmpty
	private String status;
	
	@Valid
	Broker broker;
	
	
	

	public Quote() {

	}


	


	
}
