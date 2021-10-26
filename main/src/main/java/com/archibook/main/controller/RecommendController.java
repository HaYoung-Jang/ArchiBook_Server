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

import com.archibook.main.domain.RecommendDTO;
import com.archibook.main.mapper.RecommendMapper;

@RestController
@SpringBootApplication
@RequestMapping("/recommend")
public class RecommendController {

	@Autowired
	private RecommendMapper recommendMapper;
	
	@GetMapping("/list")
	public List<RecommendDTO> RecommendList(
			@RequestParam String account_id) {
		return recommendMapper.selectRecommendList(account_id);
	}
	
	@PostMapping("/register")
	public int RecommendInsert(@RequestBody RecommendDTO params) {
		return recommendMapper.insertRecommend(params);
	}
}
