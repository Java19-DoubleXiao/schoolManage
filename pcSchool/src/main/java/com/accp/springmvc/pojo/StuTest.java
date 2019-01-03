package com.accp.springmvc.pojo;

public class StuTest {

	private int stuTest;
	private int stuId;
	private int examId;
	private int status;
	private String startTime;
	private String commitTime;
	private int commitStyle;
	private int score;
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
				+ ", score=" + score + "]";
	}
	
	
}
