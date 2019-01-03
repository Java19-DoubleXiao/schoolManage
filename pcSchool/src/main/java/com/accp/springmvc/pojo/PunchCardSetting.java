package com.accp.springmvc.pojo;

public class PunchCardSetting {

	private int punchId;
	private String punchItem;
	private String startTime;
	private String endTime;
	private String lateTime;
	private int setPerson;
	private String setTime;
	private int lastUpdPerson;
	private String lastUpdTime;
	private int isForbid;
	public int getPunchId() {
		return punchId;
	}
	public void setPunchId(int punchId) {
		this.punchId = punchId;
	}
	public String getPunchItem() {
		return punchItem;
	}
	public void setPunchItem(String punchItem) {
		this.punchItem = punchItem;
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
	public String getLateTime() {
		return lateTime;
	}
	public void setLateTime(String lateTime) {
		this.lateTime = lateTime;
	}
	public int getSetPerson() {
		return setPerson;
	}
	public void setSetPerson(int setPerson) {
		this.setPerson = setPerson;
	}
	public String getSetTime() {
		return setTime;
	}
	public void setSetTime(String setTime) {
		this.setTime = setTime;
	}
	public int getLastUpdPerson() {
		return lastUpdPerson;
	}
	public void setLastUpdPerson(int lastUpdPerson) {
		this.lastUpdPerson = lastUpdPerson;
	}
	public String getLastUpdTime() {
		return lastUpdTime;
	}
	public void setLastUpdTime(String lastUpdTime) {
		this.lastUpdTime = lastUpdTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	@Override
	public String toString() {
		return "PunchCardSetting [punchId=" + punchId + ", punchItem=" + punchItem + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", lateTime=" + lateTime + ", setPerson=" + setPerson + ", setTime="
				+ setTime + ", lastUpdPerson=" + lastUpdPerson + ", lastUpdTime=" + lastUpdTime + ", isForbid="
				+ isForbid + "]";
	}
	
	
}
