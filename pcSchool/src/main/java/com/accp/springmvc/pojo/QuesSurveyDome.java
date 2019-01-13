package com.accp.springmvc.pojo;

public class QuesSurveyDome {

	private int domeId;
	private int domePerson;
	private int typeId;
	private String surveyPerson;
	private String createTime;
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public int getDomePerson() {
		return domePerson;
	}
	public void setDomePerson(int domePerson) {
		this.domePerson = domePerson;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getSurveyPerson() {
		return surveyPerson;
	}
	public void setSurveyPerson(String surveyPerson) {
		this.surveyPerson = surveyPerson;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "QuesSurveyDome [domeId=" + domeId + ", domePerson=" + domePerson + ", typeId=" + typeId
				+ ", surveyPerson=" + surveyPerson + ", createTime=" + createTime + "]";
	}
	
	
}
