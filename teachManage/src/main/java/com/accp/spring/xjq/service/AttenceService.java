package com.accp.spring.xjq.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.LeaveProcess;
import com.accp.spring.pojo.PunchCardSetting;
import com.accp.spring.pojo.ScoreSetting;
import com.accp.spring.pojo.StuAttendance;
import com.accp.spring.xjq.mapper.AttenceMapper;
import com.accp.spring.xjq.mapper.ClassesMapper;
import com.accp.spring.xjq.pojo.ClassStudent;
import com.accp.spring.xjq.pojo.KaoqinInfo;
import com.accp.spring.xjq.pojo.SetItemVo;
import com.accp.spring.xjq.pojo.StuAttenceVo;

@Service
public class AttenceService {
	
	@Autowired
	private AttenceMapper attenceMapper;
	
	@Autowired
	private ClassesMapper classesMapper;
	
	/**
	 * 根据日期查询考勤情况
	 * @param punchId
	 * @param classId
	 * @param time
	 * @return
	 * @throws ParseException 
	 */
	@Transactional
	public List<KaoqinInfo> getAttenceTypeDetail(int punchId,int classId,String time) throws ParseException{
		PunchCardSetting pc = this.attenceMapper.selectSetting(punchId);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		
		Calendar c = Calendar.getInstance();
        c.setTime(df.parse(time));
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天

		String beginTime = time +" "+ pc.getStartTime();
		String endTime = "";
		String zaotuiTime = "";
		String lateTime = time+" "+ pc.getLateTime();
		if(punchId==2) {
			endTime = df.format(c.getTime())+" "+ pc.getEndTime();
			zaotuiTime =  time+" "+"13:00:00";//早退开始查询时间
		}else {
			endTime = time +" "+ pc.getEndTime();
		}
		
		System.out.println("beginTime:"+beginTime+"  endTime:"+endTime+"  lateTime:"+lateTime+"zaotuiTime:"+zaotuiTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//查询班级的学生的打卡信息
		List<ClassStudent> classInfo = this.attenceMapper.selectStuAttenceByclassId(beginTime, endTime, classId);
		
		//查出考勤四种状态（迟到，未到，早退，请假）
		List<KaoqinInfo> settings = this.attenceMapper.selectSetByType(1, 1);
		if(punchId == 1) {
			//上午
			for (KaoqinInfo kq : settings) {
				List<ClassStudent> stuList = new ArrayList<ClassStudent>();
				int count = 0;
				System.out.println(kq.getSetItem());
				if(kq.getSetItem().equals("迟到")) {
					for (ClassStudent stu : classInfo) {
						try {
							if(stu.getPunchTime()!=null) {
								if(sdf.parse(stu.getPunchTime()).after(sdf.parse(lateTime))) {
									//迟到:  true：打卡时间在结束时间之后
									stuList.add(stu);
									count++;
								}
							}
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				}else if(kq.getSetItem().equals("未到")) {
					//缺卡
					String times = "";
					if(punchId==1) {
						times = beginTime;
					}else {
						times = time+" 13:00:00";
					}
					
					for (ClassStudent stu : classInfo) {
						if(stu.getPunchTime()==null) {
							LeaveProcess isLeave = this.attenceMapper.selectIsLeaveByTime(stu.getStuId(), times);
							if(isLeave == null) {
								stuList.add(stu);
								count++;	
							}
						}
			 		}
				}else if(kq.getSetItem().equals("请假")) {
					String times = beginTime;
					for (ClassStudent stu : classInfo) {
						if(stu.getPunchTime()==null) {
							LeaveProcess isLeave = this.attenceMapper.selectIsLeaveByTime(stu.getStuId(), times);
							if(isLeave != null) {
								stuList.add(stu);
								count++;	
							}
						}
			 		}
				}
				kq.setCount(count);
				kq.setStudents(stuList);
			}

		}else {
			//下午
			for (KaoqinInfo kq : settings) {
				List<ClassStudent> stuList = new ArrayList<ClassStudent>();
				int count = 0;
				System.out.println(kq.getSetItem());
				if(kq.getSetItem().equals("早退")) {
					for (ClassStudent stu : classInfo) {
						//是否早退
						if(stu.getPunchTime()==null) {
							StuAttenceVo stuAttence = this.attenceMapper.selectZaoTuiByStuIdAndTime(stu.getStuId(), zaotuiTime, endTime);
							if(stuAttence != null) {
								stuList.add(stu);
								count++;
							}
						}
					}
				}else if(kq.getSetItem().equals("未到")) {
					//缺卡
					for (ClassStudent stu : classInfo) {
						if(stu.getPunchTime()==null) {
							StuAttenceVo stuAttence = this.attenceMapper.selectZaoTuiByStuIdAndTime(stu.getStuId(), zaotuiTime, endTime);
							String times = time+" 13:00:00";
							LeaveProcess isLeave = this.attenceMapper.selectIsLeaveByTime(stu.getStuId(), times);
							if(stuAttence == null && isLeave == null) {
								//说明没有早退记录也没有请假记录
								stuList.add(stu);
								count++;
							}
						}
			 		}
				}else if(kq.getSetItem().equals("请假")) {
					String times = time+" 13:00:00";
					for (ClassStudent stu : classInfo) {
						if(stu.getPunchTime()==null) {
							LeaveProcess isLeave = this.attenceMapper.selectIsLeaveByTime(stu.getStuId(), times);
							if(isLeave != null) {
								stuList.add(stu);
								count++;	
							}
						}
			 		}
				}
				kq.setCount(count);
				kq.setStudents(stuList);
			}
			
		}	
			
		return settings;
	}
	
	
	
	/**
	 * 查当天的考勤情况
	 * @param punchId
	 * @param classId
	 * @param time
	 * @return
	 */
	@Transactional
	public List<ClassStudent> selectStuAttenceByclassId(int punchId,int classId,String time){
		PunchCardSetting pc = this.attenceMapper.selectSetting(punchId);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		
		//System.out.println();// new Date()为获取当前系统时间
		String beginTime 	= "";
		String endTime = "";
		String lateTime = "";
		String zaotuiTime = "";
		System.out.println("time:"+time);
		if(time != null) {
			beginTime = time +" "+ pc.getStartTime();
			Calendar c = Calendar.getInstance();
	        try {
				c.setTime(df.parse(time));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
			if(punchId==2) {
				zaotuiTime = time +" "+"13:00:00";
				endTime = df.format(c.getTime()) +" "+ pc.getEndTime();
			}else {
				endTime = time +" "+ pc.getEndTime();
			}
			lateTime = time+" "+ pc.getLateTime();
		}else {
			beginTime = df.format(new Date()) +" "+ pc.getStartTime();
			endTime = df.format(new Date()) +" "+ pc.getEndTime();
			if(punchId == 2) {
				zaotuiTime = df.format(new Date()) +" "+"13:00:00";
			}else {
				zaotuiTime = endTime;
			}
			lateTime = df.format(new Date())+" "+ pc.getLateTime();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		List<ClassStudent> classInfo = this.attenceMapper.selectStuAttenceByclassId(beginTime, endTime, classId);
		
		if(punchId == 1) {
			//上午
			for (ClassStudent stu : classInfo) {
				System.out.println( stu.getPunchTime()+"  "+lateTime);
				try {
					if(stu.getPunchTime()==null) {
						//缺卡或者是请假了
						String times = beginTime;
						LeaveProcess isLeave = this.attenceMapper.selectIsLeaveByTime(stu.getStuId(), times);
						if(isLeave != null) {
							stu.setStates(3);//请假
						}else {
							stu.setStates(4);//未到
						}
					}else if(sdf.parse(stu.getPunchTime()).after(sdf.parse(lateTime))) {
						//迟到:  true：打卡时间在最迟时间之后
						stu.setStates(2);
					} else if(sdf.parse(stu.getPunchTime()).before(sdf.parse(lateTime))) {
						//已到:  true：打卡时间在最迟时间之前
						stu.setStates(1);
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}else {
			//下午
			for (ClassStudent stu : classInfo) {
				System.out.println( stu.getPunchTime()+"  "+lateTime);
				try {
					if(stu.getPunchTime()==null) {
						//缺卡或者是请假了（需要判断）
						String times = time+" 13:00:00";
						//是否请假
						LeaveProcess isLeave = this.attenceMapper.selectIsLeaveByTime(stu.getStuId(), times);
						//是否早退
						StuAttenceVo stuAttence = this.attenceMapper.selectZaoTuiByStuIdAndTime(stu.getStuId(), zaotuiTime, endTime);
						if(isLeave == null && stuAttence == null) {
							stu.setStates(4);//未到
						}
						if(isLeave != null) {
							stu.setStates(3);//请假
						}
						if(stuAttence != null) {
							stu.setStates(5);//早退
						}
					}else if(sdf.parse(stu.getPunchTime()).after(sdf.parse(beginTime)) && sdf.parse(stu.getPunchTime()).before(sdf.parse(endTime))) {
						//已到:  true：打卡时间在最迟时间之前
						stu.setStates(1);
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return classInfo;
	}
	
	
	/**
	 * 查当天的打卡人数及详细
	 * @param punchId
	 * @param classId
	 * @param time
	 * @return
	 */
	@Transactional
	public List<ClassStudent> selectStuPunchCardRecordByTime(int punchId,int classId,String time){
		PunchCardSetting pc = this.attenceMapper.selectSetting(punchId);
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		List<ClassStudent> classInfo = this.attenceMapper.selectStuAttenceByclassId(beginTime, endTime, classId);
	
		return classInfo;
	}
	
	

	/**
	 * 查看每月的考勤情况
	 * @param classId
	 * @param time
	 * @return
	 */
	@Transactional
	public List<KaoqinInfo> selectAttenceByTimeAndClass(String time,int classId){
		int year = 0;
		int mouth = 0;
		System.out.println("time="+time);
        String [] str=time.split("-");  
        
        for (int i = 0; i < str.length; i++) {
        	year = Integer.parseInt(str[0]);
   	 	  	mouth = Integer.parseInt(str[1]);
		}
	 	 System.out.println(time+"分解后的单词个数为："+str.length+" nian:"+year+" yue:"+mouth);
	 	 
	 	 String beginTime = year+"-"+mouth+"-01";
	 	 String endTime = "";
		if(mouth==1 || mouth==3 || mouth==5 || mouth==7 || mouth==8 || mouth==10 || mouth==12) {
			// 31
			endTime = year+"-"+mouth+"-31 23:59:59";
		}else if(mouth==4 || mouth==6 || mouth==9 || mouth==11) {
			//30
			endTime = year+"-"+mouth+"-30 23:59:59";
		}else {
			//29
			endTime = year+"-"+mouth+"-29 23:59:59";
		}
		return this.attenceMapper.selectKaoqinByMouth(beginTime, endTime,classId);
	}
	

	
	public List<KaoqinInfo> selectAttenceStuDetailBysetId(String time, int setId, int classId){
		int year = 0;
		int mouth = 0;
        String [] str=time.split("-");  
        for (int i = 0; i < str.length; i++) {
        	year = Integer.parseInt(str[0]);
   	 	  	mouth = Integer.parseInt(str[1]);
   	 	  	//System.out.println("dsf"+str.length+" nian:"+str[0]+" yue:"+str[1]);
		}
	 	 System.out.println(time+"分解后的单词个数为："+str.length+" nian:"+year+" yue:"+mouth);
	 	 
	 	 String beginTime = year+"-"+mouth+"-01";
	 	 String endTime = "";
		if(mouth==1 || mouth==3 || mouth==5 || mouth==7 || mouth==8 || mouth==10 || mouth==12) {
			// 31
			endTime = year+"-"+mouth+"-31 23:59:59";
		}else if(mouth==4 || mouth==6 || mouth==9 || mouth==11) {
			//30
			endTime = year+"-"+mouth+"-30 23:59:59";
		}else {
			//29
			endTime = year+"-"+mouth+"-29 23:59:59";
		}
		List<KaoqinInfo> kqList = this.attenceMapper.selectMouthKaoqinDetail(beginTime, endTime, setId, classId);
		
		return kqList;
	}
	
	
	
	@Transactional
	public List<SetItemVo> selectSetItemPersonalAndCount(int stuId,String time){
		int year = 0;
		int mouth = 0;
        String [] str=time.split("-");  
        for (int i = 0; i < str.length; i++) {
        	year = Integer.parseInt(str[0]);
   	 	  	mouth = Integer.parseInt(str[1]);
		}
	 	 System.out.println(time+"分解后的单词个数为："+str.length+" nian:"+year+" yue:"+mouth);
	 	 
	 	 String beginTime = year+"-"+mouth+"-01";
	 	 String endTime = "";
		if(mouth==1 || mouth==3 || mouth==5 || mouth==7 || mouth==8 || mouth==10 || mouth==12) {
			// 31
			endTime = year+"-"+mouth+"-31 23:59:59";
		}else if(mouth==4 || mouth==6 || mouth==9 || mouth==11) {
			//30
			endTime = year+"-"+mouth+"-30 23:59:59";
		}else {
			//29
			endTime = year+"-"+mouth+"-29 23:59:59";
		}
		
		List<SetItemVo> items = this.attenceMapper.selectSetItemPersonal(beginTime, endTime, stuId);
		for (SetItemVo item : items) {
			item.setStuAttences(this.attenceMapper.selectStuAttenceByStuIdM(beginTime, endTime, item.getSetId(), stuId));
		}
		
		return items;
	}


	/**
	 * 按月查询纪律卫生
	 * @param time
	 * @return
	 */
	@Transactional
	public List<SetItemVo> getMouthHealth(String time) {
		int year = 0;
		int mouth = 0;
        String [] str=time.split("-");  
        for (int i = 0; i < str.length; i++) {
        	year = Integer.parseInt(str[0]);
   	 	  	mouth = Integer.parseInt(str[1]);
		}
	 	 System.out.println(time+"分解后的单词个数为："+str.length+" nian:"+year+" yue:"+mouth);
	 	 
	 	 String beginTime = year+"-"+mouth+"-01";
	 	 String endTime = "";
		if(mouth==1 || mouth==3 || mouth==5 || mouth==7 || mouth==8 || mouth==10 || mouth==12) {
			// 31
			endTime = year+"-"+mouth+"-31 23:59:59";
		}else if(mouth==4 || mouth==6 || mouth==9 || mouth==11) {
			//30
			endTime = year+"-"+mouth+"-30 23:59:59";
		}else {
			//29
			endTime = year+"-"+mouth+"-29 23:59:59";
		}
		System.out.println("1 beginTime:"+beginTime+"    endTIme:"+endTime);
		List<SetItemVo> items = this.attenceMapper.selectSetItemPersonalHealth(beginTime, endTime);
		for (SetItemVo item : items) {
			item.setStuAttences(this.attenceMapper.selectJilvAndHealth(beginTime, endTime, item.getSetId()));
		}
		
		return items;
	}
	
	/**
	 * 按日查询纪律卫生
	 * @param time
	 * @return
	 */
	@Transactional
	public List<SetItemVo> getDateHealth(String time) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		
		//System.out.println();// new Date()为获取当前系统时间
		String beginTime 	= "";
		String endTime = "";
		Calendar c = Calendar.getInstance();
        try {
			c.setTime(df.parse(time));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天
		
		System.out.println("time:"+time);
		if(time != null) {
			beginTime = time +" 00:00:00";
			endTime = df.format(c.getTime()) +" 00:00:00";
		}else {
			beginTime =  df.format(new Date()) +" 00:00:00";
			endTime = df.format(new Date()) +" 00:00:00";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("ri beginTime:"+beginTime+"    endTIme:"+endTime);
		List<SetItemVo> items = this.attenceMapper.selectSetItemPersonalHealth(beginTime, endTime);
		for (SetItemVo item : items) {
			item.setStuAttences(this.attenceMapper.selectJilvAndHealth(beginTime, endTime, item.getSetId()));
		}
		return items;
	}
	
	
	
	
	
	
	
	

}
