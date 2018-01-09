package com.lmig.gfc.TechEducationProject.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;






@Entity
public class Skills {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String skills;
	
	
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
	
	
	
	
	
	
	

}
