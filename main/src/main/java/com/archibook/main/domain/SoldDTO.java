package com.archibook.main.domain;

public class SoldDTO {

	private int sold_id;
	private int registerd_id;
	private String buyer_id;
	private String nick_name;
	
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
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	
	@Override
	public String toString() {
		return "SoldDTO [sold_id=" + sold_id + ", registerd_id=" + registerd_id + ", buyer_id=" + buyer_id
				+ ", nick_name=" + nick_name + "]";
	}
}
