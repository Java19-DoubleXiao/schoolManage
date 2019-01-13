package com.accp.springmvc.pojo;

public class Knowledge {

	private int knowId;
	private String knowName;
	private int courseId;
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public String getKnowName() {
		return knowName;
	}
	public void setKnowName(String knowName) {
		this.knowName = knowName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Knowledge [knowId=" + knowId + ", knowName=" + knowName + ", courseId=" + courseId + "]";
	}
	
	
}
