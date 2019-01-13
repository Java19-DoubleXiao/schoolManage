package com.accp.springmvc.pojo;

public class SurveyQuestion {

	private int quesId;
	private int surveyId;
	private String question;
	private int isOthers;
	private int quesType;
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getIsOthers() {
		return isOthers;
	}
	public void setIsOthers(int isOthers) {
		this.isOthers = isOthers;
	}
	public int getQuesType() {
		return quesType;
	}
	public void setQuesType(int quesType) {
		this.quesType = quesType;
	}
	@Override
	public String toString() {
		return "SurveyQuestion [quesId=" + quesId + ", surveyId=" + surveyId + ", question=" + question + ", isOthers="
				+ isOthers + ", quesType=" + quesType + "]";
	}
	
	
}
