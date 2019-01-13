package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class Csrelation implements Serializable{
	private int id;
	private int stuId;//'学员id'
	private int  classId;//'班级Id'
	private String csTime;//'进班时间'
	private int isChange;//'是否转班(1未转，2已转)'
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
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getCsTime() {
		return csTime;
	}
	public void setCsTime(String csTime) {
		this.csTime = csTime;
	}
	public int getIsChange() {
		return isChange;
	}
	public void setIsChange(int isChange) {
		this.isChange = isChange;
	}
	@Override
	public String toString() {
		return "Csrelation [id=" + id + ", stuId=" + stuId + ", classId=" + classId + ", csTime=" + csTime
				+ ", isChange=" + isChange + "]";
	}
	
	
}
