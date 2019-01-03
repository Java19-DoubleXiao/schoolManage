package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	private int userId;
	private String name;
	private String password;
	private String image;
}
