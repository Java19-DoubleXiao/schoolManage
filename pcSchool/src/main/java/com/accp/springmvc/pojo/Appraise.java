package com.accp.springmvc.pojo;

public class Appraise {

	private int id;
	private int appraise;
	private int stuId;
	private int analyzeId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppraise() {
		return appraise;
	}
	public void setAppraise(int appraise) {
		this.appraise = appraise;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getAnalyzeId() {
		return analyzeId;
	}
	public void setAnalyzeId(int analyzeId) {
		this.analyzeId = analyzeId;
	}
	@Override
	public String toString() {
		return "Appraise [id=" + id + ", appraise=" + appraise + ", stuId=" + stuId + ", analyzeId=" + analyzeId + "]";
	}
	
	
}
