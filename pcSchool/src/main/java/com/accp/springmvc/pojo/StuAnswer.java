package com.accp.springmvc.pojo;

public class StuAnswer {

	
	private int saId;
	private int examId;
	private int qtId;
	private int stuId;
	private String saAnswer;
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
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
	public String getSaAnswer() {
		return saAnswer;
	}
	public void setSaAnswer(String saAnswer) {
		this.saAnswer = saAnswer;
	}
	@Override
	public String toString() {
		return "StuAnswer [saId=" + saId + ", examId=" + examId + ", qtId=" + qtId + ", stuId=" + stuId + ", saAnswer="
				+ saAnswer + "]";
	}
	
	
}
