package com.accp.springmvc.pojo;

public class LeaveProcessTrack {

	private int trackId;
	private int leaveId;
	private int nodeId;
	private int handler;
	private String suggestion;
	private String dealTime;
	private int dealResult;
	public int getTrackId() {
		return trackId;
	}
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getNodeId() {
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public int getHandler() {
		return handler;
	}
	public void setHandler(int handler) {
		this.handler = handler;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getDealTime() {
		return dealTime;
	}
	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}
	public int getDealResult() {
		return dealResult;
	}
	public void setDealResult(int dealResult) {
		this.dealResult = dealResult;
	}
	@Override
	public String toString() {
		return "LeaveProcessTrack [trackId=" + trackId + ", leaveId=" + leaveId + ", nodeId=" + nodeId + ", handler="
				+ handler + ", suggestion=" + suggestion + ", dealTime=" + dealTime + ", dealResult=" + dealResult
				+ "]";
	}
	
	
}
