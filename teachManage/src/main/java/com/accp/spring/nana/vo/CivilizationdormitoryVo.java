package com.accp.spring.nana.vo;

public class CivilizationdormitoryVo {
	private int id;//文明寝室id
	private int dormId;//寝室ID
	private String checkTime;//开始评选时间
	private String endTime;//结束评选时间
	private int score;//分数
	private String dormNum;//寝室号
	private int dormMangeId;//宿管Id
	private int adminId;//寝室长(学员Id)
	private int dormType;//寝室类别(男1，女2)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getDormNum() {
		return dormNum;
	}
	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	public int getDormMangeId() {
		return dormMangeId;
	}
	public void setDormMangeId(int dormMangeId) {
		this.dormMangeId = dormMangeId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getDormType() {
		return dormType;
	}
	public void setDormType(int dormType) {
		this.dormType = dormType;
	}
	@Override
	public String toString() {
		return "CivilizationdormitoryVo [id=" + id + ", dormId=" + dormId + ", checkTime=" + checkTime + ", endTime="
				+ endTime + ", score=" + score + ", dormNum=" + dormNum + ", dormMangeId=" + dormMangeId + ", adminId="
				+ adminId + ", dormType=" + dormType + "]";
	}
	
	
}
