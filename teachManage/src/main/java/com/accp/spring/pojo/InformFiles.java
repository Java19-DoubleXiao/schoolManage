package com.accp.spring.pojo;

import java.io.Serializable;

public class InformFiles implements Serializable{
	
	
	/**
	 *  // 通知附录表	InformFiles	 
	 */
	private static final long serialVersionUID = -8882329397196326070L;
	private int id;
	private int informId; //通知Id	关联通知表通知Id
	private String informFile; //附录 附加文件路径
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
	
	
	
	/**
	 * 通知附录表	InformFiles	 	 
字段	类型	字段描述	备注
id	int	Id	 
informId	int	通知Id	关联通知表通知Id
informFile	Varchar(500)	附录	附加文件路径
	 */
}
