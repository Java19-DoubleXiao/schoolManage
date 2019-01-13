package com.accp.springmvc.pojo;

public class LeaveDomeNode {

	private int nodeId;
	private int domeId;
	private String node;
	private int handler;
	public int getNodeId() {
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public int getHandler() {
		return handler;
	}
	public void setHandler(int handler) {
		this.handler = handler;
	}
	@Override
	public String toString() {
		return "LeaveDomeNode [nodeId=" + nodeId + ", domeId=" + domeId + ", node=" + node + ", handler=" + handler
				+ "]";
	}
	
	
}
