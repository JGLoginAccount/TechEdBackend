package com.lmig.gfc.TechEducationProject.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
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
	private List<UserRequestForm> requests;

	@OneToOne
	private Profile profile;

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
}
