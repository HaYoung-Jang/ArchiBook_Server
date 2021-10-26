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

import com.archibook.main.domain.SoldDTO;
import com.archibook.main.mapper.SoldMapper;

@RestController
@SpringBootApplication
@RequestMapping("/sold")
public class SoldController {
	
	@Autowired
	private SoldMapper soldMapper;
	
	@GetMapping("/list")
	public List<SoldDTO> SoldList(
			@RequestParam String account_id) {
		return soldMapper.selectSoldList(account_id);
	}
	
	@PostMapping("/register")
	public int SoldInsert(@RequestBody SoldDTO params) {
		return soldMapper.insertSold(params);
	}
}
