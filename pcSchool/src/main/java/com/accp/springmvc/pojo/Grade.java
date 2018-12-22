package com.accp.springmvc.pojo;

public class Grade {

	private int gid;
	private String gName;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", gName=" + gName + "]";
	}
	
	
}
