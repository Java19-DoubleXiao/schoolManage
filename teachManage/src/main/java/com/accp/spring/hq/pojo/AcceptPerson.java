package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class AcceptPerson implements Serializable{

	/**
	 *  // 通知接收人表	（AcceptPerson）
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int informId;//通知Id	
	private int acceptId; //接收人Id	家长Id、学员Id
	private int acceptType;//学员1 老师2  家长3
	private String readTime;//阅读时间①	第一次阅读时间，为null表示未读
	private int isDel;
	
	public int getAcceptType() {
		return acceptType;
	}


	public void setAcceptType(int acceptType) {
		this.acceptType = acceptType;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getInformId() {
		return informId;
	}


	public void setInformId(int informId) {
		this.informId = informId;
	}


	public int getAcceptId() {
		return acceptId;
	}


	public void setAcceptId(int acceptId) {
		this.acceptId = acceptId;
	}


	public String getReadTime() {
		return readTime;
	}


	public void setReadTime(String readTime) {
		this.readTime = readTime;
	}


	public int getIsDel() {
		return isDel;
	}


	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}


	@Override
	public String toString() {
		return "AcceptPerson [id=" + id + ", informId=" + informId + ", acceptId=" + acceptId + ", acceptType="
				+ acceptType + ", readTime=" + readTime + ", isDel=" + isDel + "]";
	}

	

}
