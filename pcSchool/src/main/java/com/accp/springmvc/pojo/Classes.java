package com.accp.springmvc.pojo;

public class Classes {

	private int classId;
	private String cName;
	private int gId;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getCName() {
		return cName;
	}
	public void setCName(String cName) {
		this.cName = cName;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", cName=" + cName + ", gId=" + gId + "]";
	}
	
}
