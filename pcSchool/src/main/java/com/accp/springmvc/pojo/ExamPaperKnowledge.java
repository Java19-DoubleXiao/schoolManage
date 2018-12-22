package com.accp.springmvc.pojo;

public class ExamPaperKnowledge {

	private int epkId;
	private int epId;
	private int knowId;
	private int count;
	public int getEpkId() {
		return epkId;
	}
	public void setEpkId(int epkId) {
		this.epkId = epkId;
	}
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "ExamPaperKnowledge [epkId=" + epkId + ", epId=" + epId + ", knowId=" + knowId + ", count=" + count
				+ "]";
	}
	
	
}
