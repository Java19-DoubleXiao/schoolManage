package com.accp.springmvc.pojo;

public class ExamPaper {

	private int epId;
	private String epName;
	private int score;
	private String testRange;
	private int teaId;
	private String epSendTime;
	private int gId;
	private int useCount;
	private int testTime;
	private int isForbid;
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getEpName() {
		return epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTestRange() {
		return testRange;
	}
	public void setTestRange(String testRange) {
		this.testRange = testRange;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getEpSendTime() {
		return epSendTime;
	}
	public void setEpSendTime(String epSendTime) {
		this.epSendTime = epSendTime;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public int getTestTime() {
		return testTime;
	}
	public void setTestTime(int testTime) {
		this.testTime = testTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	@Override
	public String toString() {
		return "ExamPaper [epId=" + epId + ", epName=" + epName + ", score=" + score + ", testRange=" + testRange
				+ ", teaId=" + teaId + ", epSendTime=" + epSendTime + ", gId=" + gId + ", useCount=" + useCount
				+ ", testTime=" + testTime + ", isForbid=" + isForbid + "]";
	}
	
	
}
