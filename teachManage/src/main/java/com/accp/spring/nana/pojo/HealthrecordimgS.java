package com.accp.spring.nana.pojo;

import java.io.Serializable;
/**
 * 寝室卫生检查图片表
 * @author 巴拉巴拉大灰狼
 *
 */
public class HealthrecordimgS implements Serializable{
	private int imgId;//图片id
	private int HealthRecordId;//查寝事件记录Id
	private int dormMangeId;//宿管Id
	private String imgPath;//图片路径
	public int getImgId() {
		return imgId;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public int getHealthRecordId() {
		return HealthRecordId;
	}
	public void setHealthRecordId(int healthRecordId) {
		HealthRecordId = healthRecordId;
	}
	public int getDormMangeId() {
		return dormMangeId;
	}
	public void setDormMangeId(int dormMangeId) {
		this.dormMangeId = dormMangeId;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	@Override
	public String toString() {
		return "Healthrecordimg [imgId=" + imgId + ", HealthRecordId=" + HealthRecordId + ", dormMangeId=" + dormMangeId
				+ ", imgPath=" + imgPath + "]";
	}
	
	
	
}
