package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MentorProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String mentorAvailability;
	private String mentorSkillSetExperience;
	private String mentorTimeFrameAvailable;
	private String mentorContactMethod;
	private String mentorBestContact;
	private Double mentorAvailabilityHours;

	public MentorProfile() {
	}

	public MentorProfile(String nNumber, String mentorAvailability, String mentorSkillSetExperience,
			String mentorTimeFrameAvailable, String mentorContactMethod, String mentorBestContact,
			Double mentorAvailabilityHours) {
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
