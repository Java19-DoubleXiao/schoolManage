package com.accp.spring.nana.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.nana.service.RepairsService;
import com.accp.spring.nana.service.ScoresettingSService;

import lombok.experimental.PackagePrivate;

@CrossOrigin
@RestController
@RequestMapping("/Repair")
public class RepairsController {
	
	@Autowired
	RepairsService repairsService;
	@Autowired
	ScoresettingSService scoresettingSService;
	
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
	
	
	
	//通知
	//发通知
	@PostMapping("/sendInfomation")
	public int sendInfomation(@RequestBody Inform inform) {
		System.err.println(inform);
		return this.scoresettingSService.sendInfomation(inform);
	}
	//显示收通知
		@GetMapping("/selectAccInform/{teaId}")
		public List<Inform> selectAccInform(@PathVariable int teaId){
			return this.scoresettingSService.selectAccInform(teaId);
		}
		
		
		//显示发通知
		@GetMapping("/selectSendInform/{teaId}")
		public List<Inform> selectSendInform(@PathVariable int teaId){
			return this.scoresettingSService.selectSendInform(teaId);
		}
		
		
		//查看通知详情
		@GetMapping("/selectInfoById/{informId}/{teaId}")
		public Inform selectInfoById(@PathVariable int informId,@PathVariable int teaId){
			return this.scoresettingSService.selectInfoById(informId, teaId);
		}
		
		
		//查看通知详情   发
		@GetMapping("/selectSendInfoById/{informId}/{teaId}")
		public Inform selectSendInfoById(@PathVariable int informId,@PathVariable int teaId){
			return this.scoresettingSService.selectSendInfoById(informId, teaId);
		}
		
		
		//已看通知的人  姓名  头像
		@GetMapping("/selectLookPeople/{informId}/{teaId}")
		public List<StudentOne> selectLookPeople(@PathVariable int informId,@PathVariable int teaId){
			return this.scoresettingSService.selectLookPeople(teaId,informId);
		}


		//删除通知   收
		@PostMapping("/updateAcc/{informId}/{teaId}")
		public int updateAcc(@PathVariable int informId,@PathVariable int teaId) {
			return this.scoresettingSService.updateAcc(informId, teaId);
		}

		//删除通知   发
		@PostMapping("/updateInfo/{informId}/{teaId}")
		public int updateInfo(@PathVariable int informId,@PathVariable int teaId){
			return this.scoresettingSService.updateInfo(informId, teaId);
		}

}
