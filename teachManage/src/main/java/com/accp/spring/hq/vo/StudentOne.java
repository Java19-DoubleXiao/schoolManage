package com.accp.spring.hq.vo;

import java.io.Serializable;

public class StudentOne implements Serializable{
	private int stuId;
	private String stuName;
	private String stuImage;
	private String stuUserName;
	private int stuSex;
	private String stuPhone;
	private int stuBirth;//年龄
	private String stuAddress;
	private String pName;
	private String pPhone;
	private String cName;
	private String gName;
	private int stuType;
	private int wfScore;
	private String wfRemark;
	
	 
	
	public String getWfRemark() {
		return wfRemark;
	}
	public void setWfRemark(String wfRemark) {
		this.wfRemark = wfRemark;
	}
	public int getWfScore() {
		return wfScore;
	}
	public void setWfScore(int wfScore) {
		this.wfScore = wfScore;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getStuType() {
		return stuType;
	}
	public void setStuType(int stuType) {
		this.stuType = stuType;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuImage() {
		return stuImage;
	}
	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}
	public String getStuUserName() {
		return stuUserName;
	}
	public void setStuUserName(String stuUserName) {
		this.stuUserName = stuUserName;
	}
	public int getStuSex() {
		return stuSex;
	}
	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public int getStuBirth() {
		return stuBirth;
	}
	public void setStuBirth(int stuBirth) {
		this.stuBirth = stuBirth;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}

	
	
	
	
}
