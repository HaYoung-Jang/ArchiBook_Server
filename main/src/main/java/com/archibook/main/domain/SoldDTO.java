package com.archibook.main.domain;

public class SoldDTO {

	private int sold_id;
	private int registerd_id;
	private String buyer_id;
	private String nick_name;
	private String profile_color;
	private String isbn;
	private String title;
	
	public int getSoldId() {
		return sold_id;
	}
	public void setSoldId(int sold_id) {
		this.sold_id = sold_id;
	}
	public int getRegisterdId() {
		return registerd_id;
	}
	public void setRegisterdId(int registerd_id) {
		this.registerd_id = registerd_id;
	}
	public String getBuyerId() {
		return buyer_id;
	}
	public void setBuyerId(String buyer_id) {
		this.buyer_id = buyer_id;
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
	
	@Override
	public String toString() {
		return "SoldDTO [sold_id=" + sold_id + ", registerd_id=" + registerd_id + ", buyer_id=" + buyer_id
				+ ", nick_name=" + nick_name + ", profile_color=" + profile_color + ", isbn=" + isbn + ", title="
				+ title + "]";
	}
}
