package com.accp.spring.nana.controller;

import javax.websocket.server.PathParam;
import javax.xml.ws.ResponseWrapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.nana.pojo.Bed;
import com.accp.spring.nana.pojo.Dormitory;
import com.accp.spring.nana.service.DormitoryService;
@CrossOrigin
@RestController
@RequestMapping("/dor")
public class DormitoryController {
	
	@Autowired
	private DormitoryService dormitoryService;
	
	//根据寝室类别查询所有寝室
	@GetMapping("/selectDormitory")
	public Object selectDormitory() {
		return this.dormitoryService.selectDormitory(1);
	}
	
	//根据寝室id查询所有寝室床位相关的信息
	@GetMapping("/selectBed/{dormId}")
	public Object selectBed(@PathVariable int dormId) {
		return this.dormitoryService.selectBed(dormId);
	}
	
	//根据寝室id查询所有床位状态
	@GetMapping("/selectStates/{dormId}")
	public Object selectStates(@PathVariable int dormId) {
		return this.dormitoryService.selectStates(dormId);
	}
	
	//查询寝室容纳总床数
	@GetMapping("/selectBedCount/{dormId}")
	public int selectBedCount(@PathVariable int dormId) {
		return this.dormitoryService.selectBedCount(dormId);
	}
	//查询寝室情况
	@GetMapping("/selectOne/{dormId}")
	public Dormitory selectOne(@PathVariable int dormId){
		return this.dormitoryService.selectOne(dormId);
	}
	//设置寝室长
	@PutMapping("/updateAdmin/{adminId}/{dormId}")
	public int updateAdmin(@PathVariable int adminId,@PathVariable int dormId) {
		return this.dormitoryService.updateAdmin(adminId,dormId);
	}
	
	
	
	
	//根据床位id修改床位状态
	@PutMapping("/updateBed/{bedStates}/{bedId}")
	public int updateBed(@PathVariable int bedStates,@PathVariable int bedId) {
		return this.dormitoryService.updateBed(bedStates,bedId);
	}
	//根据床位id删除床位
	@DeleteMapping("/deleteBed/{bedId}")
	public int deleteBed(@PathVariable int bedId) {
		return this.dormitoryService.deleteBed(bedId);
	}
	//新增床位
	@PostMapping("/insertBed")
	public int insertBed(@RequestBody Bed bed) {
		return this.dormitoryService.insertBed(bed);
	}
	//根据寝室id查询所有空白床位
	@GetMapping("/selectEmptyBed/{dormId}")
	public Object selectEmptyBed(@PathVariable int dormId) {
		return this.dormitoryService.selectEmptyBed(dormId);
	}
	
}
