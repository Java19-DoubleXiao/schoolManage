package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class Homework implements Serializable {
    private int workId;//作业id
    private String workContent;//作业内容
    private String workTime;//作业发布时间
    private int teaId;//作业发布人 教员id
    private String classId;//作业被布置班级 班级id
    private String submitTime;//作业提交时间
    
   
    
    private int count;

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
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
