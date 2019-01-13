package com.accp.spring.nana.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.nana.pojo.ChangeSleep;
import com.accp.spring.nana.pojo.Dormrelation;
import com.accp.spring.nana.vo.DormrelationVo;

public interface DormrelationMapper {
	//新增一条寝室与学员关系表数据
	@Insert("INSERT INTO dormrelation(stuId,bedId,isUse)\r\n" + 
			"VALUES(#{stuId},#{bedId},1)")
	int insertDormrelation(Dormrelation dormrelation);
	
	
	//修改一条寝室与学员关系表数据的isuse=2
	@Update("update dormrelation set isUse=2,endTime=now() where bedId=#{bedId}")
	int updateDormrelation(@Param("bedId") int bedId);
	
	//入寝记录
	@Select("SELECT dormrelation.`startTime`,student.`stuName`,dormitory.`dormNum`,bed.`bedNum`,classes.`cName` FROM dormrelation\r\n" + 
			"INNER JOIN student ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"INNER JOIN bed ON bed.`bedId`=dormrelation.`bedId`\r\n" + 
			"INNER JOIN `dormitory` ON dormitory.`dormId`=bed.`dormId`\r\n" + 
			"INNER JOIN `classes` ON classes.`classId`=student.`classId`\r\n" + 
			"WHERE isUse=1 AND dormitory.`dormMangeId`=#{dormMangeId} AND dormrelation.`startTime` LIKE '%${startTime}%'")
	List<DormrelationVo> selectDormrelations(@Param("dormMangeId") int dormMangeId,@Param("startTime") String startTime);
	//新增换寝记录
	@Insert("INSERT INTO changeSleep(stuId,ybedId,xbedId)VALUES(#{stuId},#{ydormId},#{xdormId})")
	int insertChangeSleep(@Param("stuId") int stuId,@Param("ydormId") int ydormId,@Param("xdormId") int xdormId);
	//模糊查询换寝记录
	@Select("SELECT ch.`id`, student.`stuName`,ch.`startTime`,b.`bedNum` 'YbedNum',d.`bedNum` 'XbedNum',dor.`dormNum` 'YdormNum',bor.`dormNum` 'XdormNum' FROM changeSleep ch\r\n" + 
			"INNER JOIN student ON student.`stuId`=ch.`stuId`\r\n" + 
			"INNER JOIN bed d ON d.`bedId`=ch.`YbedId`\r\n" + 
			"INNER JOIN bed b ON b.`bedId`=ch.`XbedId`\r\n" + 
			"INNER JOIN `dormitory` dor ON dor.`dormId`=d.`dormId`\r\n" + 
			"INNER JOIN `dormitory` bor ON bor.`dormId`=b.`dormId`\r\n" + 
			"WHERE student.`stuName` LIKE '%${stuName}%' OR ch.`startTime`LIKE binary '%${startTime}%' ORDER BY startTime DESC")
	List<ChangeSleep> selectChangeSleep(@Param("stuName") String stuName,@Param("startTime") String startTime);
	//查询换寝记录
	@Select("SELECT ch.`id`, student.`stuName`,ch.`startTime`,b.`bedNum` 'YbedNum',d.`bedNum` 'XbedNum',dor.`dormNum` 'YdormNum',bor.`dormNum` 'XdormNum' FROM changeSleep ch\r\n" + 
			"INNER JOIN student ON student.`stuId`=ch.`stuId`\r\n" + 
			"INNER JOIN bed d ON d.`bedId`=ch.`YbedId`\r\n" + 
			"INNER JOIN bed b ON b.`bedId`=ch.`XbedId`\r\n" + 
			"INNER JOIN `dormitory` dor ON dor.`dormId`=d.`dormId`\r\n" + 
			"INNER JOIN `dormitory` bor ON bor.`dormId`=b.`dormId` ORDER BY startTime DESC")
	List<ChangeSleep> selectChangeSleepAll();
	//删除换寝记录
	@Delete("delete from changeSleep where id=#{id}")
	int deleteChangeSleep(@Param("id") int id);
}
