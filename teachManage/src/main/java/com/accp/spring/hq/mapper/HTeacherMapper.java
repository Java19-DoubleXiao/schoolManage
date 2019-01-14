package com.accp.spring.hq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.accp.spring.hq.pojo.AcceptPerson;
import com.accp.spring.hq.pojo.HClasses;
import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.pojo.TimeTable;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.hq.vo.TeaInfo;
import com.accp.spring.pojo.Student;

@Repository
public interface HTeacherMapper {
	
	//查出这个教员所教的班级--给了固定id
	@Select("SELECT cl.* FROM ctrelation ct\r\n" + 
			"INNER JOIN classes cl ON cl.`classId`=ct.`classId`\r\n" + 
			"WHERE ct.`userId`=#{userId}")
	List<HClasses> selectClassByTea(@Param("userId")int userId);
	
	
	//查出这个班级里的学生的信息
	@Select("SELECT stu.stuId,stu.stuName,stu.stuSex,stu.stuImage FROM student stu\r\n" + 
			"INNER JOIN classes cl ON cl.`classId`=stu.classId\r\n" + 
			"WHERE cl.`classId`=#{classId}")
	List<Student> selectStuByClass(@Param("classId")int classId);
	
	
	
	//发通知
	@Insert("INSERT INTO `schoolmanage`.`inform` (`informTypeId`,`informTitle`,`informContent`,`sendPerson`,`acceptPerson`,`isDel`)\r\n" + 
			"VALUES(4,#{informTitle},#{informContent},#{sendPerson},#{acceptPerson},1)")
	@Options(useGeneratedKeys = true, keyProperty = "informId", keyColumn = "informId")
	int insertInform(Inform inform);
	
	
	@Insert("INSERT INTO `schoolmanage`.`acceptperson` (`informId`,`acceptId`,`acceptType`,`isDel`)\r\n" + 
			"VALUES(#{informId},#{acceptId},1,1);")
	int insertAcc(@Param("informId")int informId,@Param("acceptId")int acceptId);
	
	
	//所收通知
	@Select("SELECT inform.*,acc.`readTime` FROM inform\r\n" + 
			"INNER JOIN acceptperson acc ON acc.`informId`=inform.`informId`\r\n" + 
			"WHERE acceptPerson LIKE '%${teaId}%' AND acc.`isDel`=1 AND acc.`acceptId`=#{teaId}\r\n" + 
			"ORDER BY informTime DESC")
	List<Inform> selectAccInform(@Param("teaId")int teaId);
	
	
	//所发通知
	@Select("SELECT * FROM inform \r\n" + 
			"WHERE sendPerson=#{teaId} AND isDel=1\r\n" + 
			"ORDER BY informTime DESC")
	List<Inform> selectSendInform(@Param("teaId")int teaId);
	
	
	//查看通知详情
	@Select("SELECT inform.*,tea.`teaName` FROM inform \r\n" + 
			"INNER JOIN acceptperson acc ON acc.`informId`=inform.`informId`\r\n" + 
			"INNER JOIN teacher tea ON tea.`teaId`=inform.`sendPerson`\r\n" + 
			"WHERE inform.informId=#{informId} AND acc.`acceptId` =#{teaId} AND inform.isDel=1")
	Inform selectInfoById(@Param("informId")int informId,@Param("teaId")int teaId);
	
	
	//已看通知修改看的时间
	@Update("UPDATE acceptperson SET readTime=NOW() WHERE informId=#{informId}  AND acceptId=#{teaId} AND isDel=1")
	int updateInfoTime(@Param("informId")int informId,@Param("teaId")int teaId);
	
	
	
	//已发通知详情       已看通知人数
	@Select("SELECT DISTINCT(tea.`teaName`),inform.*,\r\n" + 
			"(SELECT COUNT(acc.`readTime`) FROM acceptperson acc \r\n" + 
			"INNER JOIN inform inf ON inf.`informId`=acc.`informId`\r\n" + 
			"INNER JOIN student stu ON stu.`stuId`=acc.`acceptId`\r\n" + 
			"WHERE inf.`sendPerson`=#{teaId} AND inf.informId=#{informId})AS'count' FROM inform \r\n" + 
			"INNER JOIN acceptperson acc ON acc.`informId`=inform.`informId`\r\n" + 
			"INNER JOIN teacher tea ON tea.`teaId`=inform.`sendPerson`\r\n" + 
			"WHERE inform.informId=#{informId} AND inform.`sendPerson`=#{teaId} AND inform.isDel=1")
	Inform selectSendInfoById(@Param("informId")int informId,@Param("teaId")int teaId);
	
	
	//已看通知的人  姓名  头像
	@Select("SELECT stu.`stuName`,stu.`stuImage` FROM acceptperson acc \r\n" + 
			"INNER JOIN inform inf ON inf.`informId`=acc.`informId`\r\n" + 
			"INNER JOIN student stu ON stu.`stuId`=acc.`acceptId`\r\n" + 
			"WHERE inf.`sendPerson`=#{teaId} and acc.`informId`=#{informId}  AND acc.`readTime`IS NOT NULL")
	List<StudentOne> selectLookPeople(@Param("teaId")int teaId,@Param("informId")int informId);
	
	
	
	
	//删除通知  发
	@Update("UPDATE inform SET isDel=2 WHERE informId=#{informId} AND sendPerson=#{teaId}")
	int updateInfo(@Param("informId")int informId,@Param("teaId")int teaId);
	
	
	
	//删除通知  收
	@Update("UPDATE acceptPerson SET isDel=2 WHERE informId=#{informId} AND acceptId=#{teaId}")
	int updateAcc(@Param("informId")int informId,@Param("teaId")int teaId);
	
	
	//查询我的信息
	@Select("SELECT tea.`teaId`,tea.`teaName`,tea.`teaUserName`,tea.`teaType`,tea.`teaImage`,tea.`teaBirth`,tea.`teaPhone`,tea.`teaSex`,\r\n" + 
			"FLOOR(DATEDIFF(CURRENT_DATE,tea.`teaBirth`)/365)AS'age' FROM teacher tea WHERE teaId=#{teaId}")
	TeaInfo selectMyInfo(@Param("teaId")int teaId);
	
	
	//验证密码
	@Select("SELECT COUNT(tea.`teaPwd`) FROM teacher tea\r\n" + 
			"WHERE teaId=#{teaId} AND teaPwd=#{teaPwd}")
	int yanzhengold(@Param("teaId")int teaId,@Param("teaPwd")String teaPwd);
	
	
	@Update("update teacher set teaPwd=#{teaPwd} where teaId=#{teaId}")
	int changepass(@Param("teaId")int teaId,@Param("teaPwd")String teaPwd);
	
	
	//#查询这个教员的本周的课表
	@Select("SELECT tt.*,cl.`cName`,tea.`teaName` FROM timetable tt\r\n" + 
			"INNER JOIN classes cl ON cl.`classId`=tt.`classId`\r\n" + 
			"INNER JOIN teacher tea ON tea.`teaId`=tt.`lessonTeacher`\r\n" + 
			"WHERE tt.`lessonTeacher`=#{teaId} AND YEARWEEK(DATE_FORMAT(lessonTime,'%Y-%m-%d')) = YEARWEEK(NOW())\r\n" + 
			"ORDER BY tt.`lessonTime` ASC")
	List<TimeTable> selectClassTableByTeaId(@Param("teaId")int teaId);
	
	
	@Select("SELECT tt.*,cl.`cName`,tea.`teaName` FROM timetable tt\r\n" + 
			"INNER JOIN classes cl ON cl.`classId`=tt.`classId`\r\n" + 
			"INNER JOIN teacher tea ON tea.`teaId`=tt.`lessonTeacher`\r\n" + 
			"WHERE tt.`lessonTeacher`=#{teaId} AND YEARWEEK(DATE_FORMAT(lessonTime,'%Y-%m-%d')) = YEARWEEK(NOW()) AND tt.`lessonTime` LIKE '${lessonTime}%'\r\n" + 
			"ORDER BY tt.`lessonTime` ASC")
	List<TimeTable> selectByDate(@Param("teaId")int teaId,@Param("lessonTime")String lessonTime);
	
	
	
	
	
	
	
	
}
