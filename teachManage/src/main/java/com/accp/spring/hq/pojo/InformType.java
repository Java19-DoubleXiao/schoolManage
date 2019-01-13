package com.accp.spring.hq.pojo;

import java.io.Serializable;

public class InformType implements Serializable{
	
	
	/**
	 *  //通知类型表	informType	 
	 */
	private static final long serialVersionUID = 5483842390590717812L;
	private int typeId;
	private String informType;
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getInformType() {
		return informType;
	}
	public void setInformType(String informType) {
		this.informType = informType;
	}
	@Override
	public String toString() {
		return "InformType [typeId=" + typeId + ", informType=" + informType + "]";
	}
	
	
	
	/**
	 * 通知类型表	informType	 	 
字段	数据类型	字段描述	备注
typeId	int	Id	 
informType	Varchar（100）	通知类型	①
	 */
}
