package com.accp.spring.pojo;

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
		return "punchCardRecord [id=" + id + ", stuId=" + stuId + ", punchTime=" + punchTime + ", recordPerson="
				+ recordPerson + "]";
	}
	
	

}
