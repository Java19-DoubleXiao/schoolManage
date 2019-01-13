package com.accp.spring.nana.vo;

import java.io.Serializable;

public class DormitoryVo implements Serializable{

	//寝室
	private String dormId;//寝室id
	private String dormNum;//寝室号码
	private String bedNum;//床位号码
	private int count;//是否是寝室长
	private String stuName;//学生姓名
	private String cName;//班级名称
	private String stuPhone;//学生电话
	private String pPhone;//家长电话
	private String teaPhone;//班主任电话
	private int stuId;//学生id
	
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getDormId() {
		return dormId;
	}
	public void setDormId(String dormId) {
		this.dormId = dormId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getDormNum() {
		return dormNum;
	}
	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	public String getBedNum() {
		return bedNum;
	}
	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}
	public String getTeaPhone() {
		return teaPhone;
	}
	public void setTeaPhone(String teaPhone) {
		this.teaPhone = teaPhone;
	}
	
	
	//床位
	private int spoilbed;//损坏床位
	private int sumbed;//总床位
	private int beding;//正在使用的床位
	private int emptyBed;//空白床位
	public int getSpoilbed() {
		return spoilbed;
	}
	public void setSpoilbed(int spoilbed) {
		this.spoilbed = spoilbed;
	}
	public int getSumbed() {
		return sumbed;
	}
	public void setSumbed(int sumbed) {
		this.sumbed = sumbed;
	}
	public int getBeding() {
		return beding;
	}
	public void setBeding(int beding) {
		this.beding = beding;
	}
	public int getEmptyBed() {
		return emptyBed;
	}
	public void setEmptyBed(int emptyBed) {
		this.emptyBed = emptyBed;
	}
	@Override
	public String toString() {
		return "DormitoryVo [dormId=" + dormId + ", dormNum=" + dormNum + ", bedNum=" + bedNum + ", count=" + count
				+ ", stuName=" + stuName + ", cName=" + cName + ", stuPhone=" + stuPhone + ", pPhone=" + pPhone
				+ ", teaPhone=" + teaPhone + ", stuId=" + stuId + ", spoilbed=" + spoilbed + ", sumbed=" + sumbed
				+ ", beding=" + beding + ", emptyBed=" + emptyBed + "]";
	}
	
	
	
	
	
}
