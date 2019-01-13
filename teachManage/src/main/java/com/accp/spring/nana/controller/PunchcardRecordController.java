package com.accp.spring.nana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.nana.pojo.PunchCardRecord;
import com.accp.spring.nana.service.PunchcardRecordService;
import com.accp.spring.nana.vo.StudentPunchcardrecordVo;

@CrossOrigin
@RestController
@RequestMapping("/pun")
public class PunchcardRecordController {
	
	@Autowired
	private PunchcardRecordService punchcardRecordService;
	
	//考勤人数
	@GetMapping("/selectSum/{punchTime}")
	public PunchCardRecord selectSum(@PathVariable String punchTime) {
		return this.punchcardRecordService.selectSum(punchTime);
	}
	//住寝总人数
	@GetMapping("/selectSums")
	public int selectSums() {
		return this.punchcardRecordService.selectSums();
	}
	//男女生总人数
	@GetMapping("/selectNanSum")
	public PunchCardRecord selectNanSum() {
		int i=this.punchcardRecordService.selectNanSum(1);
		int v=this.punchcardRecordService.selectNanSum(2);
		PunchCardRecord pun=new PunchCardRecord();
		pun.setNanSum(i);
		pun.setNvSum(v);
		return pun;
	}
	
	//考勤记录
	@GetMapping("/selectPun")
	public List<StudentPunchcardrecordVo> selectPun(String time,int States,int dormMangeId){
		return this.punchcardRecordService.selectPun(time,States,dormMangeId);
	}
	
}
