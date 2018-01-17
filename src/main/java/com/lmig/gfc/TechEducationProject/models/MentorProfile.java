package com.lmig.gfc.TechEducationProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MentorProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String mentorAvailability;
	private String mentorNnumber;
	private String mentorFirstName;
	private String mentorLastName;
	private String mentorOffice;
	private String mentorTimeFrameAvailable;
	private String mentorContactMethod;
	private String mentorBestContact;
	private Double mentorAvailabilityHours;
	@ManyToMany
	private List<Skills> mentorSkills;

	public MentorProfile() {
	}

	public MentorProfile(String mentorNnumber, String mentorFirstName, String mentorLastName, String mentorOffice,
			String mentorAvailability, String mentorTimeFrameAvailable, Double mentorAvailabilityHours,
			String mentorContactMethod, String mentorBestContact) {

		this.mentorNnumber = mentorNnumber;
		this.mentorFirstName = mentorFirstName;
		this.mentorLastName = mentorLastName;
		this.mentorOffice = mentorOffice;
		this.mentorAvailability = mentorAvailability;
		this.mentorTimeFrameAvailable = mentorTimeFrameAvailable;
		this.mentorAvailabilityHours = mentorAvailabilityHours;
		this.mentorContactMethod = mentorContactMethod;
		this.mentorBestContact = mentorBestContact;
	}

	public String getMentorAvailability() {
		return mentorAvailability;
	}

	public void setMentorAvailability(String mentorAvailability) {
		this.mentorAvailability = mentorAvailability;
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

	public List<Skills> getMentorSkills() {
		return mentorSkills;
	}

	public void setMentorSkills(List<Skills> mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	public String getMentorNnumber() {
		return mentorNnumber;
	}

	public void setMentorNnumber(String mentorNnumber) {
		this.mentorNnumber = mentorNnumber;
	}

	public String getMentorFirstName() {
		return mentorFirstName;
	}

	public void setMentorFirstName(String mentorFirstName) {
		this.mentorFirstName = mentorFirstName;
	}

	public String getMentorLastName() {
		return mentorLastName;
	}

	public void setMentorLastName(String mentorLastName) {
		this.mentorLastName = mentorLastName;
	}

	public String getMentorOffice() {
		return mentorOffice;
	}

	public void setMentorOffice(String mentorOffice) {
		this.mentorOffice = mentorOffice;
	}

}

