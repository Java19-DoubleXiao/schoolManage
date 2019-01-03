package com.accp.springmvc.pojo;

public class AcceptPerson {

	private int id;
	private int informId;
	private int acceptId;
	private String readTime;
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
		return "AcceptPerson [id=" + id + ", informId=" + informId + ", acceptId=" + acceptId + ", readTime=" + readTime
				+ "]";
	}
	
	
}
