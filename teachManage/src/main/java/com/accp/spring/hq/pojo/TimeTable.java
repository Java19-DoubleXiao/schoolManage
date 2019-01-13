package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class TimeTable implements Serializable{
	private int lessonId;
	private int classId;
	private String lessonTime;
	private String lessonPlace;
	private int lessonTeacher;
	private String lessonContent;
	
	private String cName;
	private String teaName;
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getLessonTime() {
		return lessonTime;
	}
	public void setLessonTime(String lessonTime) {
		this.lessonTime = lessonTime;
	}
	public String getLessonPlace() {
		return lessonPlace;
	}
	public void setLessonPlace(String lessonPlace) {
		this.lessonPlace = lessonPlace;
	}
	public int getLessonTeacher() {
		return lessonTeacher;
	}
	public void setLessonTeacher(int lessonTeacher) {
		this.lessonTeacher = lessonTeacher;
	}
	public String getLessonContent() {
		return lessonContent;
	}
	public void setLessonContent(String lessonContent) {
		this.lessonContent = lessonContent;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	@Override
	public String toString() {
		return "TimeTable [lessonId=" + lessonId + ", classId=" + classId + ", lessonTime=" + lessonTime
				+ ", lessonPlace=" + lessonPlace + ", lessonTeacher=" + lessonTeacher + ", lessonContent="
				+ lessonContent + ", cName=" + cName + ", teaName=" + teaName + "]";
	}
	
	
}
