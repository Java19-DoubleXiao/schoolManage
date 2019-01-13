package com.accp.springmvc.pojo;

public class Notice {

	private int noticeId;
	private int publishId;
	private String publishTime;
	private int noticeType;
	private String noticeTitle;
	private String noticeContent;
	private int updPerson;
	private String updTime;
	private int noticeStates;
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public int getPublishId() {
		return publishId;
	}
	public void setPublishId(int publishId) {
		this.publishId = publishId;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public int getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(int noticeType) {
		this.noticeType = noticeType;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public int getUpdPerson() {
		return updPerson;
	}
	public void setUpdPerson(int updPerson) {
		this.updPerson = updPerson;
	}
	public String getUpdTime() {
		return updTime;
	}
	public void setUpdTime(String updTime) {
		this.updTime = updTime;
	}
	public int getNoticeStates() {
		return noticeStates;
	}
	public void setNoticeStates(int noticeStates) {
		this.noticeStates = noticeStates;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", publishId=" + publishId + ", publishTime=" + publishTime
				+ ", noticeType=" + noticeType + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
				+ ", updPerson=" + updPerson + ", updTime=" + updTime + ", noticeStates=" + noticeStates + "]";
	}
	
	
}
