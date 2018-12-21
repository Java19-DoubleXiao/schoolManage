package com.accp.spring.pojo;

import java.io.Serializable;

public class EventManage implements Serializable{

	/**
	 *  //  学生事件表	EventManage
	 */
	private static final long serialVersionUID = -7697318179392479945L;
	private int eventId;
	private int stuId;//学员id	
	private String eventContent;//什么事件	打架、旷课、晚归.....
	private String eventRemark;//备注		
	private String startTime;//事件开始时间	 
	private int eventStates;//处理状态	正在处理1，处理完成2
	private int startPerson;//事件发起人	记录人
	

	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public String getEventRemark() {
		return eventRemark;
	}

	public void setEventRemark(String eventRemark) {
		this.eventRemark = eventRemark;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public int getEventStates() {
		return eventStates;
	}
	public void setEventStates(int eventStates) {
		this.eventStates = eventStates;
	}

	public int getStartPerson() {
		return startPerson;
	}

	public void setStartPerson(int startPerson) {
		this.startPerson = startPerson;
	}

	@Override
	public String toString() {
		return "EventManage [eventId=" + eventId + ", stuId=" + stuId + ", eventContent=" + eventContent
				+ ", eventRemark=" + eventRemark + ", startTime=" + startTime + ", eventStates=" + eventStates
				+ ", startPerson=" + startPerson + "]";
	}
	
	

	/**
	 * 学生事件表	EventManage	 	 
	字段	类型	字段描述	备注
	eventId	int	Id	 
	stuId	int	学员id	
	eventContent	Varchar(50)	什么事件	打架、旷课、晚归.....
	eventRemark	Varchar(500)	备注	
	startTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	事件开始时间	 
	eventStates	int	处理状态	正在处理1，处理完成2
	startPerson	int	事件发起人	记录人
	 */
	
}
