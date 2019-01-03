package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Course implements Serializable{
	private int courseId;
	private String courseName;
	private int bookId;
}
