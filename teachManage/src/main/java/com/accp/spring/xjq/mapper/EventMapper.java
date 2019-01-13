package com.accp.spring.xjq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.pojo.EventManage;
import com.accp.spring.pojo.EventPerson;
import com.accp.spring.pojo.EventTrack;
import com.accp.spring.pojo.Parents;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.xjq.pojo.EventManageVo;
import com.accp.spring.xjq.pojo.EventPersonVo;

public interface EventMapper {
	
	/**
	 * 查询所有未完成和已完成的
	 * @return
	 */
	@Select("SELECT e.`eventId`,`eventContent`,`eventRemark`,`startTime`,`eventStates`,`startPerson`,tea.`teaName` FROM eventmanage e \r\n" + 
			" INNER JOIN teacher tea ON e.`startPerson`=tea.`teaId`\r\n" + 
			" WHERE `eventStates` = #{eventStates} ORDER BY startTime DESC")
	List<EventManageVo> selectAllEventBystates(@Param("eventStates")int eventStates);
	
	/**
	 * 查询我发起的
	 * @return
	 */
	@Select("SELECT e.`eventId`,`eventContent`,`eventRemark`,`startTime`,`eventStates`,`startPerson`,tea.`teaName` FROM eventmanage e \r\n" + 
			" INNER JOIN teacher tea ON e.`startPerson`=tea.`teaId`\r\n" + 
			" WHERE teaId = #{teaId} ORDER BY startTime DESC")
	List<EventManageVo> selectAllEventByteaId(@Param("teaId")int teaId);
	
	
	/**
	 * 查询事件参与人
	 * @param eventId
	 * @return
	 */
	@Select("SELECT personId,eventId,a.stuId,stuName,b.`stuPhone`,b.`classId`,c.`cName` FROM eventperson a \r\n" + 
			" INNER JOIN student b ON a.`stuId`=b.`stuId`\r\n" + 
			" INNER JOIN classes c ON b.`classId`=c.`classId`\r\n" + 
			" WHERE eventId = #{eventId}")
	List<EventPersonVo> selectPersonByeventId(@Param("eventId")int eventId);
	
	/**
	 * 查询一条事件
	 * @param eventId
	 * @return
	 */
	@Select("SELECT e.`eventId`,`eventContent`,`eventRemark`,`startTime`,`eventStates`,`startPerson`,tea.`teaName` FROM eventmanage e \r\n" + 
			"INNER JOIN teacher tea ON e.`startPerson`=tea.`teaId`\r\n" + 
			"WHERE eventId = #{eventId}")
	EventManageVo selectEventById(@Param("eventId")int eventId);
	
	/**
	 * 查询事件跟踪过程
	 * @param eventId
	 * @return
	 */
	@Select("SELECT etId,`talkId`,teaName,`beTalkId`,`etContent`,`etRemark`,`etTime`,`etPerson` FROM eventtrack e\r\n" + 
			"INNER JOIN teacher t ON e.`talkId`=t.`teaId`\r\n" + 
			"WHERE eventId = #{eventId}")
	List<EventTrack> selectTrackByeventId(@Param("eventId")int eventId);
	
	/**
	 * 新增事件
	 * @param event
	 * @return
	 */
	@Insert("INSERT INTO eventmanage(`eventContent`,`eventRemark`,`eventStates`,`startPerson`) \r\n" + 
			"VALUES(#{eventContent},#{eventRemark},#{eventStates},#{startPerson})")
	@Options(useGeneratedKeys = true, keyProperty = "eventId", keyColumn = "eventId")
	int insertEventManage(EventManage event);

	
	/**
	 * 新增事件人
	 * @param event
	 * @return
	 */
	@Insert("INSERT INTO eventperson(eventId,stuId) VALUES(#{eventId},#{stuId})")
	int insertEventPerson(EventPerson person);


	/**
	 * 新增事件跟踪
	 * @param event
	 * @return
	 */
	@Insert("INSERT INTO eventtrack(`eventId`,`talkId`,`beTalkId`,`etContent`,`etRemark`,`etPerson`) \r\n" + 
			"VALUES(#{eventId},#{talkId},#{beTalkId},#{etContent},#{etRemark},#{etPerson})")
	int insertEventTrack(EventTrack track);
	
	/**
	 * 修改事件状态
	 * @return
	 */
	@Update("UPDATE eventmanage SET eventStates = #{eventStates} WHERE eventId = #{eventId}")
	int updEventManage(@Param("eventStates")Integer eventStates,@Param("eventId")int eventId);


	
	@Select("SELECT * FROM teacher WHERE teaName = #{teaName} ")
	Teacher selectTeaByName(@Param("teaName")String teaName);
	
	@Select("SELECT * FROM parents WHERE pName = #{pName} ")
	Parents selectParentBypName(@Param("pName")String pName);
	
	
}
