package com.company.model;

public class Applicant {

	
	String firstName;
	String lastName;
	boolean tobaccoUserFlag;
	String emailAddress;
	String applicantType;
	boolean medicalCoverageFlag;
	boolean dentalCoverageFlag;
	boolean visionCoverageFlag;
	int totalFamilyMembers;
	double subsidy;
	double annualHousehold;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isTobaccoUserFlag() {
		return tobaccoUserFlag;
	}
	public void setTobaccoUserFlag(boolean tobaccoUserFlag) {
		this.tobaccoUserFlag = tobaccoUserFlag;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	public boolean isMedicalCoverageFlag() {
		return medicalCoverageFlag;
	}
	public void setMedicalCoverageFlag(boolean medicalCoverageFlag) {
		this.medicalCoverageFlag = medicalCoverageFlag;
	}
	public boolean isDentalCoverageFlag() {
		return dentalCoverageFlag;
	}
	public void setDentalCoverageFlag(boolean dentalCoverageFlag) {
		this.dentalCoverageFlag = dentalCoverageFlag;
	}
	public boolean isVisionCoverageFlag() {
		return visionCoverageFlag;
	}
	public void setVisionCoverageFlag(boolean visionCoverageFlag) {
		this.visionCoverageFlag = visionCoverageFlag;
	}
	public int getTotalFamilyMembers() {
		return totalFamilyMembers;
	}
	public void setTotalFamilyMembers(int totalFamilyMembers) {
		this.totalFamilyMembers = totalFamilyMembers;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	public double getAnnualHousehold() {
		return annualHousehold;
	}
	public void setAnnualHousehold(double annualHousehold) {
		this.annualHousehold = annualHousehold;
	}
}
