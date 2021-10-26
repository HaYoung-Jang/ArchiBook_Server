package com.archibook.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.archibook.main.domain.BookDTO;
import com.archibook.main.mapper.BookMapper;

@RestController
@SpringBootApplication
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookMapper bookMapper;
	
	@GetMapping("/list")
	public List<BookDTO> BookList() {
		return bookMapper.selectBookList();
	}
	
	@GetMapping("/detail")
	public BookDTO BookDetail(
			@RequestParam(value = "isbn")String isbn) {
		return bookMapper.selectBookDetail(isbn);
	}
	
	@PostMapping("/register")
	public int BookInsert(@RequestBody BookDTO params) {
		return bookMapper.insertBook(params);
	}
}
