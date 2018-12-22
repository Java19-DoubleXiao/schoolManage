package com.accp.springmvc.pojo;

public class AttendImg {

	private int imgId;
	private int saId;
	private String imgPath;
	public int getImgId() {
		return imgId;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	@Override
	public String toString() {
		return "AttendImg [imgId=" + imgId + ", saId=" + saId + ", imgPath=" + imgPath + "]";
	}
	
	
}
