package com.accp.spring.nana.pojo;

import java.io.Serializable;

public class StuAttendanceS implements Serializable{
	
	/**
	 * 个人考勤记录表	
	 */
	private static final long serialVersionUID = -3319026145531664010L;
	private int saId;
	private int stuId;//学员Id	
	private int setId;//考勤情况	外键，关联扣分制度表
	private int score;//扣分（快照）
	private String remark;//备注	 
	private String time;//登记时间
	private int recordPerson;//登记人
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getRecordPerson() {
		return recordPerson;
	}
	public void setRecordPerson(int recordPerson) {
		this.recordPerson = recordPerson;
	}
	@Override
	public String toString() {
		return "StuAttendance [saId=" + saId + ", stuId=" + stuId + ", setId=" + setId + ", score=" + score
				+ ", remark=" + remark + ", time=" + time + ", recordPerson=" + recordPerson + "]";
	}
	
	
	

	
	/*个人考勤记录表	StuAttendance	 	 
字段	类型	字段描述	备注
saId	int	id	 
stuId	int	学员Id	 
setId	int	考勤情况	外键，关联扣分制度表
score	int	扣分（快照）	 用来记录当时扣分，防止扣分标准之后改变
remark	Varchar(500)	备注	 
time	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	登记时间	 
recordPerson	int	登记人	*/
}
