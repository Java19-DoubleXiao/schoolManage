package com.accp.springmvc.pojo;

public class Course {

	private int courseId;
	private String courseName;
	private int bookId;
	private int mu;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", bookId=" + bookId + "]";
	}
	public int getMu() {
		return mu;
	}
	public void setMu(int mu) {
		this.mu = mu;
	}
	
}
