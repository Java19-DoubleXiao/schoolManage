package com.accp.springmvc.pojo;

public class Face {

	private int faceId;
	private int stuId;
	private String face;
	@Override
	public String toString() {
		return "Face [faceId=" + faceId + ", stuId=" + stuId + ", face=" + face + "]";
	}
	public int getFaceId() {
		return faceId;
	}
	public void setFaceId(int faceId) {
		this.faceId = faceId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	
	
}
