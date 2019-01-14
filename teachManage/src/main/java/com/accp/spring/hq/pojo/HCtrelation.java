package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class HCtrelation implements Serializable{
	 private int id;
	 private int classId;//'班级Id'
	 private int userId;//'老师Id'
	 private String ctTime;//'开始带班时间'
	 
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
		return "Ctrelation [id=" + id + ", classId=" + classId + ", userId=" + userId + ", ctTime=" + ctTime + "]";
	}
	 
	
	
	 
}
