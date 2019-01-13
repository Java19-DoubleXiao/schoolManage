package com.accp.spring.xjq.pojo;

import java.io.Serializable;

public class RegisterLeaveVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1073962459889169364L;
	private int id;
	private int stuId;
	private String startTime;
	private String endTime;
	private String writeTime;
	private int dormMangeId;
	private String recordTime;
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
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	public int getDormMangeId() {
		return dormMangeId;
	}
	public void setDormMangeId(int dormMangeId) {
		this.dormMangeId = dormMangeId;
	}
	public String getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
	@Override
	public String toString() {
		return "RegisterLeaveVo [id=" + id + ", stuId=" + stuId + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", writeTime=" + writeTime + ", dormMangeId=" + dormMangeId + ", recordTime=" + recordTime + "]";
	}
	
	
	
	

}
