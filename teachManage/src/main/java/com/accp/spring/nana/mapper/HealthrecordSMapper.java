package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.nana.pojo.HealthrecordS;
import com.accp.spring.nana.pojo.HealthrecordimgS;
import com.accp.spring.nana.vo.HealthrecordVo;

public interface HealthrecordSMapper {
	//根据宿管id查询被管辖的所有宿舍的卫生扣分情况
	@Select("SELECT a.`dormId`,a.`dormNum`,(SELECT SUM(score) FROM healthrecord\r\n" + 
			"INNER JOIN `dormitory` ON `dormId`=healthrecord.`checkId`\r\n" + 
			"WHERE `checkId` = a.dormId AND healthrecord.`checkTime` LIKE '%${checkTime}%') score FROM dormitory a\r\n" + 
			"WHERE a.`dormMangeId`=#{dormMangeId} ORDER BY score DESC")
	List<HealthrecordVo> selectHealthrecord(@Param("dormMangeId") int dormMangeId,@Param("checkTime") String checkTime);
	//根据寝室id和日期查询寝室卫生详细情况
	@Select("SELECT d.`dormId`,d.`dormNum`,h.`checkTime`, s.`setItem`,s.`setScore`,h.`id` FROM healthrecord h\r\n" + 
			"INNER JOIN dormitory d ON d.`dormId`=h.`checkId`\r\n" + 
			"INNER JOIN `scoresetting` s ON s.`setId`=h.`setId`\r\n" + 
			"WHERE d.`dormId`=#{dormId} AND h.`checkTime` LIKE '%${checkTime}%' ORDER BY score DESC")
	List<HealthrecordVo> selectHealthrecordDetail(@Param("dormId") int dormId ,@Param("checkTime") String checkTime);
	//根据卫生id查询卫生图片
	@Select("SELECT * FROM `healthrecordimg` WHERE `HealthRecordId`=#{HealthRecordId}")
	List<HealthrecordimgS> selectHealthrecordimg(@Param("HealthRecordId") int HealthRecordId);
	
	//新增寝室卫生
	@Insert("INSERT INTO healthrecord(setId,checkId,checkType,score,checkPerson)\r\n" + 
			"VALUES(#{setId},#{checkId},#{checkType},#{score},#{checkPerson})")
	@Options(useGeneratedKeys=true,keyColumn="id",keyProperty="id")
	int insertHealthrecord(HealthrecordS healthrecord);
	//新增卫生图片
	@Insert("INSERT INTO healthrecordimg(HealthRecordId,dormMangeId,imgPath)\r\n" + 
			"VALUES(#{HealthRecordId},#{dormMangeId},#{imgPath})")
	int insertHealthrecordImg(@Param("HealthRecordId") int HealthRecordId,@Param("dormMangeId") int dormMangeId,@Param("imgPath") String imgPath);

}
