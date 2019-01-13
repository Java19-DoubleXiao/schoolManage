package com.accp.spring.pojo;

import java.io.Serializable;

public class ChatRecord implements Serializable{
	
	/**
	 *   //聊天记录表	chatRecord	
	 */
	private static final long serialVersionUID = 8108242503482148802L;
	private int crId;//
	private int sendId;//发送人Id	
	private int beSendId;//接收人Id	
	private String message;//消息内容
	private String messageFile;//	文件图片消息	 文件路径or图片路径
	private String crTime;//发送时间
	private int isRead;//对方是否已读	已读1，未读2
	private int isRemove;//是否撤回	未撤回1，已撤回2（在两分钟之内撤回）
	private int sendType;//发送人类型	学生1，家长2，老师3
	private int beSendType;//发送人类型	学生1，家长2，老师3
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

	
	
	/**
	 * 聊天记录表	chatRecord	 	 
字段	类型	字段描述	备注
crId	int	Id	 主键、自增
sendId	int	发送人Id	 
beSendId	int	接收人Id	 
message	Varchar(500)	消息内容	
messageFile	Varchar(500)	文件图片消息	 文件路径or图片路径
crTime	DATETIME NULL DEFAULT CURRENT_TIMESTAMP	发送时间	 
isRead	int	对方是否已读	已读1，未读2
isRemove	int	是否撤回	未撤回1，已撤回2（在两分钟之内撤回）
sendType	int	发送人类型	学生1，家长2，老师3
beSendType	int	发送人类型	学生1，家长2，老师3
	 */
}
