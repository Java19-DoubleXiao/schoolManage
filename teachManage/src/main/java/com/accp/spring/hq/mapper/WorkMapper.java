package com.accp.spring.hq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.hq.pojo.Homework;
import com.accp.spring.hq.pojo.Workfinish;
import com.accp.spring.hq.vo.StuCount;

public interface WorkMapper {
	
	@Select("SELECT * FROM homework hw\r\n" + 
			"WHERE hw.`teaId`=#{teaId} AND hw.`classId`LIKE '%${classId}%' ORDER BY workTime DESC")
	List<Homework> selectByClaIdAndTeaId(@Param("teaId")int teaId,@Param("classId")int classId);
	
	
	
	//查询是否登记过
	@Select("SELECT (SELECT COUNT(cs.`id`) FROM student stu\r\n" + 
			"INNER JOIN csrelation cs ON cs.`stuId`=stu.`stuId` \r\n" + 
			"INNER JOIN ctrelation ct ON ct.`classId`=cs.`classId`\r\n" + 
			"WHERE ct.`userId`=#{teaId} AND ct.`classId`=#{classId}) 'all',(SELECT COUNT(*) FROM workfinish wf\r\n" + 
			"INNER JOIN homework hw ON hw.`workId`=wf.`workId`\r\n" + 
			"INNER JOIN csrelation  cs ON cs.`stuId`=wf.`stuId` \r\n" + 
			"WHERE hw.`workId`=#{workId} AND cs.`classId`=#{classId} AND wfScore >0 OR (wfScore=0 AND wfRemark IS NOT NULL)) 'ok',((SELECT COUNT(cs.`id`) FROM student stu\r\n" + 
			"INNER JOIN csrelation cs ON cs.`stuId`=stu.`stuId` \r\n" + 
			"INNER JOIN ctrelation ct ON ct.`classId`=cs.`classId`\r\n" + 
			"WHERE ct.`userId`=#{teaId} AND ct.`classId`=#{classId})-(SELECT COUNT(*) FROM workfinish wf\r\n" + 
			"INNER JOIN homework hw ON hw.`workId`=wf.`workId`\r\n" + 
			"INNER JOIN csrelation  cs ON cs.`stuId`=wf.`stuId` \r\n" + 
			"WHERE hw.`workId`=#{workId} AND cs.`classId`=#{classId} AND wfScore >0 OR (wfScore=0 AND wfRemark IS NOT NULL))) 'no'")
	StuCount selectDengji(@Param("teaId")int teaId,@Param("workId")int workId,@Param("classId")int classId);
	
	
	
	//查询班级有多少学生
/*	@Select("SELECT COUNT(cs.`id`) FROM student stu\r\n" + 
			"INNER JOIN csrelation cs ON cs.`stuId`=stu.`stuId` \r\n" + 
			"INNER JOIN ctrelation ct ON ct.`classId`=cs.`classId`\r\n" + 
			"WHERE ct.`userId`=#{teaId} AND ct.`classId`=#{classId}")
	int selectStuCount(@Param("teaId")int teaId,@Param("classId")int classId);*/
	
	
	//登记作业情况
/*	@Insert("INSERT INTO `schoolmanage`.`workfinish` (`workId`,`wfScore`,`stuId`,`wfRemark`,`recordPerson`)\r\n" + 
			"VALUES(#{workId},#{wfScore},#{stuId},#{wfRemark},#{recordPerson})")
	int dengji(Workfinish wf);*/
	
	
	//查询这个学生是否登记过
	/*@Select("SELECT * FROM workfinish wf\r\n" + 
			"WHERE wf.`workId`=#{workId} AND wf.`stuId`=#{stuId}")
	Workfinish selectDengjiByStuId(@Param("workId")int workId,@Param("stuId")int stuId);*/
	
	
	//修改成绩
	@Update("UPDATE workfinish SET wfScore=#{wfScore} WHERE workId=#{workId} AND stuId=#{stuId}")
	int updatewfScore(@Param("wfScore")int wfScore,@Param("workId")int workId,@Param("stuId")int stuId);
	
	//修改成绩
	@Update("UPDATE workfinish SET wfRemark=#{wfRemark} WHERE workId=#{workId} AND stuId=#{stuId}")
	int updatewfRemark(@Param("wfRemark")String wfRemark,@Param("workId")int workId,@Param("stuId")int stuId);
	
	
	//布置作业
	@Insert("INSERT INTO `schoolmanage`.`homework` (`workContent`,`teaId`,`classId`)\r\n" + 
			"VALUES(#{workContent},#{teaId},#{classId})")
	@Options(useGeneratedKeys = true, keyProperty = "workId", keyColumn = "workId")//设置主键自增
	int buzhiWork(Homework hw);
	
	
	//布置作业附件表
	int insertFiles();
	
	
	
	//布置作业时往表里填数字
	@Insert("INSERT INTO `schoolmanage`.`workfinish` (`workId`,`wfScore`,`stuId`,`recordPerson`)\r\n" + 
			"VALUES(#{workId},0,#{stuId},#{recordPerson})")
	int insertStuToWork(@Param("workId")int workId,@Param("stuId")int stuId,@Param("recordPerson")int recordPerson);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
