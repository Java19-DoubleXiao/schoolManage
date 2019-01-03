package com.accp.springmvc.pojo;

public class Inform {

	private int informId;
	private int informTypeId;
	private String informContent;
	private String informTime;
	private int sendPerson;
	private String acceptPerson;
	public int getInformId() {
		return informId;
	}
	public void setInformId(int informId) {
		this.informId = informId;
	}
	public int getInformTypeId() {
		return informTypeId;
	}
	public void setInformTypeId(int informTypeId) {
		this.informTypeId = informTypeId;
	}
	public String getInformContent() {
		return informContent;
	}
	public void setInformContent(String informContent) {
		this.informContent = informContent;
	}
	public String getInformTime() {
		return informTime;
	}
	public void setInformTime(String informTime) {
		this.informTime = informTime;
	}
	public int getSendPerson() {
		return sendPerson;
	}
	public void setSendPerson(int sendPerson) {
		this.sendPerson = sendPerson;
	}
	public String getAcceptPerson() {
		return acceptPerson;
	}
	public void setAcceptPerson(String acceptPerson) {
		this.acceptPerson = acceptPerson;
	}
	@Override
	public String toString() {
		return "Inform [informId=" + informId + ", informTypeId=" + informTypeId + ", informContent=" + informContent
				+ ", informTime=" + informTime + ", sendPerson=" + sendPerson + ", acceptPerson=" + acceptPerson + "]";
	}
	
	
}
