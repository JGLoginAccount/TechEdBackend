package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Request {

	@Id
	private String nNumber;
	private String menteeRequestedDate;
	private String menteeSkillRequested;
	private String menteeSkillOtherText;
	private String menteeTimeRequested;
	private String menteeHoursRequested;
	private String menteeRequestDescription;
	private String menteeRequestStatus;
	private String menteeCompletedSummary;
	private String menteeRequestedClosed;

	public Request() {

	}

	public Request(String nNumber, String menteeRequestedDate, String menteeSkillRequested, String menteeSkillOtherText,
			String menteeTimeRequested, String menteeHoursRequested, String menteeRequestDescription,
			String menteeRequestStatus, String menteeCompletedSummary, String menteeRequestedClosed) {
		this.nNumber = nNumber;
		this.menteeRequestedDate = menteeRequestedDate;
		this.menteeSkillRequested = menteeSkillRequested;
		this.menteeSkillOtherText = menteeSkillOtherText;
		this.menteeTimeRequested = menteeTimeRequested;
		this.menteeHoursRequested = menteeHoursRequested;
		this.menteeRequestDescription = menteeRequestDescription;
		this.menteeRequestStatus = menteeRequestStatus;
		this.menteeCompletedSummary = menteeCompletedSummary;
		this.menteeRequestedClosed = menteeRequestedClosed;
	}

	public String getMenteeRequestedDate() {
		return menteeRequestedDate;
	}

	public void setMenteeRequestedDate(String menteeRequestedDate) {
		this.menteeRequestedDate = menteeRequestedDate;
	}

	public String getMenteeSkillRequested() {
		return menteeSkillRequested;
	}

	public void setMenteeSkillRequested(String menteeSkillRequested) {
		this.menteeSkillRequested = menteeSkillRequested;
	}

	public String getMenteeSkillOtherText() {
		return menteeSkillOtherText;
	}

	public void setMenteeSkillOtherText(String menteeSkillOtherText) {
		this.menteeSkillOtherText = menteeSkillOtherText;
	}

	public String getMenteeTimeRequested() {
		return menteeTimeRequested;
	}

	public void setMenteeTimeRequested(String menteeTimeRequested) {
		this.menteeTimeRequested = menteeTimeRequested;
	}

	public String getMenteeHoursRequested() {
		return menteeHoursRequested;
	}

	public void setMenteeHoursRequested(String menteeHoursRequested) {
		this.menteeHoursRequested = menteeHoursRequested;
	}

	public String getMenteeRequestDescription() {
		return menteeRequestDescription;
	}

	public void setMenteeRequestDescription(String menteeRequestDescription) {
		this.menteeRequestDescription = menteeRequestDescription;
	}

	public String getMenteeRequestStatus() {
		return menteeRequestStatus;
	}

	public void setMenteeRequestStatus(String menteeRequestStatus) {
		this.menteeRequestStatus = menteeRequestStatus;
	}

	public String getMenteeCompletedSummary() {
		return menteeCompletedSummary;
	}

	public void setMenteeCompletedSummary(String menteeCompletedSummary) {
		this.menteeCompletedSummary = menteeCompletedSummary;
	}

	public String getMenteeRequestedClosed() {
		return menteeRequestedClosed;
	}

	public void setMenteeRequestedClosed(String menteeRequestedClosed) {
		this.menteeRequestedClosed = menteeRequestedClosed;
	}

	public String getnNumber() {
		return nNumber;
	}

	public void setnNumber(String nNumber) {
		this.nNumber = nNumber;
	}

}
