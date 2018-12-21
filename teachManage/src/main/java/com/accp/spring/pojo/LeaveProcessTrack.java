package com.accp.spring.pojo;

import java.io.Serializable;

public class LeaveProcessTrack implements Serializable{

	/**
	 *  //请假流程跟踪表	LeaveProcessTrack
	 */
	private static final long serialVersionUID = 2899814232714054507L;
	
	private int trackId;//
	private int leaveId;//请假id	关联 请假流程实例表
	private int nodeId;	//流程节点Id	
	private int handler; // 处理人【快照】	 员工id
	private int suggestion;	// 处理意见
	private int dealTime;// 处理时间	 
	private int dealResult;	// 处理结果①	通过1、拒绝2*/
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
	public int getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(int suggestion) {
		this.suggestion = suggestion;
	}
	public int getDealTime() {
		return dealTime;
	}
	public void setDealTime(int dealTime) {
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
	
	
	
	/*请假流程跟踪表	LeaveProcessTrack	 	 
	字段	类型	字段描述	备注
	trackId	int	id	 
	leaveId	int	请假id	关联 请假流程实例表
	nodeId	int	流程节点Id	
	handler	int	处理人【快照】	 员工id
	suggestion	Varchar(200)	处理意见	
	dealTime	DATETIME NULL DEFAULTCURRENT_TIMESTAMP	处理时间	 
	dealResult	int	处理结果①	通过1、拒绝2*/
}
