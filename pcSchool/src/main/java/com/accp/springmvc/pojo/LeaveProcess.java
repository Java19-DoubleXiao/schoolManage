package com.accp.springmvc.pojo;

public class LeaveProcess {

	private int leaveId;
	private int domeId;
	private int syuId;
	private String leaTime;
	private String leaReason;
	private String leaStartTime;
	private String leaEndTime;
	private int leaStates;
	private int isDorm;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public int getSyuId() {
		return syuId;
	}
	public void setSyuId(int syuId) {
		this.syuId = syuId;
	}
	public String getLeaTime() {
		return leaTime;
	}
	public void setLeaTime(String leaTime) {
		this.leaTime = leaTime;
	}
	public String getLeaReason() {
		return leaReason;
	}
	public void setLeaReason(String leaReason) {
		this.leaReason = leaReason;
	}
	public String getLeaStartTime() {
		return leaStartTime;
	}
	public void setLeaStartTime(String leaStartTime) {
		this.leaStartTime = leaStartTime;
	}
	public String getLeaEndTime() {
		return leaEndTime;
	}
	public void setLeaEndTime(String leaEndTime) {
		this.leaEndTime = leaEndTime;
	}
	public int getLeaStates() {
		return leaStates;
	}
	public void setLeaStates(int leaStates) {
		this.leaStates = leaStates;
	}
	public int getIsDorm() {
		return isDorm;
	}
	public void setIsDorm(int isDorm) {
		this.isDorm = isDorm;
	}
	@Override
	public String toString() {
		return "LeaveProcess [leaveId=" + leaveId + ", domeId=" + domeId + ", syuId=" + syuId + ", leaTime=" + leaTime
				+ ", leaReason=" + leaReason + ", leaStartTime=" + leaStartTime + ", leaEndTime=" + leaEndTime
				+ ", leaStates=" + leaStates + ", isDorm=" + isDorm + "]";
	}
	
	
}
