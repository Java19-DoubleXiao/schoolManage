package com.accp.spring.hq.vo;

import java.io.Serializable;

public class TeaInfo implements Serializable{
	private int teaId;
	private String teaName;
	private String teaUserName;
	private String teaImage;
	private String teaBirth;
	private String teaPhone;
	private int teaSex;
	private int age;
	private int teaType;
	
	public int getTeaType() {
		return teaType;
	}
	public void setTeaType(int teaType) {
		this.teaType = teaType;
	}
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
	public String getTeaImage() {
		return teaImage;
	}
	public void setTeaImage(String teaImage) {
		this.teaImage = teaImage;
	}
	public String getTeaBirth() {
		return teaBirth;
	}
	public void setTeaBirth(String teaBirth) {
		this.teaBirth = teaBirth;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "TeaInfo [teaId=" + teaId + ", teaName=" + teaName + ", teaUserName=" + teaUserName + ", teaImage="
				+ teaImage + ", teaBirth=" + teaBirth + ", teaPhone=" + teaPhone + ", teaSex=" + teaSex + ", age=" + age
				+ "]";
	}
	
	
}
