package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Book implements Serializable{
	private int bookid;
	private String bookName;
	private int gId;
}