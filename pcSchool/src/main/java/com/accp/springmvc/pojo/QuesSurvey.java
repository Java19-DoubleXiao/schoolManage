package com.accp.springmvc.pojo;

public class QuesSurvey {

	private int surveyId;
	private int domeId;
	private String surveyTitle;
	private String surveyTime;
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public String getSurveyTitle() {
		return surveyTitle;
	}
	public void setSurveyTitle(String surveyTitle) {
		this.surveyTitle = surveyTitle;
	}
	public String getSurveyTime() {
		return surveyTime;
	}
	public void setSurveyTime(String surveyTime) {
		this.surveyTime = surveyTime;
	}
	@Override
	public String toString() {
		return "QuesSurvey [surveyId=" + surveyId + ", domeId=" + domeId + ", surveyTitle=" + surveyTitle
				+ ", surveyTime=" + surveyTime + "]";
	}
	
	
}
