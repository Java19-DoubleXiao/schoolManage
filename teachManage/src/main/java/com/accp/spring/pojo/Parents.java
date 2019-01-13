package com.accp.spring.pojo;

import java.io.Serializable;

public class Parents implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -480518650566656161L;
	private int pId;
	private String pName;
	private int stuId;
	private String pPwd;
	private String pImage;
	private int pSex;
	private String cId;
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
		return "Parents [pId=" + pId + ", pName=" + pName + ", stuId=" + stuId + ", pPwd=" + pPwd + ", pImage=" + pImage
				+ ", pSex=" + pSex + ", cId=" + cId + "]";
	}
	
	
	
	
	/*pId	int	id
pName	Varchar(50)	家长姓名
pPhone	Varchar(50)	家长电话号
stuId	int	学员Id
pPwd	Varchar(50)	密码
pImage	Varchar(500)	头像
pSex	int	性别
cId	Varchar（200）	通知栏接收消息推送唯一Id*/
}
