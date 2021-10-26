package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.BookDTO;

@Mapper
public interface BookMapper {

	public int insertBook(BookDTO params);
	public BookDTO selectBookDetail(String isbn);
	public List<BookDTO> selectBookList();
}
