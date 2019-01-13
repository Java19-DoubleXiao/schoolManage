package com.accp.springmvc.pojo;

public class Question {

	private int qtId;
	private String qtQuest;
	private int knowId;
	private  String qtSendTime;
	private int teaId;
	private int privary;
	private int isDel;
	private int tishu;
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getQtQuest() {
		return qtQuest;
	}
	public void setQtQuest(String qtQuest) {
		this.qtQuest = qtQuest;
	}
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public String getQtSendTime() {
		return qtSendTime;
	}
	public void setQtSendTime(String qtSendTime) {
		this.qtSendTime = qtSendTime;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public int getPrivary() {
		return privary;
	}
	public void setPrivary(int privary) {
		this.privary = privary;
	}
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	@Override
	public String toString() {
		return "Question [qtId=" + qtId + ", qtQuest=" + qtQuest + ", knowId=" + knowId + ", qtSendTime=" + qtSendTime
				+ ", teaId=" + teaId + ", privary=" + privary + ", isDel=" + isDel + "]";
	}
	public int getTishu() {
		return tishu;
	}
	public void setTishu(int tishu) {
		this.tishu = tishu;
	}
	
	
	
}
