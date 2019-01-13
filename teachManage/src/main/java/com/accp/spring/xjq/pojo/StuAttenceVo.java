package com.accp.spring.xjq.pojo;

public class StuAttenceVo {
	

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
	
	private String stuName;
	private String stuImage;
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
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuImage() {
		return stuImage;
	}
	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}
	@Override
	public String toString() {
		return "StuAttenceVo [saId=" + saId + ", stuId=" + stuId + ", setId=" + setId + ", score=" + score + ", remark="
				+ remark + ", time=" + time + ", recordPerson=" + recordPerson + ", stuName=" + stuName + ", stuImage="
				+ stuImage + "]";
	}
	
	

}
