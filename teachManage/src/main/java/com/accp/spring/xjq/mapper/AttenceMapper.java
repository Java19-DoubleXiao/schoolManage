package com.accp.spring.xjq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.LeaveProcess;
import com.accp.spring.pojo.PunchCardSetting;
import com.accp.spring.pojo.ScoreSetting;
import com.accp.spring.pojo.StuAttendance;
import com.accp.spring.xjq.pojo.ClassStudent;
import com.accp.spring.xjq.pojo.KaoqinInfo;
import com.accp.spring.xjq.pojo.SetItemVo;
import com.accp.spring.xjq.pojo.StuAttenceVo;

public interface AttenceMapper {
	

	//查询班级所有学生考勤情况
	@Select("SELECT a.`id`,a.`stuId`,b.`stuName`,a.`classId`,c.`cName`,a.`isChange`,b.`stuImage`,b.`stuType`,\r\n" + 
			"(SELECT punchTime FROM punchcardrecord d WHERE `stuId`=a.`stuId` AND `punchTime` BETWEEN #{beginTime} AND #{endTime} ORDER BY punchTime DESC LIMIT 0,1) punchTime FROM csrelation a\r\n" + 
			"INNER JOIN classes c ON a.`classId`=c.`classId` \r\n" + 
			"INNER JOIN student b ON a.`stuId`=b.`stuId`\r\n" + 
			"AND a.`classId`= #{classId}")
	List<ClassStudent> selectStuAttenceByclassId(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("classId")int classId);
	
	@Select("SELECT * FROM punchcardsetting WHERE punchId = #{punchId}")
	PunchCardSetting selectSetting(@Param("punchId")int punchId);
	
	
	@Select("SELECT  * FROM stuattendance \r\n" + 
			"WHERE `time` BETWEEN #{beginTime} AND #{endTime} ")
	List<StuAttendance> selectAttenceByTimeAndClass(@Param("beginTime")String beginTime,@Param("endTime")String endTime);
	
	
	@Select("SELECT * FROM scoresetting WHERE setType = #{setType} AND setSort = #{setSort}")
	List<KaoqinInfo> selectSetByType(@Param("setType")int setType,@Param("setSort")int setSort);
	
	
	/*查询每月班级考勤情况*/
	@Select("SELECT ss.`setId`,setItem,(SELECT COUNT(*) FROM stuattendance a\r\n" + 
			"INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			"INNER JOIN csrelation c ON a.stuId = c.stuId \r\n" + 
			"WHERE a.`time` BETWEEN #{beginTime} AND #{endTime} AND a.`setId`= ss.`setId` AND c.classId = #{classId}) `count`\r\n" + 
			"FROM scoresetting ss \r\n" + 
			"WHERE setType = 1 AND setSort = 1")
	List<KaoqinInfo> selectKaoqinByMouth(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("classId")int classId);

	/*查询每月具体有哪些人考勤违规*/
	@Select("SELECT saId,a.stuId,cla.`cName`,a.setId,setItem,a.`time`,s.`stuName`,s.`stuImage` FROM stuattendance a \r\n" + 
			" INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			" INNER JOIN student s ON s.`stuId` = a.`stuId`\r\n" + 
			" INNER JOIN csrelation c ON  c.`stuId` = a.`stuId`\r\n" + 
			" INNER JOIN classes cla ON cla.`classId` = c.`classId`\r\n" + 
			" WHERE a.`time` BETWEEN #{beginTime} AND #{endTime}\r\n" + 
			" AND a.`setId` = #{setId} AND c.`classId` = #{classId}\r\n" + 
			" GROUP BY stuId")
	List<KaoqinInfo> selectMouthKaoqinDetail(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("setId")int setId,@Param("classId")int classId);
	
	
	/*查询班级和考勤详情的学生 */
	@Select("SELECT saId,a.stuId,a.setId,setItem,a.`time`,s.`stuName`,s.`stuImage` FROM stuattendance a\r\n" + 
			" INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			" INNER JOIN student s ON s.`stuId` = a.`stuId`\r\n" + 
			" INNER JOIN csrelation c ON  c.`stuId` = a.`stuId`\r\n" + 
			" WHERE a.`time` BETWEEN #{beginTime} AND #{endTime}\r\n" + 
			" AND a.`setId` = #{setId} AND c.`classId` = #{classId} ")
	List<KaoqinInfo> selectAttenceStuDetailBysetId(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("setId")int setId,@Param("classId")int classId);
	
	
	/**
	 * 查询这个事件请假且通过了的人
	 * @param time
	 * @return
	 */
	@Select("SELECT * FROM leaveprocess WHERE leaStates = 3 and \r\n" + 
			"#{time} BETWEEN leaStartTime AND leaEndTime")
	List<LeaveProcess> selectLeaveByTime(@Param("time")String time);
	
	/**
	 * 判断某一学生是否在某段时间内请假并通过了的
	 * @param stuId
	 * @param time
	 * @return
	 */
	@Select("SELECT * FROM leaveprocess WHERE leaStates = 3 AND stuId = #{stuId} and #{time} BETWEEN leaStartTime AND leaEndTime")
	LeaveProcess selectIsLeaveByTime(@Param("stuId")int stuId,@Param("time")String time);
	
	
	@Select("SELECT ss.`setId`,setItem,setSort,(SELECT COUNT(*) FROM stuattendance a\r\n" + 
			"INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			"WHERE a.`time` BETWEEN #{beginTime} AND #{endTime}\r\n" + 
			"AND stuId = #{stuId} AND a.`setId`= ss.`setId`) `count` FROM scoresetting ss WHERE setType = 1")
	List<SetItemVo> selectSetItemPersonal(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("stuId")int stuId);
	
	@Select("SELECT saId,a.stuId,a.setId,setItem,score,remark,a.`time`,s.`stuName`,s.`stuImage` FROM stuattendance a\r\n" + 
			"INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			"INNER JOIN student s ON s.`stuId` = a.`stuId`\r\n" + 
			"WHERE a.`time`  BETWEEN #{beginTime} AND #{endTime}\r\n" + 
			"AND a.`setId` = #{setId} AND a.`stuId` = #{stuId}")
	List<StuAttenceVo> selectStuAttenceByStuIdM(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("setId")int setId,@Param("stuId")int stuId);
	
	
	
	@Select("SELECT * FROM stuattendance WHERE setId = (SELECT setId FROM `scoresetting` WHERE setType = 1 AND isUse = 1 AND setItem = '早退')   AND `time` BETWEEN #{beginTime} AND #{endTime}")
	List<StuAttenceVo> selectZaoTuiCountByTime(@Param("beginTime")String beginTime,@Param("endTime")String endTime);
	
	@Select("SELECT * FROM stuattendance WHERE setId = (SELECT setId FROM `scoresetting` WHERE setType = 1 AND isUse = 1 AND setItem = '早退') \r\n" + 
			"AND stuId = #{stuId} and `time` between #{beginTime} AND #{endTime} LIMIT 0,1")
	StuAttenceVo selectZaoTuiByStuIdAndTime(@Param("stuId")int stuId, @Param("beginTime")String beginTime, @Param("endTime")String endTime);
	
	
	/**
	 * 查询纪律和卫生
	 * @param beginTime
	 * @param endTime
	 * @param setId
	 * @return
	 */
	@Select("SELECT saId,a.stuId,a.setId,setItem,score,remark,a.`time`,s.`stuName`,s.`stuImage` FROM stuattendance a\r\n" + 
			"INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			"INNER JOIN student s ON s.`stuId` = a.`stuId`\r\n" + 
			"WHERE a.`time`  BETWEEN #{beginTime} AND #{endTime}\r\n" + 
			"AND a.`setId` = #{setId} ORDER BY a.`time` DESC")
	List<StuAttenceVo> selectJilvAndHealth(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("setId")int setId);
	
	
	@Select("SELECT ss.`setId`,setItem,setSort,(SELECT COUNT(*) FROM stuattendance a\r\n" + 
			"INNER JOIN scoresetting b ON a.`setId`=b.`setId`\r\n" + 
			"WHERE a.`time` BETWEEN #{beginTime} AND #{endTime}\r\n" + 
			"AND a.`setId`= ss.`setId`) `count` FROM scoresetting ss WHERE setType = 1")
	List<SetItemVo> selectSetItemPersonalHealth(@Param("beginTime")String beginTime,@Param("endTime")String endTime);
	
	
	

	
	
	
	
	
	
	
	
}
