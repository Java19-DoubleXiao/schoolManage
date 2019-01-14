package com.accp.spring.nana.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.nana.service.RepairsService;

import lombok.experimental.PackagePrivate;

@CrossOrigin
@RestController
@RequestMapping("/Repair")
public class RepairsController {
	
	@Autowired
	RepairsService repairsService;
	
	//
	@GetMapping("/selectRepairStates/{dormMangeId}")
	public Object selectRepairStates(@PathVariable int dormMangeId) {
		return this.repairsService.selectRepairStates(dormMangeId);
	}
	@GetMapping("/selectRepairs/{repairStates}/{dormMangeId}")
	public Object selectRepairs(@PathVariable int repairStates,@PathVariable int dormMangeId) {
		return this.repairsService.selectRepairs(repairStates,dormMangeId);
	}
	@GetMapping("/selectRepairsDetail/{id}")
	public Object selectRepairsDetail(@PathVariable int id) {
		return this.repairsService.selectRepairsDetail(id);
	}
	//修改报修状态
	@PutMapping("/update/{repairStates}/{id}")
	public int updateStates(@PathVariable int repairStates, @PathVariable int id) {
		return this.repairsService.updateStates(repairStates,id);
	}
	
	@DeleteMapping("/deleteRepairs/{id}")
	public int deleteRepairs(@PathVariable int id) {
		return this.repairsService.deleteRepairs(id);
	}

}