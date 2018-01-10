package com.lmig.gfc.TechEducationProject.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="masterUser")
public class User {

	@Id
	private String nNumber;
	private String userNameLast;
	private String userNameFirst;
	private String userOffice;
	private String userDepartment;
	private String userMarket;

	public User() {
	}

	@OneToMany(mappedBy = "user")
	private List<Request> requests;

	@OneToOne(cascade=CascadeType.ALL)
	private MentorProfile profile;

	public User(String nNumber, String userNameLast, String userNameFirst, String userOffice, String userDepartment,
			String userMarket) {
		this.nNumber = nNumber;
		this.userNameLast = userNameLast;
		this.userNameFirst = userNameFirst;
		this.userOffice = userOffice;
		this.userDepartment = userDepartment;
		this.userMarket = userMarket;
	}

	public String getnNumber() {
		return nNumber;
	}

	public void setnNumber(String nNumber) {
		this.nNumber = nNumber;
	}

	public String getUserNameLast() {
		return userNameLast;
	}

	public void setUserNameLast(String userNameLast) {
		this.userNameLast = userNameLast;
	}

	public String getUserNameFirst() {
		return userNameFirst;
	}

	public void setUserNameFirst(String userNameFirst) {
		this.userNameFirst = userNameFirst;
	}

	public String getUserOffice() {
		return userOffice;
	}

	public void setUserOffice(String userOffice) {
		this.userOffice = userOffice;
	}

	public String getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}

	public String getUserMarket() {
		return userMarket;
	}

	public void setUserMarket(String userMarket) {
		this.userMarket = userMarket;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	
	public MentorProfile getProfile() {
		return profile;
	}

	public void setProfile(MentorProfile profile) {
		this.profile = profile;
	}
}
