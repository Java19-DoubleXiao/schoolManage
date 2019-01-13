package com.accp.spring.pojo;

import java.io.Serializable;

public class Notice implements Serializable{
	
	/**
	 *   // 公告表	Notice	
	 */
	private static final long serialVersionUID = -5587823781908321319L;
	private int noticeId;
	private int publishId;//发布人	 
	private String publishTime;//发布时间
	private int noticeType;//发布类型	向所有家长1、向所有学生2
	private String noticeTitle;//公告标题
	private String noticeContent;//公告内容
	private int updPerson;//	修改人	 
	private String updTime;//修改时间	
	private int noticeStates;//公告状态①	未删除1，已删除2
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public int getPublishId() {
		return publishId;
	}
	public void setPublishId(int publishId) {
		this.publishId = publishId;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public int getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(int noticeType) {
		this.noticeType = noticeType;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public int getUpdPerson() {
		return updPerson;
	}
	public void setUpdPerson(int updPerson) {
		this.updPerson = updPerson;
	}
	public String getUpdTime() {
		return updTime;
	}
	public void setUpdTime(String updTime) {
		this.updTime = updTime;
	}
	public int getNoticeStates() {
		return noticeStates;
	}
	public void setNoticeStates(int noticeStates) {
		this.noticeStates = noticeStates;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", publishId=" + publishId + ", publishTime=" + publishTime
				+ ", noticeType=" + noticeType + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
				+ ", updPerson=" + updPerson + ", updTime=" + updTime + ", noticeStates=" + noticeStates + "]";
	}
	
	
	
	/**
	 * 公告表	Notice	 	 
字段	类型	字段描述	备注
noticeId	int	Id	 
publishId	int	发布人	 
publishTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	发布时间	 
noticeType	int	发布类型	向所有家长1、向所有学生2
noticeTitle	Varchar(100)	公告标题	
noticeContent	Varchar(500)	公告内容	 
updPerson	int	修改人	 
updTime	datetime	修改时间	
noticeStates	int	公告状态①	未删除1，已删除2
	 */
}
