package com.accp.springmvc.pojo;

public class LeaveProcessDome {

	private int domeId;
	private String domeType;
	private int createPerson;
	private String createTime;
	private int isForbid;
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public String getDomeType() {
		return domeType;
	}
	public void setDomeType(String domeType) {
		this.domeType = domeType;
	}
	public int getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(int createPerson) {
		this.createPerson = createPerson;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	@Override
	public String toString() {
		return "LeaveProcessDome [domeId=" + domeId + ", domeType=" + domeType + ", createPerson=" + createPerson
				+ ", createTime=" + createTime + ", isForbid=" + isForbid + "]";
	}
	
	
}
