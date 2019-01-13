package com.accp.spring.nana.pojo;

import java.io.Serializable;
/**
 * 寝室与学员关系表
 * @author 巴拉巴拉大灰狼
 *
 */
public class Dormrelation implements Serializable{
	private int id;//寝室与学员关系表id
	private int stuId;//'学生Id
	private int bedId;//床位Id
	private String startTime;//住寝时间
	private String endTime;//'离寝时间
	private int isUse;//是否正在使用（1是，2否）
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
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
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
	@Override
	public String toString() {
		return "Dormrelation [id=" + id + ", stuId=" + stuId + ", bedId=" + bedId + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", isUse=" + isUse + "]";
	}
	
}
