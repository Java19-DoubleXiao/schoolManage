package com.accp.springmvc.pojo;

public class EventManage {

	private int eventId;
	private int stuId;
	private String eventContent;
	private String eventRemark;
	private String startTime;
	private int eventStates;
	private int startPerson;
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
	public String getEventContent() {
		return eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}
	public String getEventRemark() {
		return eventRemark;
	}
	public void setEventRemark(String eventRemark) {
		this.eventRemark = eventRemark;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getEventStates() {
		return eventStates;
	}
	public void setEventStates(int eventStates) {
		this.eventStates = eventStates;
	}
	public int getStartPerson() {
		return startPerson;
	}
	public void setStartPerson(int startPerson) {
		this.startPerson = startPerson;
	}
	@Override
	public String toString() {
		return "EventManage [eventId=" + eventId + ", stuId=" + stuId + ", eventContent=" + eventContent
				+ ", eventRemark=" + eventRemark + ", startTime=" + startTime + ", eventStates=" + eventStates
				+ ", startPerson=" + startPerson + "]";
	}
	
	
}
