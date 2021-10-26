package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.RecommendDTO;

@Mapper
public interface RecommendMapper {

	public int insertRecommend(RecommendDTO params);
	public List<RecommendDTO> selectRecommendList(String account_id);
}
