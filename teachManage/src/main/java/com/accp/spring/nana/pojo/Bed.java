package com.accp.spring.nana.pojo;

import java.io.Serializable;
/**
 * 床位表
 * @author 巴拉巴拉大灰狼
 *
 */
public class Bed implements Serializable{
	private int bedId;//床位Id
	private int dormId;//寝室Id
	private String bedNum;//床位号码
	private int bedStates;//床位状态(正常1，损坏2，删除3)
	private int bedCount;//床位数量
	private int stuId;
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getBedCount() {
		return bedCount;
	}
	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	public String getBedNum() {
		return bedNum;
	}
	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}
	public int getBedStates() {
		return bedStates;
	}
	public void setBedStates(int bedStates) {
		this.bedStates = bedStates;
	}
	@Override
	public String toString() {
		return "Bed [bedId=" + bedId + ", dormId=" + dormId + ", bedNum=" + bedNum + ", bedStates=" + bedStates
				+ ", bedCount=" + bedCount + ", stuId=" + stuId + "]";
	}
	
	
	
	
}
