package com.lmig.gfc.TechEducationProject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeFrame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String timeFrame;
	
	public TimeFrame() {}

	public TimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
}
