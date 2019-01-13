package com.accp.spring.xjq.pojo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.EventPerson;
import com.accp.spring.pojo.EventTrack;

public class EventManageVo implements Serializable{

	/**
	 *  //  学生事件表	EventManage
	 */
	private static final long serialVersionUID = -7697318179392479945L;
	private int eventId;
	//private int stuId;//学员id	
	private String eventContent;//什么事件	打架、旷课、晚归.....
	private String eventRemark;//备注		
	private String startTime;//事件开始时间	 
	private int eventStates;//处理状态	正在处理1，处理完成2
	private int startPerson;//事件发起人	记录人
	private String teaName;//记录人老师姓名
	private List<EventPersonVo> stuIds;
	private List<EventTrack> tracks;
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
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
	public List<EventPersonVo> getStuIds() {
		return stuIds;
	}
	public void setStuIds(List<EventPersonVo> stuIds) {
		this.stuIds = stuIds;
	}
	public List<EventTrack> getTracks() {
		return tracks;
	}
	public void setTracks(List<EventTrack> tracks) {
		this.tracks = tracks;
	}
	
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	@Override
	public String toString() {
		return "EventManageVo [eventId=" + eventId + ", eventContent=" + eventContent + ", eventRemark=" + eventRemark
				+ ", startTime=" + startTime + ", eventStates=" + eventStates + ", startPerson=" + startPerson
				+ ", teaName=" + teaName + ", stuIds=" + stuIds + ", tracks=" + tracks + "]";
	}

	
	
}
