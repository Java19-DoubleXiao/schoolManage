package com.accp.spring.xjq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.pojo.LeaveProcessTrack;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.xjq.pojo.LeaveDomeNodeVo;
import com.accp.spring.xjq.pojo.LeaveProcessTrackVo;
import com.accp.spring.xjq.pojo.LeaveProcessVo;
import com.accp.spring.xjq.pojo.RegisterLeaveVo;

public interface LeaveMapper {
	
	/**
	 * 查询所有请假实例
	 * @return
	 */
	@Select("SELECT `leaveId`,a.`domeId`,a.`stuId`,s.`stuName`,s.`classId`,(SELECT cName FROM classes WHERE classId = s.`classId`) `cName`,s.`stuPhone`,`leaTime`,`leaReason`,`leaStartTime`,`leaEndTime`,`leaStates`,`isDorm`,`domeType` FROM leaveprocess a \r\n" + 
			"INNER JOIN leaveprocessdome b ON a.`domeId`=b.`domeId`\r\n" + 
			"INNER JOIN student s ON a.`stuId`=s.`stuId`\r\n" + 
			"WHERE b.`isForbid` = 1 ")
	List<LeaveProcessVo> selectAllLeaveProcess();
	
	/**
	 * 查询单个请假实例
	 * @param leaveId
	 * @return
	 */
	@Select("SELECT `leaveId`,a.`domeId`,a.`stuId`,s.`stuName`,s.`classId`,(SELECT cName FROM classes WHERE classId = s.`classId`) `cName`,s.`stuPhone`,`leaTime`,`leaReason`,`leaStartTime`,`leaEndTime`,`leaStates`,`isDorm`,`domeType` FROM leaveprocess a \r\n" + 
			"INNER JOIN leaveprocessdome b ON a.`domeId`=b.`domeId`\r\n" + 
			"INNER JOIN student s ON a.`stuId`=s.`stuId`\r\n" + 
			"WHERE b.`isForbid` = 1 AND leaveId = #{leaveId}")
	LeaveProcessVo selectLeaveByid(@Param("leaveId")int leaveId);
	
	/**
	 * 查询请假模板下的节点
	 * @param leaveId
	 * @return
	 */
	@Select("SELECT * FROM leavedomenode node\r\n" + 
			"WHERE  node.`domeId` = (SELECT domeId FROM leaveprocess WHERE leaveId = #{leaveId}) ")
	List<LeaveDomeNodeVo> selectAllNodeByDomeId(@Param("leaveId")int leaveId);
	
	
	/**
	 * 根据员工 类型查询单条请假实例的老师
	 * @param teaType
	 * @return
	 */
	@Select("SELECT teaId,teaName,teaType FROM teacher tea WHERE teaId IN (\r\n" + 
			"SELECT userId FROM ctrelation ct WHERE ct.`classId` = (SELECT classId FROM csRelation cs WHERE cs.`stuId` = (SELECT stuId FROM leaveprocess WHERE leaveId = #{leaveId}))\r\n" + 
			") AND teaType = #{teaType} ")
	Teacher selectTeaByType(@Param("leaveId")int leaveId,@Param("teaType")int teaType);
	
	
	@Select("SELECT `trackId`,`leaveId`,a.`nodeId`,n.`node`,a.`handler`,`suggestion`,`dealTime`,`dealResult`,teaName,teaType FROM leaveprocesstrack a\r\n" + 
			"INNER JOIN teacher b ON a.`handler`=b.`teaId`\r\n" + 
			"INNER JOIN leavedomenode n ON n.`nodeId`=a.`nodeId`\r\n" + 
			"WHERE leaveId = #{leaveId} order by node ")
	List<LeaveProcessTrackVo> selectTrackByleaveId(@Param("leaveId")int leaveId);
	
	
	@Insert("INSERT INTO leaveprocesstrack(`leaveId`,`nodeId`,`handler`,`suggestion`,`dealTime`,`dealResult`) \r\n" + 
			"VALUES(#{leaveId},#{nodeId},#{handler},#{suggestion},#{dealTime},#{dealResult})")
	@Options(useGeneratedKeys=true,keyColumn="trackId",keyProperty="trackId")
	int insertLeaveTrack(LeaveProcessTrack track);
	
	@Update("UPDATE leaveprocesstrack SET leaveId = #{leaveId},nodeId =#{nodeId},`handler`=#{handler},suggestion=#{suggestion},dealTime=NOW() ,dealResult= #{dealResult}  where trackId = #{trackId} \r\n" + 
			"")
	int updLeaveTrack(LeaveProcessTrack track);
	
	@Update("UPDATE leaveprocess SET leaStates = #{leaStates} WHERE leaveId = #{leaveId}")
	int updLeaveProcess(@Param("leaStates")int leaStates,@Param("leaveId")int leaveId);
	
	@Insert("INSERT INTO registerleave(`stuId`,`startTime`,`endTime`,`writeTime`,`dormMangeId`,`recordTime`) \r\n" + 
			"VALUES(#{stuId},#{startTime},#{endTime},#{writeTime},#{dormMangeId},NOW()")
	int insertDormLeave(RegisterLeaveVo leave);
	
	
	

}
