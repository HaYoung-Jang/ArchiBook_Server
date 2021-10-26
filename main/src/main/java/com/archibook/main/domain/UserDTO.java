package com.archibook.main.domain;

public class UserDTO {

	private int member_id;
	private String account_id;
	private String name;
	private String nick_name;
	private String email;
	private int book_num;
	private String profile_color;
	
	public int getMemberId() {
		return member_id;
	}
	public void setMemberId(int member_id) {
		this.member_id = member_id;
	}
	public String getAccountId() {
		return account_id;
	}
	public void setAccountId(String account_id) {
		this.account_id = account_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nick_name;
	}
	public void setNickName(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBookNum() {
		return book_num;
	}
	public void setBookNum(int book_num) {
		this.book_num = book_num;
	}
	public String getProfileColor() {
		return profile_color;
	}
	public void setProfileColor(String profile_color) {
		this.profile_color = profile_color;
	}
	
	@Override
	public String toString() {
		return "UserDTO [member_id=" + member_id + ", account_id=" + account_id + ", name=" + name + ", nick_name="
				+ nick_name + ", email=" + email + ", book_num=" + book_num + ", profile_color=" + profile_color + "]";
	}
	
}
