package com.accp.springmvc.pojo;

public class Homework {

	private int workId;
	private String workContent;
	private String workTime;
	private int teaId;
	private String classId;
	private String submitTime;
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public String getWorkContent() {
		return workContent;
	}
	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	@Override
	public String toString() {
		return "Homework [workId=" + workId + ", workContent=" + workContent + ", workTime=" + workTime + ", teaId="
				+ teaId + ", classId=" + classId + ", submitTime=" + submitTime + "]";
	}
	
	
}
