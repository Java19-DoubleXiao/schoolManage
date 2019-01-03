package com.accp.springmvc.pojo;

public class Book {

	private int bookId;
	private String bookName;
	private int gId;
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", gId=" + gId + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	
}
