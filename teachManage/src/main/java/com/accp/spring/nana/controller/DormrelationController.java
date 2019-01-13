package com.accp.spring.nana.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.nana.pojo.ChangeSleep;
import com.accp.spring.nana.pojo.Dormrelation;
import com.accp.spring.nana.service.DormrelationService;
import com.accp.spring.nana.vo.DormrelationVo;

@CrossOrigin
@RestController
@RequestMapping("/dor")
public class DormrelationController {
	@Autowired
	DormrelationService dormrelationService;
	
	@PostMapping("/move/{bedId}")
	public void move(@RequestBody Dormrelation dormrelation,@PathVariable int bedId) {
		this.dormrelationService.move(dormrelation,bedId);
	}
	@GetMapping("/selectDormrelations")
	public Object selectDormrelations(int dormMangeId,String startTime) throws ParseException{
		return this.dormrelationService.selectDormrelations(dormMangeId, startTime);
	}
	@GetMapping("/selectChangeSleep")
	public Object selectChangeSleep(String stuName,String startTime){
		return this.dormrelationService.selectChangeSleep(stuName, startTime);
	}
	@GetMapping("/selectChangeSleepAll")
	public Object selectChangeSleepAll() {
		return this.dormrelationService.selectChangeSleepAll();
	}
	//删除换寝记录
	@DeleteMapping("/deleteChangeSleep/{id}")
	public int deleteChangeSleep(@PathVariable int id) {
		return this.dormrelationService.deleteChangeSleep(id);
	}
}
