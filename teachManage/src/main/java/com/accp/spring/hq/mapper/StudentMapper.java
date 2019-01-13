package com.accp.spring.hq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.accp.spring.hq.vo.Dor;
import com.accp.spring.hq.vo.Score;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.pojo.Student;

@Repository
public interface StudentMapper {
	//查询单个学生信息
	@Select("SELECT stu.stuName,stu.stuImage,stu.stuUserName,stu.stuSex,stu.stuPhone,stu.stuType,\r\n" + 
			"FLOOR(DATEDIFF(CURRENT_DATE,stu.stuBirth)/365)AS'stuBirth',stu.stuAddress,\r\n" + 
			"p.pName,p.pPhone,cl.cName,g.gName\r\n" + 
			"FROM student stu\r\n" + 
			"INNER JOIN parents p ON p.stuId=stu.stuId\r\n" + 
			"INNER JOIN csrelation cs ON cs.stuId=stu.stuId\r\n" + 
			"INNER JOIN classes cl ON cl.classId=cs.classId\r\n" + 
			"INNER JOIN grade g ON g.gId=cl.gId\r\n" + 
			"WHERE stu.stuId=#{stuId}")
	StudentOne selectOneStu(int stuId);
	
	
	//查询这个学生有没有住寝
	@Select("SELECT dormitory.dormNum,teacher.`teaName` FROM dormrelation \r\n" + 
			"INNER JOIN bed ON bed.`bedId`=dormrelation.bedId\r\n" + 
			"INNER JOIN dormitory ON dormitory.dormId=bed.`dormId`\r\n" + 
			"INNER JOIN teacher ON teacher.`teaId`=dormitory.dormMangeId\r\n" + 
			"WHERE dormrelation.stuId=#{stuId}")
	Dor selectDorByStuId(int stuId);
	
	
	//查询这个班级的人员
	@Select("SELECT stu.`stuId`,stu.`stuName`,wf.`wfScore`,wf.`wfRemark` FROM student stu\r\n" + 
			"INNER JOIN csrelation cs ON cs.`stuId`=stu.`stuId`\r\n" + 
			"INNER JOIN workfinish wf ON wf.`stuId`=stu.`stuId`\r\n" + 
			"WHERE cs.`classId`=#{classId}")
	List<StudentOne> selectAllStu(int classId);
	
	
	//查询学生近期的考试成绩起伏
	@Select("SELECT eph.`paperName`,stu.`stuName`,test.`score` FROM StuTest test\r\n" + 
			"INNER JOIN student stu ON stu.`stuId`=test.`stuId`\r\n" + 
			"INNER JOIN examination ex ON ex.`examId`=test.`examId`\r\n" + 
			"INNER JOIN exampaperhistory eph ON eph.`paperId`=ex.`examPaperId`\r\n" + 
			"WHERE test.`stuId`=#{stuId} and ex.`startTime`LIKE'${startTime}%'")
	List<Score> selectScore(@Param("stuId")int stuId,@Param("startTime")String startTime);
	
	
	
	
	
	
	
	
	
}
