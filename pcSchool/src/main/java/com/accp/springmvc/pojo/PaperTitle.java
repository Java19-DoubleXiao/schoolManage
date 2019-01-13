package com.accp.springmvc.pojo;

public class PaperTitle {

	private int ptId;
	private int qtId;
	private int examId;
	public int getPtId() {
		return ptId;
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	@Override
	public String toString() {
		return "PaperTitle [ptId=" + ptId + ", qtId=" + qtId + ", examId=" + examId + "]";
	}
	
	
	
}
