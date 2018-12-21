package com.accp.spring.pojo;

import java.io.Serializable;

public class LeaveProcessDome implements Serializable{
	
	
	/**
	 * 请假流程模板表
	 */
	private static final long serialVersionUID = -2360742850467128933L;
	private int domeId;
	private String domeType;
	private int createPerson;
	private String createTime;
	private int isForbid;
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public String getDomeType() {
		return domeType;
	}
	public void setDomeType(String domeType) {
		this.domeType = domeType;
	}
	public int getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(int createPerson) {
		this.createPerson = createPerson;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	@Override
	public String toString() {
		return "LeaveProcessDome [domeId=" + domeId + ", domeType=" + domeType + ", createPerson=" + createPerson
				+ ", createTime=" + createTime + ", isForbid=" + isForbid + "]";
	}
	
	
	/*请假流程模板表	LeaveProcessDome	 	 
字段	类型	字段描述	备注
domeId	int	模板id	 
domeType	Varchar(50)	模板名称	学生请病假、休学
createPerson	int	创建人	管理者
createTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	创建时间	
isForbid	int	是否禁用	否1，是2*/
}
