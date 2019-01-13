package com.accp.spring.nana.pojo;

import java.io.Serializable;

public class ChangeSleep implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7385040928122832520L;

	
	private int id;
	private int stuId;
	private int ybedId;
	private int xbedId;
	private String startTime;
	private String remark;
	//寝室、床位
	private String ybedNum;
	private String xbedNum;
	private String ydormNum;
	private String xdormNum;
	private String stuName;
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
	
	public int getYbedId() {
		return ybedId;
	}
	public void setYbedId(int ybedId) {
		this.ybedId = ybedId;
	}
	public int getXbedId() {
		return xbedId;
	}
	public void setXbedId(int xbedId) {
		this.xbedId = xbedId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getYbedNum() {
		return ybedNum;
	}
	public void setYbedNum(String ybedNum) {
		this.ybedNum = ybedNum;
	}
	public String getXbedNum() {
		return xbedNum;
	}
	public void setXbedNum(String xbedNum) {
		this.xbedNum = xbedNum;
	}
	public String getYdormNum() {
		return ydormNum;
	}
	public void setYdormNum(String ydormNum) {
		this.ydormNum = ydormNum;
	}
	public String getXdormNum() {
		return xdormNum;
	}
	public void setXdormNum(String xdormNum) {
		this.xdormNum = xdormNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ChangeSleep [id=" + id + ", stuId=" + stuId + ", ybedId=" + ybedId + ", xbedId=" + xbedId
				+ ", startTime=" + startTime + ", remark=" + remark + ", ybedNum=" + ybedNum + ", xbedNum=" + xbedNum
				+ ", ydormNum=" + ydormNum + ", xdormNum=" + xdormNum + ", stuName=" + stuName + "]";
	}
	
	
	
	
	
	
}
