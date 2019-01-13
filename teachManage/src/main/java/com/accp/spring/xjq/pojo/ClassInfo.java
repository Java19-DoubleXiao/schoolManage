package com.accp.spring.xjq.pojo;

import java.io.Serializable;
import java.util.List;

public class ClassInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2974637537518759785L;
	private int id;
	private int classId;//班级Id
	private String cName;//班级名称
	private int userId;//班主任ID
	private String teaName;//老师名称
	
	private List<ClassStudent> students;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public List<ClassStudent> getStudents() {
		return students;
	}
	public void setStudents(List<ClassStudent> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "ClassInfo [id=" + id + ", classId=" + classId + ", cName=" + cName + ", userId=" + userId + ", teaName="
				+ teaName + ", students=" + students + "]";
	}
	
	

}
