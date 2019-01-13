package com.accp.spring.hq.vo;

import java.io.Serializable;

public class Dor implements Serializable{
	private String dormNum;
	private String teaName;
	public String getDormNum() {
		return dormNum;
	}
	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	
	
}
