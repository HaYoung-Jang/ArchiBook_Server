package com.archibook.main.domain;

public class ChatDTO {

	private int chat_id;
	private String seller_id;
	private String buyer_id;
	private int registerd_id;
	private String room_name;
	private String date_last;
	private String time_last;
	
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
	
	
}
