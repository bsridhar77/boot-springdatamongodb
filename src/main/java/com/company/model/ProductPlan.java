package com.company.model;

import org.hibernate.validator.constraints.NotEmpty;

public class ProductPlan {

	
	@NotEmpty
	private String contractCode;
	
	@NotEmpty
	private String planCode;
	
	@NotEmpty
	private String productCode;
	
	@NotEmpty
	private String subsidizedRatingAmount;
	
	@NotEmpty
	private String totalRatingAmount;
	
	private PlanBenefits planBenefits;
	
	public PlanBenefits getPlanBenefits() {
		return planBenefits;
	}
	public void setPlanBenefits(PlanBenefits planBenefits) {
		this.planBenefits = planBenefits;
	}
	public String getSubsidizedMonthlyPremium() {
		return subsidizedRatingAmount;
	}
	public void setSubsidizedMonthlyPremium(String subsidizedMonthlyPremium) {
		this.subsidizedRatingAmount = subsidizedMonthlyPremium;
	}
	public String getTotalMonthlyPremium() {
		return totalRatingAmount;
	}
	public void setTotalMonthlyPremium(String totalMonthlyPremium) {
		this.totalRatingAmount = totalMonthlyPremium;
	}
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
}
