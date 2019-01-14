package com.accp.spring.nana.pojo;

import java.io.Serializable;

public class ScoreSettingS implements Serializable{
	/**
	 * 扣分规则表
	 */
	private static final long serialVersionUID = 1401938114262925515L;
	private int setId;
	private String setItem; //扣分项目
	private int setScore; //扣分数目
	private int setType; //扣分类型
	private int setSort; //扣分类别
	private String setRemark;  //备注
	private int setPerson; //创建人
	private String setTime;  //创建时间
	private int lastSetPerson; //	最后修改人
	private String lastSetTime; //最后修改时间
	private int isUse; //是否启用
	
	
	
	public int getSetId() {
		return setId;
	}



	public void setSetId(int setId) {
		this.setId = setId;
	}



	public String getSetItem() {
		return setItem;
	}



	public void setSetItem(String setItem) {
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



	public int getSetSort() {
		return setSort;
	}



	public void setSetSort(int setSort) {
		this.setSort = setSort;
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



	public int getLastSetPerson() {
		return lastSetPerson;
	}



	public void setLastSetPerson(int lastSetPerson) {
		this.lastSetPerson = lastSetPerson;
	}



	public String getLastSetTime() {
		return lastSetTime;
	}



	public void setLastSetTime(String lastSetTime) {
		this.lastSetTime = lastSetTime;
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
				+ setType + ", setSort=" + setSort + ", setRemark=" + setRemark + ", setPerson=" + setPerson
				+ ", setTime=" + setTime + ", lastSetPerson=" + lastSetPerson + ", lastSetTime=" + lastSetTime
				+ ", isUse=" + isUse + "]";
	}
	
	
	
	
	/*setId	int	id	 
setItem	varchar	扣分项目	 
setScore	int	扣分数目	根据扣分类型扣分
setType	int	扣分类型	学生1，宿舍2  ①
setSort	int	扣分类别	考勤1，纪律2，卫生3，其他4
setRemark	Varchar(500)	备注	 
setPerson	 int	创建人	 管理层
setTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	创建时间	
lastSetPerson	int	最后修改人	管理层
lastSetTime	datetime	最后修改时间	
isUse	int	是否启用②	启用1，不启用2*/
}
