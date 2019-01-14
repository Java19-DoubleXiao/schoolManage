package com.accp.spring.nana.pojo;

import java.io.Serializable;
/**
 * 文明寝室历史记录表
 * @author 巴拉巴拉大灰狼
 *
 */
public class CivilizationdormitoryS implements Serializable{
	private int id;//文明寝室id
	private int dormId;//寝室ID
	private String startTime;//开始评选时间
	private String endTime;//结束评选时间
	private int fraction;//得奖寝室分数
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
	public int getFraction() {
		return fraction;
	}
	public void setFraction(int fraction) {
		this.fraction = fraction;
	}
	@Override
	public String toString() {
		return "Civilizationdormitory [id=" + id + ", dormId=" + dormId + ", startTime=" + startTime + ", endTime="
				+ endTime + ", fraction=" + fraction + "]";
	}
	
	
}
