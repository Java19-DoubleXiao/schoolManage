package com.accp.spring.nana.pojo;

import java.io.Serializable;
/**
 * 寝室报修表
 * @author 巴拉巴拉大灰狼
 *
 */
public class RepairsS implements Serializable{
	private int id;//寝室报修id
	private int stuId;//报修人（学生Id）
	private int dormId;//寝室Id
	private String repairItem;//报修物品
	private String applyTime;//报修时间
	private String remark;//备注'
	private int repairStates;//处理状态(1未处理2受理中3已完成)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	public String getRepairItem() {
		return repairItem;
	}
	public void setRepairItem(String repairItem) {
		this.repairItem = repairItem;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getRepairStates() {
		return repairStates;
	}
	public void setRepairStates(int repairStates) {
		this.repairStates = repairStates;
	}
	@Override
	public String toString() {
		return "Repairs [id=" + id + ", stuId=" + stuId + ", dormId=" + dormId + ", repairItem=" + repairItem
				+ ", applyTime=" + applyTime + ", remark=" + remark + ", repairStates=" + repairStates + "]";
	}
	
	
}
