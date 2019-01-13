package com.accp.springmvc.pojo;

public class ScoreSetting {

	private int setId;
	private int setItem;
	private int setScore;
	private int setType;
	private String setRemark;
	private int setPerson;
	private String setTime;
	private int setSort;
	private String lastSetTime;
	private int lastSetPerson;
	private int isUse;
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public int getSetItem() {
		return setItem;
	}
	public void setSetItem(int setItem) {
		this.setItem = setItem;
	}
	public int getSetScore() {
		return setScore;
	}
	public void setSetScore(int setScore) {
		this.setScore = setScore;
	}
	public int getSetType() {
		return setType;
	}
	public void setSetType(int setType) {
		this.setType = setType;
	}
	public String getSetRemark() {
		return setRemark;
	}
	public void setSetRemark(String setRemark) {
		this.setRemark = setRemark;
	}
	public int getSetPerson() {
		return setPerson;
	}
	public void setSetPerson(int setPerson) {
		this.setPerson = setPerson;
	}
	public String getSetTime() {
		return setTime;
	}
	public void setSetTime(String setTime) {
		this.setTime = setTime;
	}
	public int getSetSort() {
		return setSort;
	}
	public void setSetSort(int setSort) {
		this.setSort = setSort;
	}
	public String getLastSetTime() {
		return lastSetTime;
	}
	public void setLastSetTime(String lastSetTime) {
		this.lastSetTime = lastSetTime;
	}
	public int getLastSetPerson() {
		return lastSetPerson;
	}
	public void setLastSetPerson(int lastSetPerson) {
		this.lastSetPerson = lastSetPerson;
	}
	public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	@Override
	public String toString() {
		return "ScoreSetting [setId=" + setId + ", setItem=" + setItem + ", setScore=" + setScore + ", setType="
				+ setType + ", setRemark=" + setRemark + ", setPerson=" + setPerson + ", setTime=" + setTime
				+ ", setSort=" + setSort + ", lastSetTime=" + lastSetTime + ", lastSetPerson=" + lastSetPerson
				+ ", isUse=" + isUse + "]";
	}
	
	
}
