package com.accp.springmvc.pojo;

public class CtRelation {

	private int id;
	private int classId;
	private int userId;
	private String ctTime;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCtTime() {
		return ctTime;
	}
	public void setCtTime(String ctTime) {
		this.ctTime = ctTime;
	}
	@Override
	public String toString() {
		return "CtRelation [id=" + id + ", classId=" + classId + ", userId=" + userId + ", ctTime=" + ctTime + "]";
	}
	
	
}
