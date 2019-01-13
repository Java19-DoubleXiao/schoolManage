package com.accp.spring.nana.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * 寝室表
 * @author 巴拉巴拉大灰狼
 *
 */
public class Dormitory implements Serializable{
	private int dormId;//寝室Id
	private String dormNum;//寝室号
	private int dormMangeId;//宿管Id
	private int adminId;//寝室长(学员Id)
	private int dormType;//寝室类别(男1，女2)
	private List<Bed> bed;//床位集合
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
	public List<Bed> getBed() {
		return bed;
	}
	public void setBed(List<Bed> bed) {
		this.bed = bed;
	}
	@Override
	public String toString() {
		return "Dormitory [dormId=" + dormId + ", dormNum=" + dormNum + ", dormMangeId=" + dormMangeId + ", adminId="
				+ adminId + ", dormType=" + dormType + ", bed=" + bed + "]";
	}
	
}
