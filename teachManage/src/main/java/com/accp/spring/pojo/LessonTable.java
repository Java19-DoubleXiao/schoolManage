package com.accp.spring.pojo;

import java.io.Serializable;

public class LessonTable implements Serializable{
	/**
	 *   //课表表	LessonTable	
	 */
	private static final long serialVersionUID = -1032131869763314133L;
	private int lessonId;
	private int classId;//班级Id	
	private String lessonTime;//上课时间	要分为上午和下午
	private String lessonPlace;//上课地点	
	private int lessonTeacher;//上课老师	
	private String lessonContent;//上课内容	上课内容（如jsp）或者是自习
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
	@Override
	public String toString() {
		return "LessonTable [lessonId=" + lessonId + ", classId=" + classId + ", lessonTime=" + lessonTime
				+ ", lessonPlace=" + lessonPlace + ", lessonTeacher=" + lessonTeacher + ", lessonContent="
				+ lessonContent + "]";
	}

	
	
	
	
	/**
	 * 课表 表	LessonTable	 	 
字段	类型	字段描述	备注
lessonId	int	Id	  主键、自增
classId	int	班级Id	
lessonTime	datetime	上课时间	要分为上午和下午
lessonPlace	Varchar(50)	上课地点	
lessonTeacher	int	上课老师	
lessonContent	Varchar(100)	上课内容	上课内容（如jsp）或者是自习
	 */
}
