package com.accp.spring.pojo;

import java.io.Serializable;

public class Teacher implements Serializable{
	private int teaId;
	private String teaName;//'教师姓名'
	private String teaUserName ;//'通行证号'
	private String teaPwd ;//'密码'
	private String teaImage ;//'头像'
	private int teaType ;//'职位（班主任1，教员2，管理者3，宿管4）'
	private String teaPhone ;//'电话号码'
	private int teaSex ;//'性别  1,男 2,女'
	private String teaBirth  ;//'出生日期'
	private String teaStartTime ;//'入职时间'
	private String teaEndTime  ;//'离职时间'
	private String teaIDnumber ;//'身份证号'
	private String teaAddress ;//'家庭住址'
	private String cId ;//'通知栏接收消息推送Id'
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getTeaUserName() {
		return teaUserName;
	}
	public void setTeaUserName(String teaUserName) {
		this.teaUserName = teaUserName;
	}
	public String getTeaPwd() {
		return teaPwd;
	}
	public void setTeaPwd(String teaPwd) {
		this.teaPwd = teaPwd;
	}
	public String getTeaImage() {
		return teaImage;
	}
	public void setTeaImage(String teaImage) {
		this.teaImage = teaImage;
	}
	public int getTeaType() {
		return teaType;
	}
	public void setTeaType(int teaType) {
		this.teaType = teaType;
	}
	public String getTeaPhone() {
		return teaPhone;
	}
	public void setTeaPhone(String teaPhone) {
		this.teaPhone = teaPhone;
	}
	public int getTeaSex() {
		return teaSex;
	}
	public void setTeaSex(int teaSex) {
		this.teaSex = teaSex;
	}
	public String getTeaBirth() {
		return teaBirth;
	}
	public void setTeaBirth(String teaBirth) {
		this.teaBirth = teaBirth;
	}
	public String getTeaStartTime() {
		return teaStartTime;
	}
	public void setTeaStartTime(String teaStartTime) {
		this.teaStartTime = teaStartTime;
	}
	public String getTeaEndTime() {
		return teaEndTime;
	}
	public void setTeaEndTime(String teaEndTime) {
		this.teaEndTime = teaEndTime;
	}
	public String getTeaIDnumber() {
		return teaIDnumber;
	}
	public void setTeaIDnumber(String teaIDnumber) {
		this.teaIDnumber = teaIDnumber;
	}
	public String getTeaAddress() {
		return teaAddress;
	}
	public void setTeaAddress(String teaAddress) {
		this.teaAddress = teaAddress;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [teaId=" + teaId + ", teaName=" + teaName + ", teaUserName=" + teaUserName + ", teaPwd="
				+ teaPwd + ", teaImage=" + teaImage + ", teaType=" + teaType + ", teaPhone=" + teaPhone + ", teaSex="
				+ teaSex + ", teaBirth=" + teaBirth + ", teaStartTime=" + teaStartTime + ", teaEndTime=" + teaEndTime
				+ ", teaIDnumber=" + teaIDnumber + ", teaAddress=" + teaAddress + ", cId=" + cId + "]";
	}
	
	
}
