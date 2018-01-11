package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//private MentorProfile mentorProfile;
	private String  mentorSkillSetExperience ;
	
	
	public MentorSkills() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//public MentorProfile getMentorprofile() {
	//	return mentorProfile;
	//}
	//public void setMentorprofile(MentorProfile mentorprofile) {
	//	this.mentorProfile = mentorprofile;
	//}
	public String getMentorSkillSetExperience() {
		return mentorSkillSetExperience;
	}
	public void setMentorSkillSetExperience(String mentorSkillSetExperience) {
		this.mentorSkillSetExperience = mentorSkillSetExperience;
	}

}
