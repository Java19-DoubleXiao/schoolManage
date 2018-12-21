package com.accp.spring.pojo;

import java.io.Serializable;

public class GroupMember implements Serializable{
	
	/**
	 *   // 群成员表	groupMember	 
	 */
	private static final long serialVersionUID = -7223319117126026551L;
	private int memid;//
	private int groupId;//
	private int userId;//
	private int userType;//成员类型	学生1，家长2，老师3
	private int noReadMesCount;//未查看消息数量
	private String chatTime;//每次点进群聊时间
	public int getMemid() {
		return memid;
	}
	public void setMemid(int memid) {
		this.memid = memid;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getNoReadMesCount() {
		return noReadMesCount;
	}
	public void setNoReadMesCount(int noReadMesCount) {
		this.noReadMesCount = noReadMesCount;
	}
	public String getChatTime() {
		return chatTime;
	}
	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}
	@Override
	public String toString() {
		return "GroupMember [memid=" + memid + ", groupId=" + groupId + ", userId=" + userId + ", userType=" + userType
				+ ", noReadMesCount=" + noReadMesCount + ", chatTime=" + chatTime + "]";
	}
	
	
	
	
	/**
	 * 群成员表	groupMember	 	 
字段	类型	字段描述	备注
memId	int	Id	  主键、自增
groupId	int	群组Id	 
userId	int	成员Id	学员Id、家长Id、班主任Id、教员Id
userType	int	成员类型	学生1，家长2，老师3
noReadMesCount	int	未查看消息数量	①
chatTime	datetime	每次点进群聊时间	
	 */

}
