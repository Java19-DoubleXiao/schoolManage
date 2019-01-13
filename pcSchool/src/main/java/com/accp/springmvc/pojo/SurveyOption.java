package com.accp.springmvc.pojo;

public class SurveyOption {

	private int optionId;
	private int quesId;
	private int opOrder;
	private String opContent;
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public int getOpOrder() {
		return opOrder;
	}
	public void setOpOrder(int opOrder) {
		this.opOrder = opOrder;
	}
	public String getOpContent() {
		return opContent;
	}
	public void setOpContent(String opContent) {
		this.opContent = opContent;
	}
	@Override
	public String toString() {
		return "SurveyOption [optionId=" + optionId + ", quesId=" + quesId + ", opOrder=" + opOrder + ", opContent="
				+ opContent + "]";
	}
	
	
}
