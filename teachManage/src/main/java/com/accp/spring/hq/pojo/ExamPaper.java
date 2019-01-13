package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class ExamPaper  implements Serializable{
    private int epId;
    private String epName;//试卷模板名称
    private int score;//评分标准
    private String testRange;//考试范围
    private int teaId;//试卷模板发布人Id
    private String epSendTime;//试卷模板发布时间
    private int gId;//属于哪个年级
    private int useCount;//试卷模板使用次数
    private int testTime;//考试用时
    private int isForbid;//是否禁用 1:否 2:是
    
    
    @Override
	public String toString() {
		return "Exampaper [epId=" + epId + ", epName=" + epName + ", score=" + score + ", testRange=" + testRange
				+ ", teaId=" + teaId + ", epSendTime=" + epSendTime + ", gId=" + gId + ", useCount=" + useCount
				+ ", testTime=" + testTime + ", isForbid=" + isForbid + "]";
	}


	public int getEpId() {
		return epId;
	}


	public void setEpId(int epId) {
		this.epId = epId;
	}


	public String getEpName() {
		return epName;
	}


	public void setEpName(String epName) {
		this.epName = epName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getTestRange() {
		return testRange;
	}


	public void setTestRange(String testRange) {
		this.testRange = testRange;
	}


	public int getTeaId() {
		return teaId;
	}


	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}


	public String getEpSendTime() {
		return epSendTime;
	}


	public void setEpSendTime(String epSendTime) {
		this.epSendTime = epSendTime;
	}


	public int getgId() {
		return gId;
	}


	public void setgId(int gId) {
		this.gId = gId;
	}


	public int getUseCount() {
		return useCount;
	}


	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}


	public int getTestTime() {
		return testTime;
	}


	public void setTestTime(int testTime) {
		this.testTime = testTime;
	}


	public int getIsForbid() {
		return isForbid;
	}


	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}


	public ExamPaper() {
        super();
    }
    

}
