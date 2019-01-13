package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Classes implements Serializable {
	private int classId;
	private String cName;
	private int gId;
}

