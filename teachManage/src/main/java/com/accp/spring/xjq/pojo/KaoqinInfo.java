package com.accp.spring.xjq.pojo;

import java.io.Serializable;
import java.util.List;

public class KaoqinInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7935226570425104851L;
	private int setId;
	private String setItem;
	private int setScore;
	private int count;//人数
	
	private String cName;
	private String time;
	private int stuId;
	private String stuName;
	private String stuImage;
	private List<ClassStudent> students;
	
	
	
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public String getSetItem() {
		return setItem;
	}
	public void setSetItem(String setItem) {
		this.setItem = setItem;
	}
	public int getSetScore() {
		return setScore;
	}
	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<ClassStudent> getStudents() {
		return students;
	}
	public void setStudents(List<ClassStudent> students) {
		this.students = students;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "KaoqinInfo [setId=" + setId + ", setItem=" + setItem + ", setScore=" + setScore + ", count=" + count
				+ ", cName=" + cName + ", time=" + time + ", stuId=" + stuId + ", stuName=" + stuName + ", stuImage="
				+ stuImage + ", students=" + students + "]";
	}
	
	

}
