package com.accp.springmvc.pojo;

public class SurveyAnswer {

	private int answerId;
	private int surveyId;
	private int optionId;
	private String answer;
	private int userId;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "SurveyAnswer [answerId=" + answerId + ", surveyId=" + surveyId + ", optionId=" + optionId + ", answer="
				+ answer + ", userId=" + userId + "]";
	}
	
	
}
