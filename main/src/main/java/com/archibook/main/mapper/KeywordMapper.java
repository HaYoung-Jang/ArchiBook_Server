package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.KeywordDTO;

@Mapper
public interface KeywordMapper {

	public int insertKeyword(KeywordDTO params);
	public List<KeywordDTO> selectKeywordSame(String keyword, String isbn);
	public List<KeywordDTO> selectKeywordList(String isbn);
	public List<KeywordDTO> selectKeywordSearch(String keyword);
	public int selectKeywordCount(String isbn);
	
}
