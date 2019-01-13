package com.accp.springmvc.pojo;

public class QuestionDome {

	private int quesId;
	private int domeId;
	private String quesName;
	private int isUse;
	private int quesType;
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public String getQuesName() {
		return quesName;
	}
	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}
	public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	public int getQuesType() {
		return quesType;
	}
	public void setQuesType(int quesType) {
		this.quesType = quesType;
	}
	@Override
	public String toString() {
		return "QuestionDome [quesId=" + quesId + ", domeId=" + domeId + ", quesName=" + quesName + ", isUse=" + isUse
				+ ", quesType=" + quesType + "]";
	}
	
	
}
