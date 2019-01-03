package com.accp.springmvc.pojo;

public class Parents {

	private int pId;
	private String pName;
	private String pPhone;
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
	public String getpPhone() {
		return pPhone;
	}
	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
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
		return "Parents [pId=" + pId + ", pName=" + pName + ", pPhone=" + pPhone + ", stuId=" + stuId + ", pPwd=" + pPwd
				+ ", pImage=" + pImage + ", pSex=" + pSex + ", cId=" + cId + "]";
	}
	
	
}
