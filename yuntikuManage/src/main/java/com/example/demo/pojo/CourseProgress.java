package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CourseProgress implements Serializable{
	private int cpId;
	private int stuId;
	private int courseId;
	private double percent;
	private int progressCount;
}