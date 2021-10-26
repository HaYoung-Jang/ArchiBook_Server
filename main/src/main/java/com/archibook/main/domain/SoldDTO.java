package com.archibook.main.domain;

public class SoldDTO {

	private int sold_id;
	private int registerd_id;
	private String buyer_id;
	
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
	
	@Override
	public String toString() {
		return "SoldDTO [sold_id=" + sold_id + ", registerd_id=" + registerd_id + ", buyer_id=" + buyer_id + "]";
	}
		
}
