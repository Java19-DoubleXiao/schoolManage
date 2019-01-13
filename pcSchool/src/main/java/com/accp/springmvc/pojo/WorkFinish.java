package com.accp.springmvc.pojo;

public class WorkFinish {

	private int wfId;
	private int workId;
	private int wfScore;
	private int stuId;
	private String wfRemark;
	private String recordTime;
	private int recordPerson;
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
		return "WorkFinish [wfId=" + wfId + ", workId=" + workId + ", wfScore=" + wfScore + ", stuId=" + stuId
				+ ", wfRemark=" + wfRemark + ", recordTime=" + recordTime + ", recordPerson=" + recordPerson + "]";
	}
	
	
}
