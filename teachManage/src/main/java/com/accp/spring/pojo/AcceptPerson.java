package com.accp.spring.pojo;

import java.io.Serializable;

public class AcceptPerson implements Serializable{

	/**
	 *  // 通知接收人表	（AcceptPerson）
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int informId;//通知Id	
	private int acceptId; //接收人Id	家长Id、学员Id
	private String readTime;//阅读时间①	第一次阅读时间，为null表示未读
	
	
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


	@Override
	public String toString() {
		return "AcceptPerson [acceptId=" + acceptId + ", id=" + id + ", informId=" + informId + ", readTime=" + readTime
				+ "]";
	}
	
	
	
	/*
	 通知接收人表	（AcceptPerson）	 	 
字段	类型	字段描述	备注
id	int	Id	 
informId	int	通知Id	 
acceptId	int	接收人Id	家长Id、学员Id
readTime	datetime	阅读时间①	第一次阅读时间，为null表示未读
	 */
	

}
