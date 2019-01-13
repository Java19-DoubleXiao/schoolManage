package com.accp.spring.xjq.pojo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.LeaveDomeNode;
import com.accp.spring.pojo.LeaveProcessTrack;

public class LeaveProcessVo implements Serializable{
	/**
	 *   //请假流程实例表	LeaveProcess	
	 */
	private static final long serialVersionUID = -2993700745684333325L;
	
	private int leaveId;//请假id
	private int domeId;//模板Id	
	private int stuId;//学员Id	请假人
	private String leaTime;//	申请时间	 
	private String leaReason;//请假原因	 
	private String leaStartTime;//请假开始时间	 
	private String leaEndTime;//请假结束时间	
	private int leaStates;//处理状态①	发起状态1、待审批2、已通过3、已拒绝4、结束5
	private int isDorm;//是否同步到住寝②	否1，是2
	
	private String domeType;//请假类型
	
	private String stuName;
	private String stuPhone;
	private int classId;
	private String cName;
	
	private List<LeaveProcessTrackVo> tracks;
	
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getDomeId() {
		return domeId;
	}
	public void setDomeId(int domeId) {
		this.domeId = domeId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getLeaTime() {
		return leaTime;
	}
	public void setLeaTime(String leaTime) {
		this.leaTime = leaTime;
	}
	public String getLeaReason() {
		return leaReason;
	}
	public void setLeaReason(String leaReason) {
		this.leaReason = leaReason;
	}
	public String getLeaStartTime() {
		return leaStartTime;
	}
	public void setLeaStartTime(String leaStartTime) {
		this.leaStartTime = leaStartTime;
	}
	public String getLeaEndTime() {
		return leaEndTime;
	}
	public void setLeaEndTime(String leaEndTime) {
		this.leaEndTime = leaEndTime;
	}
	public int getLeaStates() {
		return leaStates;
	}
	public void setLeaStates(int leaStates) {
		this.leaStates = leaStates;
	}
	public int getIsDorm() {
		return isDorm;
	}
	public void setIsDorm(int isDorm) {
		this.isDorm = isDorm;
	}
	
	public String getDomeType() {
		return domeType;
	}
	public void setDomeType(String domeType) {
		this.domeType = domeType;
	}
	
	
	public List<LeaveProcessTrackVo> getTracks() {
		return tracks;
	}
	public void setTracks(List<LeaveProcessTrackVo> tracks) {
		this.tracks = tracks;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return cName;
	}
	public void setClassName(String className) {
		this.cName = className;
	}
	@Override
	public String toString() {
		return "LeaveProcessVo [leaveId=" + leaveId + ", domeId=" + domeId + ", stuId=" + stuId + ", leaTime=" + leaTime
				+ ", leaReason=" + leaReason + ", leaStartTime=" + leaStartTime + ", leaEndTime=" + leaEndTime
				+ ", leaStates=" + leaStates + ", isDorm=" + isDorm + ", domeType=" + domeType + ", stuName=" + stuName
				+ ", stuPhone=" + stuPhone + ", classId=" + classId + ", cName=" + cName + ", tracks=" + tracks + "]";
	}


	
	
	
	
	/* 	 
字段	类型	字段描述	备注
leaveId	int	请假id	 
domeId	int	模板Id	
stuId	int	学员Id	请假人
leaTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	申请时间	 
leaReason	Varchar(500)	请假原因	 
leaStartTime	datetime	请假开始时间	 
leaEndTime	datetime	请假结束时间	
leaStates	int	处理状态①	发起状态1、待审批2、已通过3、已拒绝4、结束5
isDorm	int	是否同步到住寝②	否1，是2*/
		
	
}
