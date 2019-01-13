package com.accp.springmvc.pojo;

public class Examination {

	private int examId;
	private int examPaperId;
	private String classId;
	private int teaId;
	private String epSendTime;
	private String startTime;
	private String endTime;
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getExamPaperId() {
		return examPaperId;
	}
	public void setExamPaperId(int examPaperId) {
		this.examPaperId = examPaperId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getEpSendTime() {
		return epSendTime;
	}
	public void setEpSendTime(String epSendTime) {
		this.epSendTime = epSendTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Examination [examId=" + examId + ", examPaperId=" + examPaperId + ", classId=" + classId + ", teaId="
				+ teaId + ", epSendTime=" + epSendTime + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}
