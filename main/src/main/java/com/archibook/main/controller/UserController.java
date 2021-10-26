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

import com.archibook.main.domain.UserDTO;
import com.archibook.main.mapper.UserMapper;


@RestController
@SpringBootApplication
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserMapper userMapper;
	 
	@GetMapping("/list")
	public List<UserDTO> UserList() {
		return userMapper.selectUserList();
	}

	@GetMapping("detail")
	public UserDTO UserDetail(
			@RequestParam(value = "account_id")String account_id) {
		return userMapper.selectUserDatail(account_id);
	}
	
	@GetMapping("nickname")
	public int UserNickName(
			@RequestParam(value = "nick_name")String nick_name) {
		return userMapper.selectUserNickName(nick_name);
	}
	
	@PostMapping("register")
	public int UserInsert(@RequestBody UserDTO params) {
		return userMapper.insertUser(params);
	}
}
