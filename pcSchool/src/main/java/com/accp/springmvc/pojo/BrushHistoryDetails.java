package com.accp.springmvc.pojo;

public class BrushHistoryDetails {

	private int bhdId;
	private int bhId;
	private int qtId;
	private String rightAnswer;
	private String stuAnswer;
	public int getBhdId() {
		return bhdId;
	}
	public void setBhdId(int bhdId) {
		this.bhdId = bhdId;
	}
	public int getBhId() {
		return bhId;
	}
	public void setBhId(int bhId) {
		this.bhId = bhId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getStuAnswer() {
		return stuAnswer;
	}
	public void setStuAnswer(String stuAnswer) {
		this.stuAnswer = stuAnswer;
	}
	@Override
	public String toString() {
		return "BrushHistoryDetails [bhdId=" + bhdId + ", bhId=" + bhId + ", qtId=" + qtId + ", rightAnswer="
				+ rightAnswer + ", stuAnswer=" + stuAnswer + "]";
	}
	
	
}
