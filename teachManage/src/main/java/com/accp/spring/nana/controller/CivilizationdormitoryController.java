package com.accp.spring.nana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.nana.pojo.CivilizationdormitoryS;
import com.accp.spring.nana.service.CivilizationdormitoryService;
import com.accp.spring.nana.vo.CivilizationdormitoryVo;

@CrossOrigin
@RestController
@RequestMapping("/civ")
public class CivilizationdormitoryController {
	@Autowired
	CivilizationdormitoryService civilizationdormitoryService;
	
	//
	@GetMapping("/selectAll/{dormMangeId}/{startTime}")
	public Object selectAll(@PathVariable int dormMangeId,@PathVariable String startTime){
		return this.civilizationdormitoryService.selectAll(dormMangeId,startTime);
	}
}
