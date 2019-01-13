package com.accp.spring.nana.vo;

import java.util.List;

import com.accp.spring.nana.pojo.Healthrecordimg;

public class HealthrecordVo {
	private int id;//寝室卫生检查id
	private int setId;//扣分制度Id
	private int checkId;//学生Id or 寝室Id
	private int checkType;//检查类别，是寝室的检查记录还是个人事件的记录
	private String checkTime;//检查时间
	private String remark;//'备注'
	private int score;//扣分数目
	private int checkPerson;//'检查人（宿管Id）
	private int dormId;//寝室Id
	private String dormNum;//寝室号
	private int dormMangeId;//宿管Id
	private int adminId;//寝室长(学员Id)
	private int dormType;//寝室类别(男1，女2)
	private String setItem; //扣分项目
	private int setScore; //扣分数目
	private int setType; //扣分类型
	private int setSort; //扣分类别
	private List<Healthrecordimg> healthrecordimgs;
	
	public List<Healthrecordimg> getHealthrecordimgs() {
		return healthrecordimgs;
	}
	public void setHealthrecordimgs(List<Healthrecordimg> healthrecordimgs) {
		this.healthrecordimgs = healthrecordimgs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public int getCheckId() {
		return checkId;
	}
	public void setCheckId(int checkId) {
		this.checkId = checkId;
	}
	public int getCheckType() {
		return checkType;
	}
	public void setCheckType(int checkType) {
		this.checkType = checkType;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCheckPerson() {
		return checkPerson;
	}
	public void setCheckPerson(int checkPerson) {
		this.checkPerson = checkPerson;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
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
	
	public String getSetItem() {
		return setItem;
	}
	public void setSetItem(String setItem) {
		this.setItem = setItem;
	}
	public int getSetScore() {
		return setScore;
	}
	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}
	public int getSetType() {
		return setType;
	}
	public void setSetType(int setType) {
		this.setType = setType;
	}
	public int getSetSort() {
		return setSort;
	}
	public void setSetSort(int setSort) {
		this.setSort = setSort;
	}
	@Override
	public String toString() {
		return "HealthrecordVo [id=" + id + ", setId=" + setId + ", checkId=" + checkId + ", checkType=" + checkType
				+ ", checkTime=" + checkTime + ", remark=" + remark + ", score=" + score + ", checkPerson="
				+ checkPerson + ", dormId=" + dormId + ", dormNum=" + dormNum + ", dormMangeId=" + dormMangeId
				+ ", adminId=" + adminId + ", dormType=" + dormType + ", setItem=" + setItem + ", setScore=" + setScore
				+ ", setType=" + setType + ", setSort=" + setSort + ", healthrecordimgs=" + healthrecordimgs + "]";
	}

	
	
	
}
