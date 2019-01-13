package com.accp.spring.nana.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.nana.pojo.Healthrecord;
import com.accp.spring.nana.pojo.Healthrecordimg;
import com.accp.spring.nana.pojo.ScoreSetting;
import com.accp.spring.nana.service.HealthrecordService;
import com.accp.spring.nana.service.ScoresettingService;
import com.accp.spring.nana.vo.HealthrecordVo;
@CrossOrigin
@RestController
@RequestMapping("/sco")
public class HealthrecordController {
	@Autowired
	ScoresettingService scoresettingService;
	
	@Autowired
	HealthrecordService healthrecordService;
	
	//查询所有寝室扣分制度
	@GetMapping("/selectAll")
	public List<ScoreSetting> selectAll(){
		return this.scoresettingService.selectAll();
		
	}
	//根据宿管id查询被管辖的所有宿舍的卫生扣分情况
	@GetMapping("/selectHealthrecord")
	public List<HealthrecordVo> selectHealthrecord(int dormMangeId, String checkTime){
		return this.healthrecordService.selectHealthrecord(dormMangeId, checkTime);
	}
	//根据寝室id和日期查询寝室卫生详细情况
	@GetMapping("/selectHealthrecordDetail")
	public Object selectHealthrecordDetail(int dormId ,String checkTime) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String begin=sdf.format(DateFormat.getDateInstance().parse(checkTime));
		System.out.println(begin);
		return this.healthrecordService.selectHealthrecordDetail(dormId, begin);
		
	}
	//新增寝室卫生
	@PostMapping("/insert/{setId}/{dormId}/{checkPerson}")
	public int insertHealthrecord(@RequestBody String [] imgPath,@PathVariable String setId,@PathVariable Integer dormId,@PathVariable Integer checkPerson){
		
		return this.healthrecordService.insertHealthrecord(imgPath,setId,dormId,checkPerson);
		 
	}
	
}
