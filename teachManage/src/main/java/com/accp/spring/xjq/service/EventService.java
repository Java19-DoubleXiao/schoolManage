package com.accp.spring.xjq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.EventManage;
import com.accp.spring.pojo.EventPerson;
import com.accp.spring.pojo.EventTrack;
import com.accp.spring.pojo.Parents;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.xjq.mapper.EventMapper;
import com.accp.spring.xjq.pojo.EventManageVo;

@Service
public class EventService {
	
	@Autowired
	private EventMapper eventMapper;
	
	@Transactional
	public List<EventManageVo> selectAllEventsByContition(int teaId,int eventStates) {
		List<EventManageVo> eventList = null;
		if(eventStates > 0) {
			//等同于按状态查
			eventList = this.eventMapper.selectAllEventBystates(eventStates);
		}else {
			//等同于按老师Id查
			eventList = this.eventMapper.selectAllEventByteaId(teaId);
		}
		
		for (EventManageVo ev : eventList) {
			ev.setStuIds(this.eventMapper.selectPersonByeventId(ev.getEventId()));
			ev.setTracks(this.eventMapper.selectTrackByeventId(ev.getEventId()));
		}
		return eventList;
	}
	
	
	
	
	@Transactional
	public void insertEvent(int[] stuIds,String eventContent,String etRemark,int teaId) {
		EventManage event = new EventManage();
		event.setEventContent(eventContent);
		event.setEventRemark(etRemark);
		event.setEventStates(1);
		event.setStartPerson(teaId);
		int i = this.eventMapper.insertEventManage(event);
		
		for (int stuId : stuIds) {
			EventPerson ep = new EventPerson();
			ep.setEventId(event.getEventId());
			ep.setStuId(stuId);
			this.eventMapper.insertEventPerson(ep);
		}
	}
	
	
	public EventManageVo selectEventById(int eventId) {
		EventManageVo event = this.eventMapper.selectEventById(eventId);
		event.setStuIds(this.eventMapper.selectPersonByeventId(event.getEventId()));
		event.setTracks(this.eventMapper.selectTrackByeventId(event.getEventId()));
		return event;
	}
	
	/**
	 * 根据姓名查询数据库里是否有这个老师或是家长
	 * @param name
	 * @return
	 */
	@Transactional
	public Object selectByName(String name){
		Teacher tea = this.eventMapper.selectTeaByName(name);
		if(tea != null) {
			return tea;
		}
		Parents parent = this.eventMapper.selectParentBypName(name);
		if(parent != null) {
			return parent;
		}
		return null;
	}

	
	public int insertEventTrack(EventTrack et) {
		return this.eventMapper.insertEventTrack(et);
	}	
	
	
	
	public int updEventManage(Integer eventStates,int eventId) {
		return this.eventMapper.updEventManage(eventStates, eventId);
	}
	
	
	
	
	
	
	
	

}
