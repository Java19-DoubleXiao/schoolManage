package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.nana.pojo.Bed;
import com.accp.spring.nana.pojo.Repairs;
import com.accp.spring.nana.vo.DormitoryVo;
import com.accp.spring.nana.vo.RepairsVo;
/**
 * 报修
 * @author 巴拉巴拉大灰狼
 *
 */
public interface RepairsMapper {
	
	@Select("SELECT dormitory.`dormNum`,dormitory.`dormId`,(SELECT COUNT(bedStates) FROM `bed` WHERE bedStates=3 AND dormitory.`dormId`=dormId)'spoilbed',\r\n" + 
			"	(SELECT COUNT(bedStates) FROM `bed` WHERE bedStates!=3 AND dormitory.`dormId`=dormId)'sumbed',\r\n" + 
			"	(SELECT COUNT(bedStates) FROM `bed` WHERE bedStates!=3 AND dormitory.`dormId`=dormId AND bedId IN (\r\n" + 
			"	SELECT dormrelation.`bedId` FROM dormrelation WHERE dormrelation.`isUse`=1 AND dormrelation.`bedId` IN(\r\n" + 
			"		SELECT bedId FROM `bed` B WHERE B.dormId=dormitory.`dormId`\r\n" + 
			"	)))'beding',((SELECT COUNT(bedStates) FROM `bed` WHERE bedStates!=3 AND dormitory.`dormId`=dormId)-(SELECT COUNT(bedStates) FROM `bed` WHERE bedStates=1 AND dormitory.`dormId`=dormId AND bedId IN (\r\n" + 
			"	SELECT dormrelation.`bedId` FROM dormrelation WHERE dormrelation.`bedId` IN(\r\n" + 
			"		SELECT bedId FROM `bed` B WHERE B.dormId=dormitory.`dormId`\r\n" + 
			"	)))) 'emptyBed'\r\n" + 
			"\r\n" + 
			" FROM `dormitory` WHERE dormitory.`dormMangeId`=#{dormMangeId}")
	public List<DormitoryVo> selectRepairStates(@Param("dormMangeId") int dormMangeId);
	
	
	
	
	//报修记录查询
	@Select("SELECT * FROM repairs \r\n" + 
			"INNER JOIN dormitory ON dormitory.`dormId`=repairs.`dormId`\r\n" + 
			"WHERE repairs.`repairStates`=#{repairStates} AND dormitory.`dormMangeId`=#{dormMangeId}")
	public List<Repairs> selectRepairs(@Param("repairStates") int repairStates,@Param("dormMangeId") int dormMangeId);
	
	//报修详情查询
	@Select("SELECT student.`stuName`,classes.`cName`,dormitory.`dormNum`,bed.`bedNum`,student.`stuPhone`,repairs.`repairItem`,repairs.`remark`\r\n" + 
			"FROM repairs \r\n" + 
			"INNER JOIN student ON student.`stuId`=repairs.`stuId`\r\n" + 
			"INNER JOIN classes ON classes.`classId`=student.`classId`\r\n" + 
			"INNER JOIN dormrelation ON dormrelation.`stuId`=student.`stuId`\r\n" + 
			"INNER JOIN bed ON bed.`bedId`=dormrelation.`bedId`\r\n" + 
			"INNER JOIN `dormitory` ON `dormitory`.`dormId`=bed.`dormId`\r\n" + 
			"WHERE repairs.`id`=#{id}")
	public RepairsVo selectRepairsDetail(@Param("id") int id);
	
	//修改报修状态
	@Update("update repairs set repairStates=#{repairStates} where id=#{id}")
	public int updateStates(@Param("repairStates") int repairStates,@Param("id") int id);
	
	//删除报修
	@Delete("delete from repairs where id=#{id}")
	public int deleteRepairs(@Param("id") int id);


}
