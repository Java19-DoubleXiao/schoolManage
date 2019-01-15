package com.accp.spring.hq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.hq.pojo.ExamPaperHistory;
import com.accp.spring.hq.pojo.Examination;
import com.accp.spring.hq.pojo.StuTest;
import com.accp.spring.hq.vo.Exammation;

public interface ExamMapper {
	
	//查出这个教员所教的班级的考试      条件：班级id
	@Select("SELECT ex.examId,eph.paperName,ex.startTime FROM Examination ex\r\n" + 
			"INNER JOIN ExamPaperHistory eph ON eph.paperId=ex.examPaperId\r\n" + 
			"WHERE ex.classId LIKE '%${classId}%' AND NOW() >= ex.`epSendTime` \r\n" + 
			"ORDER BY ex.startTime DESC")
	List<Examination> selectAllExam(@Param("classId")int classId);
	
	
	//试卷名称，考试时间，考试类型，参加人数，平均分       条件：班级id考试id
	@Select("SELECT ex.examId,eph.paperName,ex.startTime,ep.testRange,COUNT(stu.`stuId`)AS'count',\r\n" + 
			"ROUND(SUM(stu.score)/COUNT(stu.`stuId`),2)AS'average' FROM StuTest stu\r\n" + 
			"INNER JOIN Examination ex ON ex.`examId`=stu.`examId`\r\n" + 
			"INNER JOIN ExamPaperHistory eph ON eph.paperId=ex.examPaperId\r\n" + 
			"INNER JOIN exampaper ep ON ep.epId = eph.epId\r\n" + 
			"INNER JOIN csrelation cs ON cs.stuId = stu.stuId AND cs.classId = #{classId}\r\n" + 
			"WHERE ex.examId=#{examId} AND ex.classId LIKE '%${classId}%'")
	Exammation selectMation(@Param("classId")int classId,@Param("examId")int examId);
	
	
	//测试每个同学的成绩      条件：班级id考试id
	@Select("SELECT student.`stuName`,student.`stuImage`,stu.score FROM StuTest stu\r\n" + 
			"INNER JOIN Examination ex ON ex.`examId`=stu.`examId`\r\n" + 
			"INNER JOIN student ON student.`stuId`=stu.`stuId`\r\n" + 
			"INNER JOIN csrelation cs ON cs.stuId = stu.stuId AND cs.classId =#{classId}\r\n" + 
			"WHERE ex.examId=#{examId} AND ex.classId LIKE '%${classId}%'\r\n" + 
			"ORDER BY stu.score DESC")
	List<StuTest> selectScore(@Param("classId")int classId,@Param("examId")int examId);
	
	
	//查询出这个教员使用过的历史试卷
	@Select("SELECT DISTINCT(eph.`paperId`),eph.`paperName`,eph.`passrate` FROM exampaperhistory eph\r\n" + 
			"WHERE eph.`isForbid`=1\r\n" + 
			"ORDER BY eph.`createTime` DESC")
	List<ExamPaperHistory> selectHisByTeaId();
	
	
	
	//查询当天的考试班级信息
	@Select("SELECT ex.`examId`,eph.`paperName`,cl.`cName`,ex.`startTime`,DATE_FORMAT(ex.`startTime`,'%H:%i')AS'times'\r\n" + 
			"FROM Examination ex\r\n" + 
			"INNER JOIN ExamPaperHistory eph ON eph.`paperId`=ex.`examPaperId`\r\n" + 
			"INNER JOIN classes cl ON cl.`classId`=ex.`classId`\r\n" + 
			"WHERE ex.`startTime` >= NOW()")
	List<Exammation> selectExamByDate();
	
	
	
	@Select("SELECT ex.`examId`,eph.`paperName`,cl.`cName`,ex.`startTime`,DATE_FORMAT(ex.`startTime`,'%H:%i')AS'times'\r\n" + 
			"FROM Examination ex\r\n" + 
			"INNER JOIN ExamPaperHistory eph ON eph.`paperId`=ex.`examPaperId`\r\n" + 
			"INNER JOIN classes cl ON cl.`classId`=ex.`classId`\r\n" + 
			"WHERE ex.`startTime` LIKE '${date}%'")
	List<Exammation> showExamByDate(@Param("date")String date);
	
	
	
	//发布考试       考试表、考试情况表
	@Insert("INSERT INTO `schoolmanage`.`examination` (`examPaperId`,`classId`,`teaId`,`startTime`,`endTime`)"
			+ "values(#{examPaperId},#{classId},#{teaId},#{startTime},#{endTime})")
	@Options(useGeneratedKeys = true, keyProperty = "examId", keyColumn = "examId")//设置主键自增
	int insertExamination(Examination examination);
	
	@Insert("INSERT INTO `schoolmanage`.`stutest` (`stuId`,`examId`,`status`)"
			+ "values(#{stuId},#{examId},1)")
	int insertStuTest(@Param("stuId")int stuId,@Param("examId")int examId);
	
	
	
	
	
	
}
