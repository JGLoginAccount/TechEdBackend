package com.lmig.gfc.TechEducationProject.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Temporal(TemporalType.DATE)
	@JsonFormat(timezone = "EST")
	@CreationTimestamp
	private Date menteeRequestedDate;
	private String nNumber;
	private String menteeSkillRequested;
	private String menteeSkillOtherText;
	private String menteeTimeRequested;
	private String menteeHoursRequested; 
	private String menteeRequestDescription;
	private String menteeRequestStatus;
	private String menteeCompletedSummary;

	public Request() {
	}

	public Request(String nNumber, Date menteeRequestedDate, String menteeSkillRequested, String menteeSkillOtherText,
			String menteeTimeRequested, String menteeHoursRequested, String menteeRequestDescription,
			String menteeRequestStatus, String menteeCompletedSummary) {
		this.nNumber = nNumber;
		this.menteeRequestedDate = menteeRequestedDate;
		this.menteeSkillRequested = menteeSkillRequested;
		this.menteeSkillOtherText = menteeSkillOtherText;
		this.menteeTimeRequested = menteeTimeRequested;
		this.menteeHoursRequested = menteeHoursRequested;
		this.menteeRequestDescription = menteeRequestDescription;
		this.menteeRequestStatus = menteeRequestStatus;
		this.menteeCompletedSummary = menteeCompletedSummary;
	}

	public Date getMenteeRequestedDate() {
		return menteeRequestedDate;
	}

	public void setMenteeRequestedDate(Date menteeRequestedDate) {
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

	public String getnNumber() {
		return nNumber;
	}

	public void setnNumber(String nNumber) {
		this.nNumber = nNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
