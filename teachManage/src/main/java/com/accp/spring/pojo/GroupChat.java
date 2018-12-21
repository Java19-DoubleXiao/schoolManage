package com.accp.spring.pojo;

import java.io.Serializable;

public class GroupChat implements Serializable{
	
	/**
	 *  // 群聊表	GroupChat	
	 */
	private static final long serialVersionUID = 585140461880477669L;
	private int groupId;//
	private String groupName;//群组名	 
	private int ownerId;//群主Id	 班主任
	private String groupTime;//建立时间	
	private int classId;//班级Id
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getGroupTime() {
		return groupTime;
	}
	public void setGroupTime(String groupTime) {
		this.groupTime = groupTime;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "GroupChat [groupId=" + groupId + ", groupName=" + groupName + ", ownerId=" + ownerId + ", groupTime="
				+ groupTime + ", classId=" + classId + "]";
	}

	
	
	
	/**
	 * 群聊表	GroupChat	 	 
字段	类型	字段描述	备注
groupId	int	群组Id	  主键、自增
groupName	Varchar(100)	群组名	 
ownerId	int	群主Id	 班主任
groupTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	建立时间	 
classId		int	班级Id	
	 */

}
