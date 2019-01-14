package com.accp.spring.pojo;

import java.io.Serializable;

public class EventPerson implements Serializable{
	/**
	 * 事件参与人表
	 */
	private static final long serialVersionUID = 1L;
	private int personId;
	private int eventId;
	private int stuId;
	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		return "EventPerson [personId=" + personId + ", eventId=" + eventId + ", stuId=" + stuId + "]";
	}
	
	
	

}
