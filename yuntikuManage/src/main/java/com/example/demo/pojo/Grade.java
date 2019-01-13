package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Grade implements Serializable {
	private int gid;
	private String gName;
}

