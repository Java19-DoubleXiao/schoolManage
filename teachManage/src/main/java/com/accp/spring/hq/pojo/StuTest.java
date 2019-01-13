package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class StuTest  implements Serializable{
    private int stuTest;
    private int stuId;//学员id
    private int examId;//考试试卷id
    private int status;//考试状态	未考1，正在考2，已交卷3
    private String startTime;//开考时间
    private String commitTime;//交卷时间
    private int commitStyle;//交卷方式 自己交卷1、超时系统自动交卷2
    private int score;//考试分数
    
    private String stuName;//同学姓名
    private String stuImage;//头像
    
	public String getStuImage() {
		return stuImage;
	}
	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuTest() {
		return stuTest;
	}
	public void setStuTest(int stuTest) {
		this.stuTest = stuTest;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getCommitTime() {
		return commitTime;
	}
	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}
	public int getCommitStyle() {
		return commitStyle;
	}
	public void setCommitStyle(int commitStyle) {
		this.commitStyle = commitStyle;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "StuTest [stuTest=" + stuTest + ", stuId=" + stuId + ", examId=" + examId + ", status=" + status
				+ ", startTime=" + startTime + ", commitTime=" + commitTime + ", commitStyle=" + commitStyle
				+ ", score=" + score + ", stuName=" + stuName + ", stuImage=" + stuImage + "]";
	}
	
    
    
}
