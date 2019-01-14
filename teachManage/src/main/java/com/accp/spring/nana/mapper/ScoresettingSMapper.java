package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.nana.pojo.ScoreSettingS;
import com.accp.spring.nana.vo.DormitoryVo;

public interface ScoresettingSMapper {
	//查询寝室、卫生的规则
	@Select("SELECT * FROM scoresetting WHERE setType=2 AND setSort=3 AND isUse=1")
	List<ScoreSettingS> selectAll();
	//根据扣分制度id查询扣分制度分数
	@Select("SELECT * FROM `scoresetting` WHERE setId=#{setId}")
	ScoreSettingS selectScoreSetting(@Param("setId") int setId);
	
	//发通知
		@Insert("INSERT INTO `schoolmanage`.`inform` (`informTypeId`,`informTitle`,`informContent`,`sendPerson`,`acceptPerson`,`isDel`)\r\n" + 
				"VALUES(5,#{informTitle},#{informContent},#{sendPerson},#{acceptPerson},1)")
		@Options(useGeneratedKeys = true, keyProperty = "informId", keyColumn = "informId")
		int insertInform(Inform inform);
	//根据查询寝室id查询寝室人员
	@Select("SELECT * FROM dormitory \r\n" + 
			"INNER JOIN bed ON bed.`dormId`=dormitory.`dormId`\r\n" + 
			"INNER JOIN `dormrelation` ON dormrelation.`bedId`=bed.`bedId`\r\n" + 
			"INNER JOIN student ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"WHERE dormitory.`dormId`=#{dormId}")
	List<DormitoryVo> selectDormitoryVo(@Param("dormId") int dormId);
	
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
						
}
