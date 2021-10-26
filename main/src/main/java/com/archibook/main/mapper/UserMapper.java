package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.UserDTO;

@Mapper
public interface UserMapper {

	public int insertUser(UserDTO params);
	public UserDTO selectUserDatail(String accountId);
	public List<UserDTO> selectUserList();
	public int selectUserNickName(String nickName);
}
