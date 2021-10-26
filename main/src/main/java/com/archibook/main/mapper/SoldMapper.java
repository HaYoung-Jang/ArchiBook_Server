package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.archibook.main.domain.SoldDTO;

@Mapper
public interface SoldMapper {

	public int insertSold(SoldDTO params);
	public List<SoldDTO> selectSoldList(String account_id);
}
