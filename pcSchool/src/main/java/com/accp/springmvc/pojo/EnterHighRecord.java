package com.accp.springmvc.pojo;

public class EnterHighRecord {

	private int id;
	private int classId;
	private int gId;
	private String enterTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
	@Override
	public String toString() {
		return "EnterHighRecord [id=" + id + ", classId=" + classId + ", gId=" + gId + ", enterTime=" + enterTime + "]";
	}
	
	
}
