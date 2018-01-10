package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Profile {

	@Id
	private String nNumber;
	private String mentorAvailability;
	private String mentorSkillSetExperience;
	private String mentorTimeFrameAvailable;
	private String mentorContactMethod;
	private String mentorBestContact;
	private Double mentorAvailabilityHours;

	public Profile() {
	}

	@OneToOne(mappedBy = "profile")
	private User user;

	public Profile(String nNumber, String mentorAvailability, String mentorSkillSetExperience,
			String mentorTimeFrameAvailable, String mentorContactMethod, String mentorBestContact,
			Double mentorAvailabilityHours) {
		this.nNumber = nNumber;
		this.mentorAvailability = mentorAvailability;
		this.mentorSkillSetExperience = mentorSkillSetExperience;
		this.mentorTimeFrameAvailable = mentorTimeFrameAvailable;
		this.mentorContactMethod = mentorContactMethod;
		this.mentorBestContact = mentorBestContact;
		this.mentorAvailabilityHours = mentorAvailabilityHours;
	}

	public String getMentorAvailability() {
		return mentorAvailability;
	}

	public void setMentorAvailability(String mentorAvailability) {
		this.mentorAvailability = mentorAvailability;
	}

	public String getMentorSkillSetExperience() {
		return mentorSkillSetExperience;
	}

	public void setMentorSkillSetExperience(String mentorSkillSetExperience) {
		this.mentorSkillSetExperience = mentorSkillSetExperience;
	}

	public String getMentorTimeFrameAvailable() {
		return mentorTimeFrameAvailable;
	}

	public void setMentorTimeFrameAvailable(String mentorTimeFrameAvailable) {
		this.mentorTimeFrameAvailable = mentorTimeFrameAvailable;
	}

	public Double getMentorAvailabilityHours() {
		return mentorAvailabilityHours;
	}

	public void setMentorAvailabilityHours(Double mentorAvailabilityHours) {
		this.mentorAvailabilityHours = mentorAvailabilityHours;
	}

	public String getnNumber() {
		return nNumber;
	}

	public void setnNumber(String nNumber) {
		this.nNumber = nNumber;
	}

	public String getMentorContactMethod() {
		return mentorContactMethod;
	}

	public void setMentorContactMethod(String mentorContactMethod) {
		this.mentorContactMethod = mentorContactMethod;
	}

	public String getMentorBestContact() {
		return mentorBestContact;
	}

	public void setMentorBestContact(String mentorBestContact) {
		this.mentorBestContact = mentorBestContact;
	}

}
