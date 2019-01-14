package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.accp.spring.nana.pojo.BedS;
import com.accp.spring.nana.pojo.DormitoryS;
import com.accp.spring.nana.pojo.DormrelationS;
import com.accp.spring.nana.vo.DormitoryVo;
/**
 * 寝室床位mapper
 * @author 巴拉巴拉大灰狼
 *
 */
@Repository
public interface DormitorySMapper {

	//根据寝室类别查询所有寝室
	@Select("SELECT * FROM dormitory  WHERE dormitory.`dormMangeId`=#{dormMangeId}")
	List<DormitoryS> selectDormitory(@Param("dormMangeId") int dormMangeId);
	//查询寝室容纳总床数
	@Select("SELECT bedCount  FROM dormitory  WHERE `dormId`=#{dormId}")
	int selectBedCount(@Param("dormId") int dormId);
	//新增寝室
	@Insert("INSERT INTO dormitory(dormNum,dormMangeId,adminId,dormType)\r\n" + 
			"VALUES(#{dormNum},#{dormMangeId},#{adminId},#{dormType})")
	int insertDormitory(DormitoryS dormitory);
	//删除寝室
	@Delete("delete from dormitory where dormId=#{dormId}")
	int deleteDormitory(@Param("dormId") int dormId);
	//根据寝室id查询寝室情况
	@Select("SELECT * FROM dormitory WHERE dormId=#{dormId}")
	DormitoryS selectOne(@Param("dormId") int dormId);
	//设置寝室长
	@Update("update dormitory set adminId=#{adminId} where dormId=#{dormId}")
	int updateAdmin(@Param("adminId") int adminId,@Param("dormId") int dormId);
	
	
	/**
	 * 床位
	 * @param dormId
	 * @return
	 */
	//根据寝室id查询所有床位学生相关信息
	@Select("SELECT dormitory.`dormNum`,dormitory.`adminId`,bed.`bedNum`,student.`stuName`,student.`stuId`,cl.cName,student.stuPhone,parents.`pPhone`,teacher.`teaPhone`,\r\n" + 
			"(SELECT COUNT(*) FROM dormitory WHERE dormitory.`adminId`=student.`stuId`) 'count'\r\n" + 
			"FROM dormrelation \r\n" + 
			"INNER JOIN bed  ON dormrelation.`bedId`=bed.`bedId`\r\n" + 
			"INNER JOIN dormitory ON bed.`dormId`=dormitory.`dormId`\r\n" + 
			"INNER JOIN student ON student.`stuId`=dormrelation.`stuId`\r\n" + 
			"INNER JOIN parents ON parents.`stuId`=student.`stuId`\r\n" + 
			"INNER JOIN csrelation ON csrelation.stuId=student.`stuId`\r\n" + 
			"INNER JOIN ctrelation ON ctrelation.`classId`=csrelation.`classId`\r\n" + 
			"INNER JOIN classes cl ON cl.classId=csrelation.classId  \r\n" + 
			"INNER JOIN teacher ON teacher.`teaId`=ctrelation.`userId`\r\n" + 
			"WHERE dormitory.`dormId`=#{dormId} AND teacher.`teaType`=1")
	List<DormitoryVo> selectBed(@Param("dormId") int dormId);
	
	//根据寝室id查询所有床位
	@Select(" SELECT * FROM bed WHERE bed.`dormId`=#{dormId}")
	public List<BedS> selectStates(@Param("dormId") int dormId);
	
	@Select("SELECT * FROM dormrelation WHERE bedId = #{bedId} AND dormrelation.`isUse`=1")
	public DormrelationS selectDormrelation(@Param("bedId") int bedId);
	//新增床位
	@Insert("INSERT INTO bed(dormId,bedNum,bedStates)\r\n" + 
			"VALUES(#{dormId},#{bedNum},#{bedStates})")
	int insertBed(BedS bed);
	//删除床位
	@Delete("delete from bed where bedId=#{bedId}")
	int deleteBed(@Param("bedId") int bedId);
	//修改床位状态
	@Update("update bed set bedStates=#{bedStates} where bedId=#{bedId}")
	int updateBed(@Param("bedStates") int bedStates, @Param("bedId") int bedId);
	//查询床位数量
	@Select("select count(`bedNum`) 'bedCount' from bed where bed.`dormId`=#{dormId}")
	int bedCount(@Param("dormId") int dormId);
	//根据寝室id查询所有空白床位
	@Select("SELECT * FROM bed INNER JOIN dormitory ON dormitory.`dormId`=bed.`dormId` WHERE bed.`bedStates`=2 AND bed.`dormId`=#{dormId}")
	List<BedS> selectEmptyBed(@Param("dormId") int dormId);
}
