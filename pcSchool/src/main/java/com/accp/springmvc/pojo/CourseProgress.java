package com.accp.springmvc.pojo;

public class CourseProgress {

	private int cpId;
	private int stuId;
	private int courseId;
	private double percent;
	private int progressCount;
	public int getCpId() {
		return cpId;
	}
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getProgressCount() {
		return progressCount;
	}
	public void setProgressCount(int progressCount) {
		this.progressCount = progressCount;
	}
	@Override
	public String toString() {
		return "CourseProgress [cpId=" + cpId + ", stuId=" + stuId + ", courseId=" + courseId + ", percent=" + percent
				+ ", progressCount=" + progressCount + "]";
	}
	
	
}
