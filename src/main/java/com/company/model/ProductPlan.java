package com.company.model;

public class ProductPlan {

	
	private String contractCode;
	private String planCode;
	private String productCode;
	
	private String subsidizedMonthlyPremium;
	private String totalMonthlyPremium;
	
	private PlanBenefits planBenefits;
	
	public PlanBenefits getPlanBenefits() {
		return planBenefits;
	}
	public void setPlanBenefits(PlanBenefits planBenefits) {
		this.planBenefits = planBenefits;
	}
	public String getSubsidizedMonthlyPremium() {
		return subsidizedMonthlyPremium;
	}
	public void setSubsidizedMonthlyPremium(String subsidizedMonthlyPremium) {
		this.subsidizedMonthlyPremium = subsidizedMonthlyPremium;
	}
	public String getTotalMonthlyPremium() {
		return totalMonthlyPremium;
	}
	public void setTotalMonthlyPremium(String totalMonthlyPremium) {
		this.totalMonthlyPremium = totalMonthlyPremium;
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
