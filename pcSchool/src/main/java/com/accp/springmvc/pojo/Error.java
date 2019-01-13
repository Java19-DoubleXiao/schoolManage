package com.accp.springmvc.pojo;

public class Error {

	private int errorId;
	private int qtId;
	private int stuId;
	private String recentlyAnswer;
	private int answerCount;
	private int errorCount;
	private String lastAnswerTime;
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getRecentlyAnswer() {
		return recentlyAnswer;
	}
	public void setRecentlyAnswer(String recentlyAnswer) {
		this.recentlyAnswer = recentlyAnswer;
	}
	public int getAnswerCount() {
		return answerCount;
	}
	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}
	public int getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}
	public String getLastAnswerTime() {
		return lastAnswerTime;
	}
	public void setLastAnswerTime(String lastAnswerTime) {
		this.lastAnswerTime = lastAnswerTime;
	}
	@Override
	public String toString() {
		return "Error [errorId=" + errorId + ", qtId=" + qtId + ", stuId=" + stuId + ", recentlyAnswer="
				+ recentlyAnswer + ", answerCount=" + answerCount + ", errorCount=" + errorCount + ", lastAnswerTime="
				+ lastAnswerTime + "]";
	}
	
}
