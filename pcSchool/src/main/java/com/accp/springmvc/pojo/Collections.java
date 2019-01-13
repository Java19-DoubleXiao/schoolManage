package com.accp.springmvc.pojo;

public class Collections {

	private int collectId;
	private int stuId;
	private int qtId;
	private String collectTime;
	public int getCollectId() {
		return collectId;
	}
	public void setCollectId(int collectId) {
		this.collectId = collectId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}
	@Override
	public String toString() {
		return "Collection [collectId=" + collectId + ", stuId=" + stuId + ", qtId=" + qtId + ", collectTime="
				+ collectTime + "]";
	}
	
	
}
