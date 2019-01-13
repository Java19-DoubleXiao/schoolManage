package com.accp.springmvc.pojo;

public class Analyze {

	private int analyzeId;
	private int qtId;
	private String analyzeContent;
	private int stuId;
	private String analyzeTime;
	private int yes;
	private int no;
	public int getAnalyzeId() {
		return analyzeId;
	}
	public void setAnalyzeId(int analyzeId) {
		this.analyzeId = analyzeId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getAnalyzeContent() {
		return analyzeContent;
	}
	public void setAnalyzeContent(String analyzeContent) {
		this.analyzeContent = analyzeContent;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getAnalyzeTime() {
		return analyzeTime;
	}
	public void setAnalyzeTime(String analyzeTime) {
		this.analyzeTime = analyzeTime;
	}
	public int getYes() {
		return yes;
	}
	public void setYes(int yes) {
		this.yes = yes;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Analyze [analyzeId=" + analyzeId + ", qtId=" + qtId + ", analyzeContent=" + analyzeContent + ", stuId="
				+ stuId + ", analyzeTime=" + analyzeTime + ", yes=" + yes + ", no=" + no + "]";
	}
	
}
