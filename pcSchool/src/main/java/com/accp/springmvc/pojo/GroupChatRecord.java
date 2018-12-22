package com.accp.springmvc.pojo;

public class GroupChatRecord {

	private int id;
	private int sendId;
	private int groupId;
	private String message;
	private String messageFile;
	private String time;
	private int isRemove;
	private int sendType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSendId() {
		return sendId;
	}
	public void setSendId(int sendId) {
		this.sendId = sendId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageFile() {
		return messageFile;
	}
	public void setMessageFile(String messageFile) {
		this.messageFile = messageFile;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getIsRemove() {
		return isRemove;
	}
	public void setIsRemove(int isRemove) {
		this.isRemove = isRemove;
	}
	public int getSendType() {
		return sendType;
	}
	public void setSendType(int sendType) {
		this.sendType = sendType;
	}
	@Override
	public String toString() {
		return "GroupChatRecord [id=" + id + ", sendId=" + sendId + ", groupId=" + groupId + ", message=" + message
				+ ", messageFile=" + messageFile + ", time=" + time + ", isRemove=" + isRemove + ", sendType="
				+ sendType + "]";
	}
	
	
}
