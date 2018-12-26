package com.accp.springmvc.pojo;

public class ExamPaperHistory {

	private int paperId;
	private int epId;
	private String paperName;
	private double passrate;
	private int useCount;
	private String createTime;
	private int createPerson;
	private String lastUpdTime;
	private int lastUpdPerson;
	private int isForbid;
	private int mu1;
	@Override
	public String toString() {
		return "ExamPaperHistory [paperId=" + paperId + ", epId=" + epId + ", paperName=" + paperName + ", passrate="
				+ passrate + ", useCount=" + useCount + ", createTime=" + createTime + ", createPerson=" + createPerson
				+ ", lastUpdTime=" + lastUpdTime + ", lastUpdPerson=" + lastUpdPerson + ", isForbid=" + isForbid + "]";
	}
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public double getPassrate() {
		return passrate;
	}
	public void setPassrate(double passrate) {
		this.passrate = passrate;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(int createPerson) {
		this.createPerson = createPerson;
	}
	public String getLastUpdTime() {
		return lastUpdTime;
	}
	public void setLastUpdTime(String lastUpdTime) {
		this.lastUpdTime = lastUpdTime;
	}
	public int getLastUpdPerson() {
		return lastUpdPerson;
	}
	public void setLastUpdPerson(int lastUpdPerson) {
		this.lastUpdPerson = lastUpdPerson;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	public int getMu1() {
		return mu1;
	}
	public void setMu1(int mu1) {
		this.mu1 = mu1;
	}
	
	
}
