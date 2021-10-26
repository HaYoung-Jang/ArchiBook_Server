package com.archibook.main.domain;

public class BookDTO {

	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String date_published;
	private int price_origin;
	private String image_url;
	private String link;
	
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
	public int getPriceOrigin() {
		return price_origin;
	}
	public void setPriceOrigin(int price_origin) {
		this.price_origin = price_origin;
	}
	public String getImageUrl() {
		return image_url;
	}
	public void setImageUrl(String image_url) {
		this.image_url = image_url;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	@Override
	public String toString() {
		return "BookDTO [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", date_published=" + date_published + ", price_origin=" + price_origin + ", image_url=" + image_url
				+ ", link=" + link + "]";
	}
}
