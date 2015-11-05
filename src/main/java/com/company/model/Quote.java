
package com.company.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quote { // extends AbstractDocument {

	
	@Id
	private String quoteReferenceNumber;


	public String getQuoteReferenceNumber() {
		return quoteReferenceNumber;
	}


	public void setQuoteReferenceNumber(String quoteReferenceNumber) {
		this.quoteReferenceNumber = quoteReferenceNumber;
	}

	
	private String agentWritingTIN;
	
	private String agencyWritingTIN;
	
	

	public String getAgentWritingTIN() {
		return agentWritingTIN;
	}


	public void setAgentWritingTIN(String agentWritingTIN) {
		this.agentWritingTIN = agentWritingTIN;
	}


	public String getAgencyWritingTIN() {
		return agencyWritingTIN;
	}


	public void setAgencyWritingTIN(String agencyWritingTIN) {
		this.agencyWritingTIN = agencyWritingTIN;
	}


	private List<Applicant> applicants;
	
	private List<ProductPlan> product;

	public List<ProductPlan> getProduct() {
		return product;
	}


	public void setProduct(List<ProductPlan> product) {
		this.product = product;
	}


	public List<Applicant> getApplicants() {
		return applicants;
	}


	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}


	private String productOption;
	


	private String status;
	
	private String createdByUser;
	
	private String modifiedByUser;
	
	
	
	
	


	public String getModifiedByUser() {
		return modifiedByUser;
	}


	public void setModifiedByUser(String modifiedByUser) {
		this.modifiedByUser = modifiedByUser;
	}


	public String getCreatedByUser() {
		return createdByUser;
	}


	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

/*
	public List<Applicant> getApplicants() {
		return applicants;
	}


	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}


	public Set<ProductPlan> getProduct() {
		return product;
	}


	public void setProduct(Set<ProductPlan> product) {
		this.product = product;
	}
*/

	public String getProductOption() {
		return productOption;
	}


	public void setProductOption(String productOption) {
		this.productOption = productOption;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPremiumAmount() {
		return premiumAmount;
	}


	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}


	private String premiumAmount;
	

	public Quote() {

	}


	
	private Date effectiveDate;
	private Date validUptoDate;
	
	private Date createdDate;
	private Date modifiedDate;


	public Date getValidUptoDate() {
		return validUptoDate;
	}


	public void setValidUptoDate(Date validUptoDate) {
		this.validUptoDate = validUptoDate;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public Date getEffectiveDate() {
		return effectiveDate;
	}


	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
}
