package com.archibook.main.domain;

public class KeywordDTO {

	private int keyword_id;
	private String keyword;
	private String isbn;
	private String title;
	
	public int getKeywordId() {
		return keyword_id;
	}
	public void setKeywordId(int keyword_id) {
		this.keyword_id = keyword_id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
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
		return "KeywordDTO [keyword_id=" + keyword_id + ", keyword=" + keyword + ", isbn=" + isbn + ", title=" + title
				+ "]";
	}
	
}
