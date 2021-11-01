package com.archibook.main.domain;

public class ChatDTO {

	private int chat_id;
	private String seller_id;
	private String buyer_id;
	private int registerd_id;
	private String room_name;
	private String date_last;
	private String time_last;
	private String seller_nick_name;
	private String buyer_nick_name;
	private String seller_profile_color;
	private String buyer_profile_color;
	
	public int getChatId() {
		return chat_id;
	}
	public void setChatId(int chat_id) {
		this.chat_id = chat_id;
	}
	public String getSellerId() {
		return seller_id;
	}
	public void setSellerId(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getBuyerId() {
		return buyer_id;
	}
	public void setBuyerId(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public int getRegisterdId() {
		return registerd_id;
	}
	public void setRegisterdId(int registerd_id) {
		this.registerd_id = registerd_id;
	}
	public String getRoomName() {
		return room_name;
	}
	public void setRoomName(String room_name) {
		this.room_name = room_name;
	}
	public String getDateLast() {
		return date_last;
	}
	public void setDateLast(String date_last) {
		this.date_last = date_last;
	}
	public String getTimeLast() {
		return time_last;
	}
	public void setTimeLast(String time_last) {
		this.time_last = time_last;
	}
	public String getSeller_nick_name() {
		return seller_nick_name;
	}
	public void setSeller_nick_name(String seller_nick_name) {
		this.seller_nick_name = seller_nick_name;
	}
	public String getBuyer_nick_name() {
		return buyer_nick_name;
	}
	public void setBuyer_nick_name(String buyer_nick_name) {
		this.buyer_nick_name = buyer_nick_name;
	}
	public String getSeller_profile_color() {
		return seller_profile_color;
	}
	public void setSeller_profile_color(String seller_profile_color) {
		this.seller_profile_color = seller_profile_color;
	}
	public String getBuyer_profile_color() {
		return buyer_profile_color;
	}
	public void setBuyer_profile_color(String buyer_profile_color) {
		this.buyer_profile_color = buyer_profile_color;
	}
	
	@Override
	public String toString() {
		return "ChatDTO [chat_id=" + chat_id + ", seller_id=" + seller_id + ", buyer_id=" + buyer_id + ", registerd_id="
				+ registerd_id + ", room_name=" + room_name + ", date_last=" + date_last + ", time_last=" + time_last
				+ ", seller_nick_name=" + seller_nick_name + ", buyer_nick_name=" + buyer_nick_name
				+ ", seller_profile_color=" + seller_profile_color + ", buyer_profile_color=" + buyer_profile_color
				+ "]";
	}
}
