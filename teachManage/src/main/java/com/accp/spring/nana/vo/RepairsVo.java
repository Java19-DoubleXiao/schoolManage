package com.accp.spring.nana.vo;

import java.io.Serializable;

public class RepairsVo implements Serializable{

	private static final long serialVersionUID = 3006463309769296258L;

	private String stuName;//学生ming
	private String cName; //班级名字
	private String dormNum;//寝室号码
	private String bedNum;//床位号码
	private String stuPhone;//学生电话
	private String repairItem;//报修物品
	private String remark;//报修备注
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getDormNum() {
		return dormNum;
	}
	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	public String getBedNum() {
		return bedNum;
	}
	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getRepairItem() {
		return repairItem;
	}
	public void setRepairItem(String repairItem) {
		this.repairItem = repairItem;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "RepairsVo [stuName=" + stuName + ", cName=" + cName + ", dormNum=" + dormNum + ", bedNum=" + bedNum
				+ ", stuPhone=" + stuPhone + ", repairItem=" + repairItem + ", remark=" + remark + "]";
	}
	
	
	
}
