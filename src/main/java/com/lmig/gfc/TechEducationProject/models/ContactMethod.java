package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactMethod {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String contactMethod;
	
	public ContactMethod() {}
	
	public ContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContactMethod() {
		return contactMethod;
	}

	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}

}
