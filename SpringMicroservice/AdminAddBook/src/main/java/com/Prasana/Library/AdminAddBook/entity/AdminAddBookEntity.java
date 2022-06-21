package com.Prasana.Library.AdminAddBook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="book")
public class AdminAddBookEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookId; 
	private String bookName;
	private String authorName;
	private String publicationName;
	private String rackNumber;
	private String available;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublicationName() {
		return publicationName;
	}
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	public String getRackNumber() {
		return rackNumber;
	}
	public void setRackNumber(String rackNumber) {
		this.rackNumber = rackNumber;
	}
	
	
public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
}
