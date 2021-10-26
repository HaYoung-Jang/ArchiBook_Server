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

import com.archibook.main.domain.KeywordDTO;
import com.archibook.main.mapper.KeywordMapper;

@RestController
@SpringBootApplication
@RequestMapping("/keyword")
public class KeywordController {

	@Autowired
	private KeywordMapper keywordMapper;
	
	@GetMapping("/list")
	public List<KeywordDTO> KeywordList(
			@RequestParam(value = "isbn") String isbn) {
		return keywordMapper.selectKeywordList(isbn);
	}
	
	@GetMapping("/same")
	public List<KeywordDTO> keywordSame(
			@RequestParam(value = "keyword") String keyword
			, @RequestParam(value = "isbn") String isbn) {
		return keywordMapper.selectKeywordSame(keyword, isbn);
	}
	
	@GetMapping("/count")
	public int KeywordCount(
			@RequestParam(value = "isbn") String isbn) {
		return keywordMapper.selectKeywordCount(isbn);
	}
	
	@PostMapping("/register")
	public int KeywordInsert(@RequestBody KeywordDTO params) {
		return keywordMapper.insertKeyword(params);
	}
}
