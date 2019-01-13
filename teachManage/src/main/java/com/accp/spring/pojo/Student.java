package com.accp.spring.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private int stuId;
	private String stuName;//'学员姓名'
	private String stuUserName;//'通行证号'
	private String stuPwd;//'密码'
	private int classId;//'班级Id'
	private int stuSex;//'性别'
	private String stuBirth;//'出生日期'
	private String stuImage;//'头像'
	private String stuPhone;//'电话号码'
	private int stuType;//'职业'
	private String stuStartTime;//'入学时间'
	private String stuEndTime;//'离校时间'
	private String stuIDnumber;//'身份证号'
	private String stuAddress;//'家庭住址'
	private String cId;//'通知栏接收消息推送Id'
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
	public String getStuUserName() {
		return stuUserName;
	}
	public void setStuUserName(String stuUserName) {
		this.stuUserName = stuUserName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getStuSex() {
		return stuSex;
	}
	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuBirth() {
		return stuBirth;
	}
	public void setStuBirth(String stuBirth) {
		this.stuBirth = stuBirth;
	}
	public String getStuImage() {
		return stuImage;
	}
	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public int getStuType() {
		return stuType;
	}
	public void setStuType(int stuType) {
		this.stuType = stuType;
	}
	public String getStuStartTime() {
		return stuStartTime;
	}
	public void setStuStartTime(String stuStartTime) {
		this.stuStartTime = stuStartTime;
	}
	public String getStuEndTime() {
		return stuEndTime;
	}
	public void setStuEndTime(String stuEndTime) {
		this.stuEndTime = stuEndTime;
	}
	public String getStuIDnumber() {
		return stuIDnumber;
	}
	public void setStuIDnumber(String stuIDnumber) {
		this.stuIDnumber = stuIDnumber;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuUserName=" + stuUserName + ", stuPwd="
				+ stuPwd + ", classId=" + classId + ", stuSex=" + stuSex + ", stuBirth=" + stuBirth + ", stuImage="
				+ stuImage + ", stuPhone=" + stuPhone + ", stuType=" + stuType + ", stuStartTime=" + stuStartTime
				+ ", stuEndTime=" + stuEndTime + ", stuIDnumber=" + stuIDnumber + ", stuAddress=" + stuAddress
				+ ", cId=" + cId + "]";
	}

}
