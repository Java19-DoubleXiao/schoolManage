package com.accp.spring.nana.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.nana.mapper.PunchcardRecordMapper;
import com.accp.spring.nana.pojo.PunchCardRecord;
import com.accp.spring.nana.pojo.PunchCardSetting;
import com.accp.spring.nana.pojo.Registerleave;
import com.accp.spring.nana.vo.StudentPunchcardrecordVo;

@Service
public class PunchcardRecordService {
	
	@Autowired
	PunchcardRecordMapper punchcardRecordMapper;
	
	public PunchCardRecord selectSum(String punchTime) {
		return this.punchcardRecordMapper.selectSum(punchTime);
	}
	public int selectSums() {
		return this.punchcardRecordMapper.selectSums();
	}
	public int selectNanSum(int stuSex) {
		return this.punchcardRecordMapper.selectNanSum(stuSex);
	}
	public List<StudentPunchcardrecordVo> selectPun(String time,int States,int dormMangeId){
		PunchCardSetting pc = this.punchcardRecordMapper.selectSetting(3);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		//System.out.println();// new Date()为获取当前系统时间
		String beginTime = "";
		String endTime = "";
		String lateTime = "";
		System.out.println("time:"+time);
		if(time != null) {
			beginTime = time +" "+ pc.getStartTime();
			endTime = time +" "+ pc.getEndTime();
			lateTime = time+" "+ pc.getLateTime();
		}else {
			beginTime = df.format(new Date()) +" "+ pc.getStartTime();
			endTime = df.format(new Date()) +" "+ pc.getEndTime();
			lateTime = df.format(new Date())+" "+ pc.getLateTime();
		}
		System.out.println(beginTime+""+endTime+""+lateTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<StudentPunchcardrecordVo> punInfo=this.punchcardRecordMapper.selectPun(beginTime, endTime,dormMangeId);
		List<StudentPunchcardrecordVo> pun=new ArrayList<StudentPunchcardrecordVo>();
		
		for (StudentPunchcardrecordVo stu : punInfo) {
			System.out.println( stu.getPunchTime()+"  "+lateTime);
			try {
				if(stu.getPunchTime()==null) {
					//判断缺卡是请假还是未到
					List<Registerleave> reg=this.punchcardRecordMapper.selectRegisterleave(beginTime);
					if(reg!=null) {
						int isLeave = 0;
						for (Registerleave registerleave : reg) {
							if(registerleave.getStuId()==stu.getStuId()) {
								//如果请假数据对的上
								isLeave = 1;
							}
							
						}
						//请假数据有
						if(isLeave == 1) {
							//请假
							stu.setStates(3);
						}else {
							//缺卡
							stu.setStates(4);
						}
					}
					
					
				}else if(sdf.parse(stu.getPunchTime()).after(sdf.parse(lateTime))) {
					//迟到:  true：打卡时间在结束时间之后
					stu.setStates(2);
				}else if(sdf.parse(stu.getPunchTime()).before(sdf.parse(lateTime))) {
					//已到:  true：打卡时间在结束时间之前
					stu.setStates(1);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			if(stu.getStates()==States) {
				pun.add(stu);
			}
			
			
		}
		return pun;		
		
	}
}
