package com.lmig.gfc.TechEducationProject.models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;






@Entity
public class Skills {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String skills;
	@ManyToMany(mappedBy="mentorSkills",  cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JsonIgnore
	private List<MentorProfile> mentorProfile;
	
	public Skills() {
	}
	
	public Skills(String skills) {
		this.skills=skills;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}

	public List<MentorProfile> getMentorProfile() {
		return mentorProfile;
	}

	public void setMentorProfile(List<MentorProfile> mentorProfile) {
		this.mentorProfile = mentorProfile;
	}

	
	
	
	
	
	
	

}
