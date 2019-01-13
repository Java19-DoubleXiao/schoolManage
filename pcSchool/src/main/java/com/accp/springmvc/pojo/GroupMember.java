package com.accp.springmvc.pojo;

public class GroupMember {

	private int memId;
	private int groupId;
	private int userId;
	private int userType;
	private int noReadMesCount;
	private String chatTime;
	public int getMemId() {
		return memId;
	}
	public void setMemId(int memId) {
		this.memId = memId;
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
		return "GroupMember [memId=" + memId + ", groupId=" + groupId + ", userId=" + userId + ", userType=" + userType
				+ ", noReadMesCount=" + noReadMesCount + ", chatTime=" + chatTime + "]";
	}
	
	
}

