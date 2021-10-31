package com.archibook.main.domain;

public class KeywordDTO {

	private int keyword_id;
	private String keyword;
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String date_published;
	private String image_url;
	
	public int getKeywordId() {
		return keyword_id;
	}
	public void setKeywordId(int keyword_id) {
		this.keyword_id = keyword_id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDatePublished() {
		return date_published;
	}
	public void setDatePublished(String date_published) {
		this.date_published = date_published;
	}
	public String getImageUrl() {
		return image_url;
	}
	public void setImageUrl(String image_url) {
		this.image_url = image_url;
	}
	
	@Override
	public String toString() {
		return "KeywordDTO [keyword_id=" + keyword_id + ", keyword=" + keyword + ", isbn=" + isbn + ", title=" + title
				+ ", author=" + author + ", publisher=" + publisher + ", date_published=" + date_published
				+ ", image_url=" + image_url + "]";
	}
}
