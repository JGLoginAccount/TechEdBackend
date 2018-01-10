package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RequestForm {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long requestId;
	@Column(length = 8)
	private String NNUMBER;
	@Column(length = 15)
	private String userNameLast;
	@Column(length = 15)
	private String userNameFirst;
	@Column(length = 10)
	private String userOffice;
	@Column(length = 10)
	private String userDepartment;
	@Column(length = 10)
	private String market;
	@Column(length = 20)
	private String userBestMethod;
	@Column(length = 30)
	private String userBestMethodDescription;
	
	
	
	public RequestForm() {
		
	}



	public RequestForm(String NNUMBER, String userNameLast, String userNameFirst, String userOffice,
			String userDepartment, String market, String userBestMethod, String userBestMethodDescription) {
		super();
		this.NNUMBER = NNUMBER;
		this.userNameLast = userNameLast;
		this.userNameFirst = userNameFirst;
		this.userOffice = userOffice;
		this.userDepartment = userDepartment;
		this.market = market;
		this.userBestMethod = userBestMethod;
		this.userBestMethodDescription = userBestMethodDescription;
	}



	public String getNNUMBER() {
		return NNUMBER;
	}



	public void setNNUMBER(String nNUMBER) {
		NNUMBER = nNUMBER;
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



	public String getMarket() {
		return market;
	}



	public void setMarket(String market) {
		this.market = market;
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



	public long getRequestId() {
		return requestId;
	}



	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
	
	
	
	
	
	
}
