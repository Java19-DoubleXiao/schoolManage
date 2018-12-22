package com.accp.springmvc.pojo;

public class GroupChat {

	private int groupId;
	private String groupName;
	private int ownerId;
	private String groupTime;
	private int classId;
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
	
	
}
