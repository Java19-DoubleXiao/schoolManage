package com.accp.spring.hq.vo;

import java.io.Serializable;

public class Exammation implements Serializable{
	private int examId;
	private String paperName;
	
	private String cName;
	private String times;
	
	private String startTime;
	private String testRange;
	private int count;
	private double average;
	
	
	
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getTestRange() {
		return testRange;
	}
	public void setTestRange(String testRange) {
		this.testRange = testRange;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Exammation [examId=" + examId + ", paperName=" + paperName + ", startTime=" + startTime + ", testRange="
				+ testRange + ", count=" + count + ", average=" + average + "]";
	}

	
	
}
