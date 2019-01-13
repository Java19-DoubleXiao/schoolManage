package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class Examination  implements Serializable{
    private int examId;
    private int examPaperId;//试卷Id
    private String classId;//参加考试的班级
    private int teaId;//试卷发布人
    private String epSendTime;//试卷发布时间
    private String startTime;//考试开始时间
    private String endTime;//考试结束时间
    
    private String paperName;//试卷名称
    
    
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
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
				+ teaId + ", epSendTime=" + epSendTime + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", paperName=" + paperName + "]";
	}
	
    
    
}
