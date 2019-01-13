package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable{
	private int stuId;
	private String stuName;
	private String stuUserName;
	private String stuPwd;
	private int classId;
	private int stuSex;
	private String stuBirth;
	private String stuImage;
	private String stuPhone;
	private int stuType;
	private int stuJob;
	private String stuStartTime;
	private String stuEndTime;
	private String stuIDnumber;
	private String stuAddress;
	private String cId;
}
