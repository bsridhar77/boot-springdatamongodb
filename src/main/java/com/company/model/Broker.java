package com.company.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Broker {

	@NotEmpty
	private String writingAgentTin;
	
	@NotEmpty
	private String writingAgencyTin;

	public String getWritingAgentTin() {
		return writingAgentTin;
	}

	public void setWritingAgentTin(String writingAgentTin) {
		this.writingAgentTin = writingAgentTin;
	}

	public String getWritingAgencyTin() {
		return writingAgencyTin;
	}

	public void setWritingAgencyTin(String writingAgencyTin) {
		this.writingAgencyTin = writingAgencyTin;
	}
	
	
	
}
