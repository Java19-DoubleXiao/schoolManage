package com.accp.springmvc.pojo;

public class Student {
		private int stuId;
		private String stuName;
		private String stuUserName;
		private String stuPwd;
		private int classId;
		private int stuSex;
		private String stubirth;
		private String stuImage;
		private String stuPhone;
		private int stuTyp;
		private String stuStartTime;
		private String stuEndTime;
		private String stuIdnumber;
		private String stuAddress;
		private int cId;
		public int getStuId() {
			return stuId;
		}
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public String getStuUserName() {
			return stuUserName;
		}
		public void setStuUserName(String stuUserName) {
			this.stuUserName = stuUserName;
		}
		public String getStuPwd() {
			return stuPwd;
		}
		public void setStuPwd(String stuPwd) {
			this.stuPwd = stuPwd;
		}
		public int getClassId() {
			return classId;
		}
		public void setClassId(int classId) {
			this.classId = classId;
		}
		public int getStuSex() {
			return stuSex;
		}
		public void setStuSex(int stuSex) {
			this.stuSex = stuSex;
		}
		public String getStubirth() {
			return stubirth;
		}
		public void setStubirth(String stubirth) {
			this.stubirth = stubirth;
		}
		public String getStuImage() {
			return stuImage;
		}
		public void setStuImage(String stuImage) {
			this.stuImage = stuImage;
		}
		public String getStuPhone() {
			return stuPhone;
		}
		public void setStuPhone(String stuPhone) {
			this.stuPhone = stuPhone;
		}
		public int getStuTyp() {
			return stuTyp;
		}
		public void setStuTyp(int stuTyp) {
			this.stuTyp = stuTyp;
		}
		public String getStuStartTime() {
			return stuStartTime;
		}
		public void setStuStartTime(String stuStartTime) {
			this.stuStartTime = stuStartTime;
		}
		public String getStuEndTime() {
			return stuEndTime;
		}
		public void setStuEndTime(String stuEndTime) {
			this.stuEndTime = stuEndTime;
		}
		public String getStuIdnumber() {
			return stuIdnumber;
		}
		public void setStuIdnumber(String stuIdnumber) {
			this.stuIdnumber = stuIdnumber;
		}
		public String getStuAddress() {
			return stuAddress;
		}
		public void setStuAddress(String stuAddress) {
			this.stuAddress = stuAddress;
		}
		public int getcId() {
			return cId;
		}
		public void setcId(int cId) {
			this.cId = cId;
		}
		@Override
		public String toString() {
			return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuUserName=" + stuUserName + ", stuPwd="
					+ stuPwd + ", classId=" + classId + ", stuSex=" + stuSex + ", stubirth=" + stubirth + ", stuImage="
					+ stuImage + ", stuPhone=" + stuPhone + ", stuTyp=" + stuTyp + ", stuStartTime=" + stuStartTime
					+ ", stuEndTime=" + stuEndTime + ", stuIdnumber=" + stuIdnumber + ", stuAddress=" + stuAddress
					+ ", cId=" + cId + "]";
		}
		
		
}
