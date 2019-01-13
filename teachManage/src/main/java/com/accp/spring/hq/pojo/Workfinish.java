package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class Workfinish implements Serializable{
    private int wfId;
    private int workId;//作业id
    private int wfScore;//作业完成分数
    private int stuId;//学员id
    private String wfRemark;//备注
    private String recordTime;//检查登记时间
    private int recordPerson;//登记人
	public int getWfId() {
		return wfId;
	}
	public void setWfId(int wfId) {
		this.wfId = wfId;
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public int getWfScore() {
		return wfScore;
	}
	public void setWfScore(int wfScore) {
		this.wfScore = wfScore;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getWfRemark() {
		return wfRemark;
	}
	public void setWfRemark(String wfRemark) {
		this.wfRemark = wfRemark;
	}
	public String getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
	public int getRecordPerson() {
		return recordPerson;
	}
	public void setRecordPerson(int recordPerson) {
		this.recordPerson = recordPerson;
	}
	@Override
	public String toString() {
		return "Workfinish [wfId=" + wfId + ", workId=" + workId + ", wfScore=" + wfScore + ", stuId=" + stuId
				+ ", wfRemark=" + wfRemark + ", recordTime=" + recordTime + ", recordPerson=" + recordPerson + "]";
	}
	
    
}
