package com.accp.springmvc.pojo;

public class WorkFiles {

	private int id;
	private int workId;
	private String workFile;
	private String fileName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public String getWorkFile() {
		return workFile;
	}
	public void setWorkFile(String workFile) {
		this.workFile = workFile;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "WorkFiles [id=" + id + ", workId=" + workId + ", workFile=" + workFile + ", fileName=" + fileName + "]";
	}
	
	
}
