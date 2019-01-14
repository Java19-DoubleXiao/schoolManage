package com.accp.spring.nana.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * 寝室卫生检查表
 * @author 巴拉巴拉大灰狼
 *
 */
public class HealthrecordS implements Serializable{

	private int id;//寝室卫生检查id
	private int setId;//扣分制度Id
	private int checkId;//学生Id or 寝室Id
	private int checkType;//检查类别，是寝室的检查记录还是个人事件的记录
	private String checkTime;//检查时间
	private String remark;//'备注'
	private int score;//扣分数目
	private int checkPerson;//'检查人（宿管Id）
	private List<HealthrecordimgS> healthrecordimgs;//寝室卫生检查图片集合
	
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
	public int getStuId() {
		return checkId;
	}
	public void setStuId(int checkId) {
		this.checkId = checkId;
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
	public List<HealthrecordimgS> getHealthrecordimgs() {
		return healthrecordimgs;
	}
	public void setHealthrecordimgs(List<HealthrecordimgS> healthrecordimgs) {
		this.healthrecordimgs = healthrecordimgs;
	}
	@Override
	public String toString() {
		return "Healthrecord [id=" + id + ", setId=" + setId + ", checkId=" + checkId + ", checkType=" + checkType
				+ ", checkTime=" + checkTime + ", remark=" + remark + ", score=" + score + ", checkPerson="
				+ checkPerson + ", healthrecordimgs=" + healthrecordimgs + "]";
	}
	public HealthrecordS(int setId, int checkId, int score, int checkPerson) {
		super();
		this.setId = setId;
		this.checkId = checkId;
		this.score = score;
		this.checkPerson = checkPerson;
	}
	public HealthrecordS() {
		
	}
	
	
}
