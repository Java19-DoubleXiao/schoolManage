package com.accp.spring.pojo;

import java.io.Serializable;

public class AttendImg implements Serializable{
	
	/**
	 * 考勤记录图片
	 */
	private static final long serialVersionUID = 7015444393376026448L;
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
	
	
	

	/*考勤记录图片表	（AttendImg）	 	 
字段	数据类型	字段描述	备注
imgId	int	图片id	 
saId	int	考勤记录表id	 
imgPath	Varchar(300)	图片路径	 */
}
