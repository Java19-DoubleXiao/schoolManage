package com.accp.spring.pojo;

import java.io.Serializable;

public class Parents implements Serializable{

	private static final long serialVersionUID = -480518650566656161L;

	private int pId;//家长表id
	private String pName;//家长姓名
	private int stuId;//学员Id
	private String pPhone;//电话号码（通行证号）
	private String pPwd;//密码
	private String pImage;//头像
	private int pSex;//性别1男2女
	private String cId;//通知栏接收消息推送Id


	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}

	public String getpPwd() {
		return pPwd;
	}
	public void setpPwd(String pPwd) {
		this.pPwd = pPwd;
	}
	public String getpImage() {
		return pImage;
	}
	public void setpImage(String pImage) {
		this.pImage = pImage;
	}
	public int getpSex() {
		return pSex;
	}
	public void setpSex(int pSex) {
		this.pSex = pSex;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "Parents [pId=" + pId + ", pName=" + pName + ", stuId=" + stuId + ", pPhone=" + pPhone + ", pPwd=" + pPwd
				+ ", pImage=" + pImage + ", pSex=" + pSex + ", cId=" + cId + "]";
	}
	
}
