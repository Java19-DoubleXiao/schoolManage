package com.accp.spring.hq.pojo;

import java.io.Serializable;

import java.util.List;

public class HClasses implements Serializable{
	private int classId;
	private String cName;
	private int gId;
	private List<Homework> hw;

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

	public List<Homework> getHw() {
		return hw;
	}
	public void setHw(List<Homework> hw) {
		this.hw = hw;
	}
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", cName=" + cName + ", gId=" + gId + ", hw=" + hw + "]";
	}
	
	
	
}
