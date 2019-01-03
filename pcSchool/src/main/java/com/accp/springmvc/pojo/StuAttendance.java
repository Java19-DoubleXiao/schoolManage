package com.accp.springmvc.pojo;

public class StuAttendance {

	private int saId;
	private int stuId;
	private int setId;
	private String time;
	private String remark;
	private int score;
	private int recordPerson;
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRecordPerson() {
		return recordPerson;
	}
	public void setRecordPerson(int recordPerson) {
		this.recordPerson = recordPerson;
	}
	@Override
	public String toString() {
		return "StuAttendance [saId=" + saId + ", stuId=" + stuId + ", setId=" + setId + ", time=" + time + ", remark="
				+ remark + ", score=" + score + ", recordPerson=" + recordPerson + "]";
	}
	
	
}
