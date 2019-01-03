package com.accp.springmvc.pojo;

public class CsRelation {

	private int id;
	private int stuId;
	private int classId;
	private String csTime;
	private int isChange;
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
		return "CsRelation [id=" + id + ", stuId=" + stuId + ", classId=" + classId + ", csTime=" + csTime
				+ ", isChange=" + isChange + "]";
	}
	
	
}
