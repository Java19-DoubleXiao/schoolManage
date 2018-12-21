package com.accp.spring.pojo;

import java.io.Serializable;

public class Classes implements Serializable{
	
	/**
	 * 班级表
	 */
	private static final long serialVersionUID = -561814511245494245L;
	private int  classId;
	private String  cName;
	private int   gId;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
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
