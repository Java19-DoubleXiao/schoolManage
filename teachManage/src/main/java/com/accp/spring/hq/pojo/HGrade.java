package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class HGrade implements Serializable{
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
