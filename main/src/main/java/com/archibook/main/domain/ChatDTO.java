package com.archibook.main.domain;

public class ChatDTO {

	private int chat_id;
	private String seller_id;
	private String buyer_id;
	private int registerd_id;
	private String room_name;
	private String date_last;
	private String time_last;
	private String seller_nick;
	private String buyer_nick;
	private String seller_profile;
	private String buyer_profile;
	
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
	public String getSellerNick() {
		return seller_nick;
	}
	public void setSellerNick(String seller_nick) {
		this.seller_nick = seller_nick;
	}
	public String getBuyerNick() {
		return buyer_nick;
	}
	public void setBuyerNick(String buyer_nick) {
		this.buyer_nick = buyer_nick;
	}
	public String getSellerProfile() {
		return seller_profile;
	}
	public void setSellerProfile(String seller_profile) {
		this.seller_profile = seller_profile;
	}
	public String getBuyerProfile() {
		return buyer_profile;
	}
	public void setBuyerProfile(String buyer_profile) {
		this.buyer_profile = buyer_profile;
	}
	
	@Override
	public String toString() {
		return "ChatDTO [chat_id=" + chat_id + ", seller_id=" + seller_id + ", buyer_id=" + buyer_id + ", registerd_id="
				+ registerd_id + ", room_name=" + room_name + ", date_last=" + date_last + ", time_last=" + time_last
				+ ", seller_nick=" + seller_nick + ", buyer_nick=" + buyer_nick + ", seller_profile=" + seller_profile
				+ ", buyer_profile=" + buyer_profile + "]";
	}
}
