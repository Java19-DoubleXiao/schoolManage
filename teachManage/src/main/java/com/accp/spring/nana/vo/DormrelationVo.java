package com.accp.spring.nana.vo;

public class DormrelationVo {
	private int id;//寝室与学员关系表id
	private String bedNum;//床位号码
	private String startTime;//住寝时间
	private String endTime;//'离寝时间
	private int isUse;//是否正在使用（1是，2否）
	private String stuName;//'学员姓名'
	private String dormNum;//寝室号
	private String cName;//班级名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBedNum() {
		return bedNum;
	}
	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getDormNum() {
		return dormNum;
	}
	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "DormrelationVo [id=" + id + ", bedNum=" + bedNum + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", isUse=" + isUse + ", stuName=" + stuName + ", dormNum=" + dormNum + ", cName=" + cName + "]";
	}
	
}
