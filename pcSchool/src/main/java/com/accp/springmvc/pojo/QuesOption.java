package com.accp.springmvc.pojo;

public class QuesOption {

	private int opId;
	private int qtId;
	private String opOrder;
	private String rightOption;
	private int IsRight;
	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getOpOrder() {
		return opOrder;
	}
	public void setOpOrder(String opOrder) {
		this.opOrder = opOrder;
	}
	public String getRightOption() {
		return rightOption;
	}
	public void setRightOption(String rightOption) {
		this.rightOption = rightOption;
	}
	public int getIsRight() {
		return IsRight;
	}
	public void setIsRight(int isRight) {
		IsRight = isRight;
	}
	@Override
	public String toString() {
		return "QuesOption [opId=" + opId + ", qtId=" + qtId + ", opOrder=" + opOrder + ", rightOption=" + rightOption
				+ ", IsRight=" + IsRight + "]";
	}
	
	
}
