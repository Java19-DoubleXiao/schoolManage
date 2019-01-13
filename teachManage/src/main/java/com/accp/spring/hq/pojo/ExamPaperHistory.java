package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class ExamPaperHistory  implements Serializable{
    private int paperId;
    private int epId;//试卷id
    private String paperName;//试卷名称
    private int passrate;//合格率
    private int useCount;//试卷使用次数
    private String createTime;//试卷创建时间
    private int createPerson;//试卷创建人
    private String lastUpdTime;//最后修改时间
    private int lastUpdPerson;//最后修改人
    private int isForbid;//是否禁用 1:否 2:是
    
    
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
	public int getPassrate() {
		return passrate;
	}
	public void setPassrate(int passrate) {
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
	
	@Override
	public String toString() {
		return "ExampaperHistory [paperId=" + paperId + ", epId=" + epId + ", paperName=" + paperName + ", passrate="
				+ passrate + ", useCount=" + useCount + ", createTime=" + createTime + ", createPerson=" + createPerson
				+ ", lastUpdTime=" + lastUpdTime + ", lastUpdPerson=" + lastUpdPerson + ", isForbid=" + isForbid + "]";
	}
   
    
}
