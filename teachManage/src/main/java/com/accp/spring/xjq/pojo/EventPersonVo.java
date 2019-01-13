package com.accp.spring.xjq.pojo;

import java.io.Serializable;

public class EventPersonVo implements Serializable{
	/**
	 * 事件参与人表
	 */
	private static final long serialVersionUID = 1L;
	private int personId;
	private int eventId;
	private int stuId;
	private String stuName;
	private String stuPhone;
	private int classId;
	private String cName;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
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
	@Override
	public String toString() {
		return "EventPersonVo [personId=" + personId + ", eventId=" + eventId + ", stuId=" + stuId + ", stuName="
				+ stuName + ", stuPhone=" + stuPhone + ", classId=" + classId + ", cName=" + cName + "]";
	}
	
	

}
