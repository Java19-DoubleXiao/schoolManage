package com.accp.spring.pojo;

import java.io.Serializable;

public class Inform implements Serializable{
	
	/**
	 *  //通知表	（Inform）	 
	 */
	private static final long serialVersionUID = -5138364589344154074L;
	private int informId;//通知Id
	private int informTypeId;//通知类型Id	关联通知类型表
	private String informContent;//通知内容	
	private String informTime;//	发通知时间	时间自动生成
	private int sendPerson;//	发通知人	
	private String acceptPerson;//接收通知班级①
	private int isDel;
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
	
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	@Override
	public String toString() {
		return "Inform [informId=" + informId + ", informTypeId=" + informTypeId + ", informContent=" + informContent
				+ ", informTime=" + informTime + ", sendPerson=" + sendPerson + ", acceptPerson=" + acceptPerson
				+ ", isDel=" + isDel + "]";
	}
	
	

}
