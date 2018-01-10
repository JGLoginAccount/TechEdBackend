package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {

	@Id
	private String nNumber;
	private String mentorAvailability;
	private String mentorSkillSetExperience;
	private String mentorTimeFrameAvailable;
	private String mentorAvailabilityHours;

	public Profile() {

	}

	public Profile(String nNumber, String mentorAvailability, String mentorSkillSetExperience,
			String mentorTimeFrameAvailable, String mentorAvailabilityHours) {
		this.nNumber = nNumber;
		this.mentorAvailability = mentorAvailability;
		this.mentorSkillSetExperience = mentorSkillSetExperience;
		this.mentorTimeFrameAvailable = mentorTimeFrameAvailable;
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

	public String getMentorAvailabilityHours() {
		return mentorAvailabilityHours;
	}

	public void setMentorAvailabilityHours(String mentorAvailabilityHours) {
		this.mentorAvailabilityHours = mentorAvailabilityHours;
	}

	public String getnNumber() {
		return nNumber;
	}

	public void setnNumber(String nNumber) {
		this.nNumber = nNumber;
	}

}
