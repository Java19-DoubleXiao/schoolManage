package com.accp.spring.xjq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.EventManage;
import com.accp.spring.pojo.EventTrack;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.xjq.pojo.EventManageVo;
import com.accp.spring.xjq.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/getAllEvent")
	public List<EventManageVo> selectAllEventsByContition(int teaId,int eventStates) {
		return this.eventService.selectAllEventsByContition(teaId, eventStates);
	}
	
	@PostMapping("/insertEvent")
	public void insertEvent(int[] stuIds,String eventContent,String etRemark,int teaId) {
		 this.eventService.insertEvent(stuIds, eventContent, etRemark, teaId);
	}
	
	@GetMapping("/selectEventById")
	public EventManageVo selectEventById(int eventId) {
		return this.eventService.selectEventById(eventId);
	}
	
	@GetMapping("/selectPersonByName")
	public Object selectByName(String name){
		return this.eventService.selectByName(name);
	}	
	
	
	@PostMapping("/insertEventTrack")
	public int insertEventTrack(@RequestBody EventTrack et) {
		return this.eventService.insertEventTrack(et);
	}
	
	@PutMapping("/updEventManage/{eventStates}/{eventId}")
	public int updEventManage(@PathVariable Integer eventStates,@PathVariable int eventId) {
		return this.eventService.updEventManage(eventStates, eventId);
	}
	
	
	
}
