package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.ChatDTO;

@Mapper
public interface ChatMapper {

	public int insertChat(ChatDTO params);
	public ChatDTO selectChatDetail(int chatId);
	public List<ChatDTO> selectChatList(String accountId);
}
