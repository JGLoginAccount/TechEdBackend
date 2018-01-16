package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequestStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String requestStatus;
	
	public RequestStatus() {}

	public RequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
}
