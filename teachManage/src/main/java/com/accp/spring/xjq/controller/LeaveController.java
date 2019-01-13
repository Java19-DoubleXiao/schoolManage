package com.accp.spring.xjq.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.LeaveProcessTrack;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.xjq.pojo.LeaveDomeNodeVo;
import com.accp.spring.xjq.pojo.LeaveProcessTrackVo;
import com.accp.spring.xjq.pojo.LeaveProcessVo;
import com.accp.spring.xjq.service.LeaveService;

@RestController
@RequestMapping("/leave")
public class LeaveController {
	
	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/getAllLeave")
	public List<LeaveProcessVo> selectProcessWithMe(){
		return this.leaveService.selectProcessWithMe();
	}
	
	@GetMapping("/getLeaveById")
	public LeaveProcessVo selectProcessByleaveId(int leaveId){
		return this.leaveService.selectProcessByleaveId(leaveId);
	}
	
	@GetMapping("/getLeaveTrack")
	public List<LeaveProcessTrackVo> selectLeaveTrackByleaveId(int leaveId){
		return this.leaveService.selectLeaveTrackByleaveId(leaveId);
	}
	
	@PutMapping("/updLeaveTrack")
	public int updLeaveTrack(@RequestBody LeaveProcessTrack track) {
		return this.leaveService.updLeaveTrack(track);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
