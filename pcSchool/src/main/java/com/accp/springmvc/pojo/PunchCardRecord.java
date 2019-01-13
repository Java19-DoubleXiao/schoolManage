package com.accp.springmvc.pojo;

public class PunchCardRecord {

	private int id;
	private int stuId;
	private String punchTime;
	private int recordPerson;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getPunchTime() {
		return punchTime;
	}
	public void setPunchTime(String punchTime) {
		this.punchTime = punchTime;
	}
	public int getRecordPerson() {
		return recordPerson;
	}
	public void setRecordPerson(int recordPerson) {
		this.recordPerson = recordPerson;
	}
	@Override
	public String toString() {
		return "PunchCardRecord [id=" + id + ", stuId=" + stuId + ", punchTime=" + punchTime + ", recordPerson="
				+ recordPerson + "]";
	}
	
	
}
