package com.archibook.main.domain;

public class RecommendDTO {

	private int recommend_id;
	private String account_id;
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String date_published;
	private String image_url;
	
	public int getRecommendId() {
		return recommend_id;
	}
	public void setRecommendId(int recommend_id) {
		this.recommend_id = recommend_id;
	}
	public String getAccountId() {
		return account_id;
	}
	public void setAccountId(String account_id) {
		this.account_id = account_id;
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
		return "RecommendDTO [recommend_id=" + recommend_id + ", account_id=" + account_id + ", isbn=" + isbn
				+ ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", date_published="
				+ date_published + ", image_url=" + image_url + "]";
	}
	
}
