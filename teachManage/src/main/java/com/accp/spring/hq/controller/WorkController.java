package com.accp.spring.hq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.hq.pojo.Homework;
import com.accp.spring.hq.pojo.Workfinish;
import com.accp.spring.hq.service.WorkService;

@RestController
@RequestMapping("/work")
public class WorkController {
	@Autowired
	private WorkService workService;
	
	//查询教员所教的班以及所布置的作业
	@GetMapping("/selectWork/{teaId}")
	public Object selectWork(@PathVariable int teaId){
		return this.workService.selectWork(teaId);
	}
	
	//登记作业情况
	@PostMapping("/dengji/{workId}/{stuId}/{score}")
	public int dengji(@PathVariable int workId,@PathVariable int stuId,@PathVariable String score) {
		System.err.println(workId+"/"+stuId+"/"+score);
		return this.workService.dengji(workId, stuId, score);
	}
	
	
	//布置作业
	@PostMapping("/sendWork")
	public Object sendWork(@RequestBody Homework hw) {
		System.err.println(hw);
		return this.workService.buzhi(hw);
	}
	
	
	
	
	
	
}
