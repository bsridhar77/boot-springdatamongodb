package com.company.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Applicant {

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private String gender;

	@NotNull
	private Date dateOfBirth;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@NotEmpty
	@Email
	private String emailAddress;
	
	@NotEmpty
	private String applicantType;

	@NotEmpty
	private String tobaccoUserFlag;
	
	@NotEmpty
	private String medicalCoverageFlag;
	
	@NotEmpty
	private String dentalCoverageFlag;
	
	@NotEmpty
	private String visionCoverageFlag;

	@NotNull
	private int totalFamilyMembers;

	@NotEmpty
	private String subsidyAmount;

	@NotEmpty
	private String annualHouseholdIncome;
	
	
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public String getSubsidyAmount() {
		return subsidyAmount;
	}

	public void setSubsidyAmount(String subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}

	public String getAnnualHouseholdIncome() {
		return annualHouseholdIncome;
	}

	public void setAnnualHouseholdIncome(String annualHouseholdIncome) {
		this.annualHouseholdIncome = annualHouseholdIncome;
	}

	public String getTobaccoUserFlag() {
		return tobaccoUserFlag;
	}

	public void setTobaccoUserFlag(String tobaccoUserFlag) {
		this.tobaccoUserFlag = tobaccoUserFlag;
	}

	public String getMedicalCoverageFlag() {
		return medicalCoverageFlag;
	}

	public void setMedicalCoverageFlag(String medicalCoverageFlag) {
		this.medicalCoverageFlag = medicalCoverageFlag;
	}

	public String getDentalCoverageFlag() {
		return dentalCoverageFlag;
	}

	public void setDentalCoverageFlag(String dentalCoverageFlag) {
		this.dentalCoverageFlag = dentalCoverageFlag;
	}

	public String getVisionCoverageFlag() {
		return visionCoverageFlag;
	}

	public void setVisionCoverageFlag(String visionCoverageFlag) {
		this.visionCoverageFlag = visionCoverageFlag;
	}

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

	public int getTotalFamilyMembers() {
		return totalFamilyMembers;
	}

	public void setTotalFamilyMembers(int totalFamilyMembers) {
		this.totalFamilyMembers = totalFamilyMembers;
	}

}
