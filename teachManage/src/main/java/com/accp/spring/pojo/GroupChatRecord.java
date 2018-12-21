package com.accp.spring.pojo;

import java.io.Serializable;

public class GroupChatRecord implements Serializable{
	
	/**
	 *   //群组聊天记录表	GroupChatRecord	 
	 */
	private static final long serialVersionUID = 6755653545548786767L;
	private int id;
	private int sendId;//发送人Id	
	private int groupId;//群组Id 	 
	private String message;//消息内容	
	private String messageFile;//文件图片消息	 文件路径or图片路径
	private String time;//发送时间
	private int isRemove;//是否撤回	未撤回1，已撤回2（在两分钟之内撤回）	
	private int sendType;//发送人类型	学生1，家长2，老师3	
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
	
	
	
	/**
	 * 群组聊天记录表	GroupChatRecord	 	 
字段	类型	字段描述	备注
id	int	Id	  主键、自增
sendId	int	发送人Id	 
groupId	int	群组Id 	 
message	Varchar(500)	消息内容	
messageFile	Varchar(500)	文件图片消息	 文件路径or图片路径
time	DATETIME NULL DEFAULT CURRENT_TIMESTAMP 	发送时间	 
isRemove	int	是否撤回	未撤回1，已撤回2（在两分钟之内撤回）
sendType	int	发送人类型	学生1，家长2，老师3
	 */

}
