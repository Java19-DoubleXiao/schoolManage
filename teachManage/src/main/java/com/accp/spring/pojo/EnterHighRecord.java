package com.accp.spring.pojo;

import java.io.Serializable;

public class EnterHighRecord implements Serializable{
	/**
	 * 班级升学记录表
	 */
	private static final long serialVersionUID = -2153177082010179202L;
	private int	id;
	private int classId;//班级Id
	private int gId;//年级Id
	private String enterTime;//升学时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
	@Override
	public String toString() {
		return "EnterHighRecord [id=" + id + ", classId=" + classId + ", gId=" + gId + ", enterTime=" + enterTime + "]";
	}
	
	
	
	
	/*id	int	id
classId	int	班级Id
gId	int	年级Id
enterTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	升学时间*/
}
