package com.accp.spring.nana.pojo;

import java.io.Serializable;

public class PunchCardSetting implements Serializable{
	
	/**
	 * 打卡时间设置表
	 */
	private static final long serialVersionUID = 4916302550029035067L;
	private int punchId;
	private String punchItem;//打卡项目	早上，下午放学，宿舍晚上考勤
	private String startTime;//开始打卡时间	 
	private String endTime;//结束打卡时间	 
	private String lateTime;//迟到打卡时间①	 
	private int setPerson;//	设置人	管理者
	private String setTime;//设置时间	
	private int lastUpdPerson;//最后修改人	管理者
	private String lastUpdTime;//最后修改时间	
	private int isForbid;//是否禁用	否1，是2
	public int getPunchId() {
		return punchId;
	}
	public void setPunchId(int punchId) {
		this.punchId = punchId;
	}
	public String getPunchItem() {
		return punchItem;
	}
	public void setPunchItem(String punchItem) {
		this.punchItem = punchItem;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getLateTime() {
		return lateTime;
	}
	public void setLateTime(String lateTime) {
		this.lateTime = lateTime;
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
	public int getLastUpdPerson() {
		return lastUpdPerson;
	}
	public void setLastUpdPerson(int lastUpdPerson) {
		this.lastUpdPerson = lastUpdPerson;
	}
	public String getLastUpdTime() {
		return lastUpdTime;
	}
	public void setLastUpdTime(String lastUpdTime) {
		this.lastUpdTime = lastUpdTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	@Override
	public String toString() {
		return "PunchCardSetting [punchId=" + punchId + ", punchItem=" + punchItem + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", lateTime=" + lateTime + ", setPerson=" + setPerson + ", setTime="
				+ setTime + ", lastUpdPerson=" + lastUpdPerson + ", lastUpdTime=" + lastUpdTime + ", isForbid="
				+ isForbid + "]";
	}
	
	
	
	
		/*打卡时间设置表
		 * 字段	类型	字段描述	备注
	punchId	int	id	 
	punchItem	Varchar（50）	打卡项目	早上，下午放学，宿舍晚上考勤
	startTime	datetime	开始打卡时间	 
	endTime	datetime	结束打卡时间	 
	lateTime	 int	迟到打卡时间①	 
	setPerson	Int	设置人	管理者
	setTime	datetime	设置时间	
	lastUpdPerson	int	最后修改人	管理者
	lastUpdTime	datetime	最后修改时间	
	isForbid	int	是否禁用	否1，是2*/

}
