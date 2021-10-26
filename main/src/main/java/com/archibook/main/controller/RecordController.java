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

import com.archibook.main.domain.RecordDTO;
import com.archibook.main.mapper.RecordMapper;

@RestController
@SpringBootApplication
@RequestMapping("/record")
public class RecordController {

	@Autowired
	private RecordMapper recordMapper;
	
	@GetMapping("/list")
	public List<RecordDTO> RecordList() {
		return recordMapper.selectRecordList();
	}
	
	@GetMapping("/personal")
	public List<RecordDTO> RecordPersonal(
			@RequestParam(value = "account_id")String account_id) {
		return recordMapper.selectRecordPersonal(account_id);
	}
	
	@GetMapping("/detail")
	public RecordDTO RecordDetail(
			@RequestParam(value = "record_id")int record_id) {
		return recordMapper.selectRecordDetail(record_id);
	}
	
	@PostMapping("/register")
	public int RecordInsert(@RequestBody RecordDTO params) {
		return recordMapper.insertRecord(params);
	}
	
	@PutMapping("/public")
	public int RecordUpdatePublic(@RequestBody RecordDTO params) {
		return recordMapper.updateRecordPublic(params);
	}
	
	@PutMapping("/private")
	public int RecordUpdatePrivate(@RequestBody RecordDTO params) {
		return recordMapper.updateRecordPrivate(params);
	}
	
	@DeleteMapping("delete")
	public int RecordDelete(
			@RequestParam(value = "record_id") int record_id
			, @RequestParam(value = "account_id") String account_id) {
		return recordMapper.deleteRecord(record_id, account_id);
	}
}
