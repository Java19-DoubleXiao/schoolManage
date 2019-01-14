package com.accp.spring.xjq.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.PunchCardSetting;
import com.accp.spring.pojo.ScoreSetting;
import com.accp.spring.pojo.StuAttendance;
import com.accp.spring.xjq.pojo.ClassStudent;
import com.accp.spring.xjq.pojo.KaoqinInfo;
import com.accp.spring.xjq.pojo.SetItemVo;
import com.accp.spring.xjq.service.AttenceService;

@RestController
@RequestMapping("/kaoqin")
public class AttenceController {

	@Autowired
	private AttenceService attenceService;
	
	@GetMapping("/getAttence")
	public List<ClassStudent> selectStuAttenceByclassId(int punchId,int classId,String time){
		return this.attenceService.selectStuAttenceByclassId(punchId, classId, time);
	}
	
	/**
	 * 按月查询班级考勤情况
	 * @param classId
	 * @param time
	 * @return
	 */
	@GetMapping("/getAttenceCountByMouth")
	public List<KaoqinInfo> selectAttenceByTimeAndClass(String time,int classId){
		return this.attenceService.selectAttenceByTimeAndClass(time, classId);
	}
	
	/**
	 * 获取扣分项目（根据分类）以及根据时间和班级查询的考勤情况
	 * @param setType 班级 | 宿舍
	 * @param setSort 考勤 | 纪律 | 卫生
	 * @return
	 */
	@GetMapping("/getAttenceTypeDetail")
	public List<KaoqinInfo> getAttenceTypeDetail(int punchId,int classId,String time)throws ParseException{
		return this.attenceService.getAttenceTypeDetail(punchId, classId, time);
	}
	
	/**
	 * 查询班级和考勤详情的学生
	 * @param time
	 * @param setId
	 * @param classId
	 * @return
	 */
	@GetMapping("/getAttenceStuDetail")
	public List<KaoqinInfo> selectAttenceStuDetailBysetId(String time, int setId, int classId){
		return this.attenceService.selectAttenceStuDetailBysetId(time, setId, classId);
	}
	
	//查当天的打卡人数及详细
	@GetMapping("/getStuPunchRecord")
	public List<ClassStudent> selectStuPunchCardRecordByTime(int punchId,int classId,String time){
		return this.attenceService.selectStuPunchCardRecordByTime(punchId, classId, time);
	}
	
	
	
	@GetMapping("/getMouthPersonAttence")
	public List<SetItemVo> getMouthPersonAttence(int stuId,String time){
		return this.attenceService.selectSetItemPersonalAndCount(stuId, time);
	}
	
	
	@GetMapping("/getMouthHealth")
	public List<SetItemVo> getMouthHealth(String time){
		return this.attenceService.getMouthHealth( time);
	}
	
	@GetMapping("/getDateHealth")
	public List<SetItemVo> getDateHealth(String time){
		return this.attenceService.getDateHealth(time);
	}
	
	
	
	
	
}
