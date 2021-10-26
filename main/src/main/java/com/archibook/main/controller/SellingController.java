package com.archibook.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.archibook.main.domain.SellingDTO;
import com.archibook.main.mapper.SellingMapper;

@RestController
@SpringBootApplication
@RequestMapping("/selling")
public class SellingController {

	@Autowired
	private SellingMapper sellingMapper;
	
	@GetMapping("/all")
	public List<SellingDTO> SellingAll() {
		return sellingMapper.selectSellingAll();
	}
	
	@GetMapping("/list")
	public List<SellingDTO> SellingList() {
		return sellingMapper.selectSellingList();
	}
	
	@GetMapping("/personal")
	public List<SellingDTO> SellingPersonal(
			@RequestParam(value = "account_id")String account_id) {
		return sellingMapper.selectSellingPersonal(account_id);
	}
	
	@GetMapping("/detail")
	public SellingDTO SellingDetail(
			@RequestParam(value = "registerd_id")int registerd_id) {
		return sellingMapper.selectSellingDetail(registerd_id);
	}
	
	@PostMapping("/register")
	public int SellingInsert(@RequestBody SellingDTO params) {
		return sellingMapper.insertSelling(params);
	}
	
	@PutMapping("/sold")
	public int SellingUpdate(@RequestBody SellingDTO params) {
		return sellingMapper.updateSelling(params);
	}
	
	@DeleteMapping("/delete")
	public int SellingDelete(
			@RequestParam(value = "registerd_id")int registerd_id
			, @RequestParam(value = "account_id")String account_id) {
		return sellingMapper.deleteSelling(registerd_id, account_id);
	}
}
