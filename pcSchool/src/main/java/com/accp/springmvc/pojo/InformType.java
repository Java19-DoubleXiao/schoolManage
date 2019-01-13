package com.accp.springmvc.pojo;

public class InformType {

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
	
	
}
