package com.archibook.main.domain;

public class RecordDTO {
	
	private int record_id;
	private String account_id;
	private String isbn;
	private String date_started;
	private String date_finished;
	private String date_writing;
	private int book_score;
	private String content;
	private boolean is_public;
	private String title;
	private String author;
	private String publisher;
	private String image_url;
	private String nick_name;
	private String profile_color;
	
	public int getRecordId() {
		return record_id;
	}
	public void setRecordId(int record_id) {
		this.record_id = record_id;
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
	public String getDateStarted() {
		return date_started;
	}
	public void setDateStarted(String date_started) {
		this.date_started = date_started;
	}
	public String getDateFinished() {
		return date_finished;
	}
	public void setDateFinished(String date_finished) {
		this.date_finished = date_finished;
	}
	public String getDateWriting() {
		return date_writing;
	}
	public void setDateWriting(String date_writing) {
		this.date_writing = date_writing;
	}
	public int getBookScore() {
		return book_score;
	}
	public void setBookScore(int book_score) {
		this.book_score = book_score;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean getIsPublic() {
		return is_public;
	}
	public void setIsPublic(boolean is_public) {
		this.is_public = is_public;
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
	public String getImageUrl() {
		return image_url;
	}
	public void setImageUrl(String image_url) {
		this.image_url = image_url;
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
	public void setProfileColor(String prifile_color) {
		this.profile_color = prifile_color;
	}
	@Override
	public String toString() {
		return "RecordDTO [record_id=" + record_id + ", account_id=" + account_id + ", isbn=" + isbn + ", date_started="
				+ date_started + ", date_finished=" + date_finished + ", date_writing=" + date_writing + ", book_score="
				+ book_score + ", content=" + content + ", is_public=" + is_public + ", title=" + title + ", author="
				+ author + ", publisher=" + publisher + ", image_url=" + image_url + ", nick_name=" + nick_name
				+ ", profile_color=" + profile_color + "]";
	}
	
	
}
