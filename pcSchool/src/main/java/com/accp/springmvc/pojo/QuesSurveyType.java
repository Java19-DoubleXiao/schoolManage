package com.accp.springmvc.pojo;

public class QuesSurveyType {

	private int typeId;
	private String surveyType;
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getSurveyType() {
		return surveyType;
	}
	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}
	@Override
	public String toString() {
		return "QuesSurveyType [typeId=" + typeId + ", surveyType=" + surveyType + "]";
	}
	
	
}
