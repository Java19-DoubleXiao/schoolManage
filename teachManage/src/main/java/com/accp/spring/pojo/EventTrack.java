package com.accp.spring.pojo;

import java.io.Serializable;

public class EventTrack implements Serializable{
	
	/**
	 *   //事件跟踪过程表	EventTrack
	 */
	private static final long serialVersionUID = -3826179112566683979L;
	private int etId;
	private int eventId;//事件id	
	private int talkId;//沟通人	
	private int beTalkId;//跟谁沟通	
	private String etContent;//沟通内容	
	private String etRemark;//备注	
	private String etTime;//事件记录时间	 	
	private int etPerson;//事件记录人 
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
	
	

	/**
	 * 事件跟踪过程表	EventTrack	 	 
字段	类型	字段描述	备注
etId	int	Id	 
eventId	int	事件id	
talkId	int	沟通人	
beTalkId	int	跟谁沟通	
etContent	Varchar(500)	沟通内容	
etRemark	Varchar(500)	备注	
etTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	事件记录时间	 
etPerson	int	事件记录人	
	 */
}
