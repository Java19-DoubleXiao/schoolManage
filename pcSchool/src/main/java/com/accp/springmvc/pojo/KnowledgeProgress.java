package com.accp.springmvc.pojo;

public class KnowledgeProgress {

	private int kpId;
	private int stuId;
	private int KnowId;
	private double percent;
	private int progressCount;
	public int getKpId() {
		return kpId;
	}
	public void setKpId(int kpId) {
		this.kpId = kpId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getKnowId() {
		return KnowId;
	}
	public void setKnowId(int knowId) {
		KnowId = knowId;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getProgressCount() {
		return progressCount;
	}
	public void setProgressCount(int progressCount) {
		this.progressCount = progressCount;
	}
	@Override
	public String toString() {
		return "KnowledgeProgress [kpId=" + kpId + ", stuId=" + stuId + ", KnowId=" + KnowId + ", percent=" + percent
				+ ", progressCount=" + progressCount + "]";
	}
	
	
}
