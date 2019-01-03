package com.accp.springmvc.pojo;

public class EventTrack {

	private int etId;
	private int eventId;
	private int talkId;
	private int beTalkId;
	private String etContent;
	private String etRemark;
	private String etTime;
	private int  etPerson;
	public int getEtId() {
		return etId;
	}
	public void setEtId(int etId) {
		this.etId = etId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getTalkId() {
		return talkId;
	}
	public void setTalkId(int talkId) {
		this.talkId = talkId;
	}
	public int getBeTalkId() {
		return beTalkId;
	}
	public void setBeTalkId(int beTalkId) {
		this.beTalkId = beTalkId;
	}
	public String getEtContent() {
		return etContent;
	}
	public void setEtContent(String etContent) {
		this.etContent = etContent;
	}
	public String getEtRemark() {
		return etRemark;
	}
	public void setEtRemark(String etRemark) {
		this.etRemark = etRemark;
	}
	public String getEtTime() {
		return etTime;
	}
	public void setEtTime(String etTime) {
		this.etTime = etTime;
	}
	public int getEtPerson() {
		return etPerson;
	}
	public void setEtPerson(int etPerson) {
		this.etPerson = etPerson;
	}
	@Override
	public String toString() {
		return "EventTrack [etId=" + etId + ", eventId=" + eventId + ", talkId=" + talkId + ", beTalkId=" + beTalkId
				+ ", etContent=" + etContent + ", etRemark=" + etRemark + ", etTime=" + etTime + ", etPerson="
				+ etPerson + "]";
	}
	
	
	
}
