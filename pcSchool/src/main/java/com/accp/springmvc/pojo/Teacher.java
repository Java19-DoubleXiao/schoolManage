package com.accp.springmvc.pojo;

public class Teacher {

	  private int teaId;
	  private String teaName;
	  private String teaUserName;
	  private String teaPwd;
	  private String teaImage;
	  private int teaType;
	  private String teaPhone;
	  private int teaSex;
	  private String teabirth;
	  private String teaStartTime;
	  private String teaEndTime;
	  private String teaIdnumber;
	  private String teaAddress;
	  private String cId;
	
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
	public String getTeabirth() {
		return teabirth;
	}
	public void setTeabirth(String teabirth) {
		this.teabirth = teabirth;
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
	public String getTeaIdnumber() {
		return teaIdnumber;
	}
	public void setTeaIdnumber(String teaIdnumber) {
		this.teaIdnumber = teaIdnumber;
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
				+ teaSex + ", teabirth=" + teabirth + ", teaStartTime=" + teaStartTime + ", teaEndTime=" + teaEndTime
				+ ", teaIdnumber=" + teaIdnumber + ", teaAddress=" + teaAddress + ", cId=" + cId + "]";
	}
	  
	  
}
