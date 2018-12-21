package com.accp.spring.pojo;

import java.io.Serializable;

public class Grade implements Serializable{
	/**
	 * 年纪表
	 */
	private static final long serialVersionUID = 7791074985750810516L;
	private int gId;
	private String gName;
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	
	@Override
	public String toString() {
		return "Grade [gId=" + gId + ", gName=" + gName + "]";
	}
	
}
