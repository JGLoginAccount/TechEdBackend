package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String nNumber;
	private String userNameLast;
	private String userNameFirst;
	private String userOffice;
	private String userDepartment;
	private String userMarket;
	private String userBestMethod;
	private String userBestMethodDescription;

	public User() {

	}

	public User(String nNumber, String userNameLast, String userNameFirst, String userOffice, String userDepartment,
			String userMarket, String userBestMethod, String userBestMethodDescription) {
		this.nNumber = nNumber;
		this.userNameLast = userNameLast;
		this.userNameFirst = userNameFirst;
		this.userOffice = userOffice;
		this.userDepartment = userDepartment;
		this.userMarket = userMarket;
		this.userBestMethod = userBestMethod;
		this.userBestMethodDescription = userBestMethodDescription;
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

	public String getUserBestMethod() {
		return userBestMethod;
	}

	public void setUserBestMethod(String userBestMethod) {
		this.userBestMethod = userBestMethod;
	}

	public String getUserBestMethodDescription() {
		return userBestMethodDescription;
	}

	public void setUserBestMethodDescription(String userBestMethodDescription) {
		this.userBestMethodDescription = userBestMethodDescription;
	}

}
