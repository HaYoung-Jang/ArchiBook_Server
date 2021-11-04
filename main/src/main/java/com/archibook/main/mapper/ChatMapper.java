package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.ChatDTO;

@Mapper
public interface ChatMapper {

	public int insertChat(ChatDTO params);
	public ChatDTO selectChatDetail(String chatId);
	public List<ChatDTO> selectChatList(String accountId);
	public List<ChatDTO> selectChatSold(int registerd_id, String account_id);
}
