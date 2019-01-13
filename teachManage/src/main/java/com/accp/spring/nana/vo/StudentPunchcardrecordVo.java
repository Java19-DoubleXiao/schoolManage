package com.accp.spring.nana.vo;

public class StudentPunchcardrecordVo {
	private int id;
	private int stuId;//'学员id'
	private int  classId;//'班级Id'
	private String csTime;//'进班时间'
	private int isChange;//'是否转班(1未转，2已转)'
	private String stuName;//学生姓名
	private String cName;//班级名称
	private String stuImage;//学生头像
	private String stuType;//学生职位
	
	private String punchTime;//打卡时间
	private int states;//考勤状态
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getCsTime() {
		return csTime;
	}
	public void setCsTime(String csTime) {
		this.csTime = csTime;
	}
	public int getIsChange() {
		return isChange;
	}
	public void setIsChange(int isChange) {
		this.isChange = isChange;
	}
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
	public String getStuImage() {
		return stuImage;
	}
	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}
	public String getStuType() {
		return stuType;
	}
	public void setStuType(String stuType) {
		this.stuType = stuType;
	}
	public String getPunchTime() {
		return punchTime;
	}
	public void setPunchTime(String punchTime) {
		this.punchTime = punchTime;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "StudentPunchcardrecordVo [id=" + id + ", stuId=" + stuId + ", classId=" + classId + ", csTime=" + csTime
				+ ", isChange=" + isChange + ", stuName=" + stuName + ", cName=" + cName + ", stuImage=" + stuImage
				+ ", stuType=" + stuType + ", punchTime=" + punchTime + ", states=" + states + "]";
	}
	
	
}
