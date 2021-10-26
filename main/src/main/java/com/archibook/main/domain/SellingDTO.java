package com.archibook.main.domain;

public class SellingDTO {

	private int registerd_id;
	private String isbn;
	private String account_id;
	private int price_registerd;
	private boolean is_sold;
	private String image_path;
	private String describe_detail;
	private String date_registerd;
	private String nick_name;
	private String profile_color;
	private String title;
	private String author;
	private String publisher;
	private String date_published;
	private String price_origin;
	
	public int getRegisterdId() {
		return registerd_id;
	}
	public void setRegisterdId(int registerd_id) {
		this.registerd_id = registerd_id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAccountId() {
		return account_id;
	}
	public void setAccountId(String account_id) {
		this.account_id = account_id;
	}
	public int getPriceRegisterd() {
		return price_registerd;
	}
	public void setPriceRegisterd(int price_registerd) {
		this.price_registerd = price_registerd;
	}
	public boolean isIsSold() {
		return is_sold;
	}
	public void setIsSold(boolean is_sold) {
		this.is_sold = is_sold;
	}
	public String getImagePath() {
		return image_path;
	}
	public void setImagePath(String image_path) {
		this.image_path = image_path;
	}
	public String getDescribeDetail() {
		return describe_detail;
	}
	public void setDescribeDetail(String describe_detail) {
		this.describe_detail = describe_detail;
	}
	public String getDateRegisterd() {
		return date_registerd;
	}
	public void setDateRegisterd(String date_registerd) {
		this.date_registerd = date_registerd;
	}
	public String getNickName() {
		return nick_name;
	}
	public void setNickName(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getProfileColor() {
		return profile_color;
	}
	public void setProfileColor(String profile_color) {
		this.profile_color = profile_color;
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
	public String getPriceOrigin() {
		return price_origin;
	}
	public void setPriceOrigin(String price_origin) {
		this.price_origin = price_origin;
	}
	
	@Override
	public String toString() {
		return "SellingDTO [registerd_id=" + registerd_id + ", isbn=" + isbn + ", account_id=" + account_id
				+ ", price_registerd=" + price_registerd + ", is_sold=" + is_sold + ", image_path=" + image_path
				+ ", describe_detail=" + describe_detail + ", date_registerd=" + date_registerd + ", nick_name="
				+ nick_name + ", profile_color=" + profile_color + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", date_published=" + date_published + ", price_origin=" + price_origin
				+ "]";
	}
	
}
