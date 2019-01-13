package com.accp.spring.nana.pojo;

import java.io.Serializable;
/**
 * 不住寝登记表
 * @author 巴拉巴拉大灰狼
 *
 */
public class Registerleave implements Serializable{
	private int id;//不住寝登记表id
	private int stuId;//学员id
	private String startTime;//请假开始时间
	private String endTime;//请假结束时间
	private String writeTime;//填写请假时间
	private int dormMangeId;//登记人(宿管)
	private String recordTime;//宿管登记时间
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
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	public int getDormMangeId() {
		return dormMangeId;
	}
	public void setDormMangeId(int dormMangeId) {
		this.dormMangeId = dormMangeId;
	}
	public String getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
	@Override
	public String toString() {
		return "Registerleave [id=" + id + ", stuId=" + stuId + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", writeTime=" + writeTime + ", dormMangeId=" + dormMangeId + ", recordTime=" + recordTime + "]";
	}
	
}
