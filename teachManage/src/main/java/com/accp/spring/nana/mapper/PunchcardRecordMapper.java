package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.nana.pojo.PunchCardRecordVo;
import com.accp.spring.nana.pojo.PunchCardSetting;
import com.accp.spring.nana.pojo.Registerleave;
import com.accp.spring.nana.vo.StudentPunchcardrecordVo;
/**
 * 打卡记录表
 * @author 巴拉巴拉大灰狼
 *
 */
public interface PunchcardRecordMapper {
	//寝室考勤
	@Select("SELECT COUNT(*) 'sum',\r\n" + 
			"(SELECT COUNT(*) FROM punchcardrecord\r\n" + 
			"INNER JOIN student ON student.`stuId`=punchcardrecord.`stuId`\r\n" + 
			"WHERE `punchTime` LIKE '%${punchTime}%' AND student.`stuSex`=1) 'nanDaka',\r\n" + 
			"(SELECT COUNT(*) FROM punchcardrecord\r\n" + 
			"INNER JOIN student ON student.`stuId`=punchcardrecord.`stuId`\r\n" + 
			"WHERE `punchTime` LIKE '%${punchTime}%' AND student.`stuSex`=2) 'nvDaka',\r\n" + 
			"((SELECT COUNT(*) FROM `dormrelation`\r\n" + 
			"INNER JOIN student ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"WHERE isUse=1 AND student.`stuSex`=1)-(SELECT COUNT(*) FROM punchcardrecord\r\n" + 
			"INNER JOIN student ON student.`stuId`=punchcardrecord.`stuId`\r\n" + 
			"WHERE `punchTime` LIKE '%${punchTime}%' AND student.`stuSex`=1)) 'nanWei',\r\n" + 
			"((SELECT COUNT(*) FROM `dormrelation`\r\n" + 
			"INNER JOIN student ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"WHERE isUse=1 AND student.`stuSex`=2)-(SELECT COUNT(*) FROM punchcardrecord\r\n" + 
			"INNER JOIN student ON student.`stuId`=punchcardrecord.`stuId`\r\n" + 
			"WHERE `punchTime` LIKE '%${punchTime}%' AND student.`stuSex`=2)) 'nvWei'\r\n" + 
			"FROM `dormrelation` WHERE isUse=1 ")
	PunchCardRecordVo selectSum(@Param("punchTime") String punchTime);
	
	//住校总人数
	@Select("SELECT COUNT(*) FROM `dormrelation` WHERE isUse=1")
	int selectSums();
	
	@Select("SELECT COUNT(*) FROM `dormrelation`\r\n" + 
			"INNER JOIN student ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"WHERE isUse=1 AND student.`stuSex`=#{stuSex}")
	int selectNanSum(@Param("stuSex") int stuSex);
	
	//考勤记录
	@Select("SELECT dormrelation.`id`, student.`stuId`, student.`stuName`,classes.`classId`, classes.`cName`,\r\n" + 
			"(SELECT punchTime FROM punchcardrecord  WHERE `stuId`=dormrelation.`stuId` AND `punchTime` BETWEEN #{beginTime} \r\n" + 
			"AND #{lateTime} ORDER BY punchTime DESC LIMIT 0,1) punchTime FROM `dormrelation`\r\n" + 
			"INNER JOIN student  ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"INNER JOIN classes ON classes.`classId`=student.`classId` inner join bed on bed.`bedId`=dormrelation.`bedId`\r\n" + 
			"inner join `dormitory` on `dormitory`.`dormId`=bed.`dormId`\r\n" + 
			"WHERE dormrelation.`isUse`=1 and dormitory.`dormMangeId`=#{dormMangeId}  ORDER BY punchTime")
	List<StudentPunchcardrecordVo> selectPun(@Param("beginTime")String beginTime,@Param("lateTime")String lateTime,@Param("dormMangeId") int dormMangeId);
	//查询扣分规则
	@Select("SELECT * FROM punchcardsetting WHERE punchId = #{punchId}")
	PunchCardSetting selectSetting(@Param("punchId")int punchId);
	//根据考勤时间查询不住寝登记表
	@Select("SELECT *FROM registerleave WHERE #{beginTime} BETWEEN startTime and endTime ")
	List<Registerleave> selectRegisterleave(@Param("beginTime") String beginTime);
}
