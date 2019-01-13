package com.accp.spring.xjq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.ScoreSetting;
import com.accp.spring.pojo.StuAttendance;
import com.accp.spring.xjq.service.ScoreSetService;

@RestController
@RequestMapping("/score")
public class ScoreSetController {
	
	@Autowired
	private ScoreSetService scoreSetService;
	
	
	@GetMapping("/getSetting")
	public List<ScoreSetting> selectSettingByType(int setSort){
		return this.scoreSetService.selectSettingByType(setSort);
	}
	
	@PostMapping("/insertAttence/{stuId}/{setId}/{remark}")
	public int insertStuAttence(@RequestBody String [] imgPath,@PathVariable int stuId,@PathVariable int [] setId,@PathVariable String remark) {
		return this.scoreSetService.insertStuAttence(imgPath,stuId,setId,remark);
	}
	
	

}
