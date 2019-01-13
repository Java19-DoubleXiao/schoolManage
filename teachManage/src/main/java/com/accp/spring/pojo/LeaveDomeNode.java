package com.accp.spring.pojo;

import java.io.Serializable;

public class LeaveDomeNode implements Serializable{
	
	/**
	 *   //请假流程模板节点表
	 */
	private static final long serialVersionUID = 3065279246887603538L;
	private int nodeId;
	private int domeId;
	private int node;
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
	
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	
	public int getHandler() {
		return handler;
	}
	public void setHandler(int handler) {
		this.handler = handler;
	}

	@Override
	public String toString() {
		return "LeaveDomeNode [domeId=" + domeId + ", handler=" + handler + ", node=" + node + ", nodeId=" + nodeId
				+ "]";
	}
	
	

	
	/*请假流程模板节点表	LeaveDomeNode	 	 
字段	类型	字段描述	备注
nodeId	int	id	 
domeId	int	模板Id	
node	Varchar(50)	流程节点	
handler	int	处理人	员工id*/
}
