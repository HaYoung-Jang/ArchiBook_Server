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

import com.archibook.main.domain.ChatDTO;
import com.archibook.main.domain.KeywordDTO;
import com.archibook.main.mapper.ChatMapper;

@RestController
@SpringBootApplication
@RequestMapping("/chat")
public class ChatController {
	
	@Autowired
	private ChatMapper chatMapper;
	
	@GetMapping("/list")
	public List<ChatDTO> ChatList(
			@RequestParam(value = "account_id") String account_id) {
		return chatMapper.selectChatList(account_id);
	}
	
	@GetMapping("/detail")
	public ChatDTO ChatDetail(
			@RequestParam(value = "chat_id") int chat_id) {
		return chatMapper.selectChatDetail(chat_id);
	}
	
	@GetMapping("/sold")
	public List<ChatDTO> ChatSold(
			@RequestParam(value = "registerd_id") int registerd_id
			, @RequestParam(value = "account_id") String account_id) {
		return chatMapper.selectChatSold(registerd_id, account_id);
	}
	
	@PostMapping("/register")
	public int ChatInsert(@RequestBody ChatDTO params) {
		return chatMapper.insertChat(params);
	}
}
