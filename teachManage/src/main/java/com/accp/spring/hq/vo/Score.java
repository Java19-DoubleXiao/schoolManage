package com.accp.spring.hq.vo;

import java.io.Serializable;

public class Score implements Serializable{
	private String paperName;
	private String stuName;
	private int score;
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [paperName=" + paperName + ", stuName=" + stuName + ", score=" + score + "]";
	}
	
}
