package com.accp.springmvc.pojo;

public class InformFiles {

	private int id;
	private int informId;
	private String informFile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInformId() {
		return informId;
	}
	public void setInformId(int informId) {
		this.informId = informId;
	}
	public String getInformFile() {
		return informFile;
	}
	public void setInformFile(String informFile) {
		this.informFile = informFile;
	}
	@Override
	public String toString() {
		return "InformFiles [id=" + id + ", informId=" + informId + ", informFile=" + informFile + "]";
	}
	
	
}
