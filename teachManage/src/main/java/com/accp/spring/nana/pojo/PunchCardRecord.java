package com.accp.spring.nana.pojo;

import java.io.Serializable;

public class PunchCardRecord implements Serializable{
	
	/**
	 * 打卡记录表
	 */
	private static final long serialVersionUID = -4391805146379731299L;

	/*打卡记录表	punchCardRecord	 	 
字段	类型	字段描述	备注
id	int	id	 
stuId	int	学员Id	 打卡人
punchTime	datetime	打卡时间	 
recordPerson	 int	记录人	使用谁的手机打的卡*/
	
	private int id;
	private int stuId;
	private String punchTime;
	private int recordPerson;
	//考勤人数查询
	private int sum;//总人数
	private int nanSum;//男生住宿人数
	private int nvSum;//女生住宿人数
	private int nanDaka;
	private int nvDaka;
	private int nanWei;
	private int nvWei;
	
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getNanSum() {
		return nanSum;
	}
	public void setNanSum(int nanSum) {
		this.nanSum = nanSum;
	}
	public int getNvSum() {
		return nvSum;
	}
	public void setNvSum(int nvSum) {
		this.nvSum = nvSum;
	}
	public int getNanDaka() {
		return nanDaka;
	}
	public void setNanDaka(int nanDaka) {
		this.nanDaka = nanDaka;
	}
	public int getNvDaka() {
		return nvDaka;
	}
	public void setNvDaka(int nvDaka) {
		this.nvDaka = nvDaka;
	}
	public int getNanWei() {
		return nanWei;
	}
	public void setNanWei(int nanWei) {
		this.nanWei = nanWei;
	}
	public int getNvWei() {
		return nvWei;
	}
	public void setNvWei(int nvWei) {
		this.nvWei = nvWei;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
	public String getPunchTime() {
		return punchTime;
	}
	public void setPunchTime(String punchTime) {
		this.punchTime = punchTime;
	}
	public int getRecordPerson() {
		return recordPerson;
	}
	public void setRecordPerson(int recordPerson) {
		this.recordPerson = recordPerson;
	}
	@Override
	public String toString() {
		return "PunchCardRecord [id=" + id + ", stuId=" + stuId + ", punchTime=" + punchTime + ", recordPerson="
				+ recordPerson + ", sum=" + sum + ", nanSum=" + nanSum + ", nvSum=" + nvSum + ", nanDaka=" + nanDaka
				+ ", nvDaka=" + nvDaka + ", nanWei=" + nanWei + ", nvWei=" + nvWei + "]";
	}
	
	
	
	

}
