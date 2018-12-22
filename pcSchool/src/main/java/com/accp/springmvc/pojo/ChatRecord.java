package com.accp.springmvc.pojo;

public class ChatRecord {

	private int crId;
	private int sendId;
	private int beSendId;
	private String message;
	private String messageFile;
	private String crTime;
	private int isRead;
	private int isRemove;
	private int sendType;
	private int beSendType;
	public int getCrId() {
		return crId;
	}
	public void setCrId(int crId) {
		this.crId = crId;
	}
	public int getSendId() {
		return sendId;
	}
	public void setSendId(int sendId) {
		this.sendId = sendId;
	}
	public int getBeSendId() {
		return beSendId;
	}
	public void setBeSendId(int beSendId) {
		this.beSendId = beSendId;
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
	public String getCrTime() {
		return crTime;
	}
	public void setCrTime(String crTime) {
		this.crTime = crTime;
	}
	public int getIsRead() {
		return isRead;
	}
	public void setIsRead(int isRead) {
		this.isRead = isRead;
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
	public int getBeSendType() {
		return beSendType;
	}
	public void setBeSendType(int beSendType) {
		this.beSendType = beSendType;
	}
	@Override
	public String toString() {
		return "ChatRecord [crId=" + crId + ", sendId=" + sendId + ", beSendId=" + beSendId + ", message=" + message
				+ ", messageFile=" + messageFile + ", crTime=" + crTime + ", isRead=" + isRead + ", isRemove="
				+ isRemove + ", sendType=" + sendType + ", beSendType=" + beSendType + "]";
	}
	
	
}
