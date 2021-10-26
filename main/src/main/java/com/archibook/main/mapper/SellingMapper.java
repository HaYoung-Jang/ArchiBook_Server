package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.archibook.main.domain.SellingDTO;

@Mapper
public interface SellingMapper {

	public int insertSelling(SellingDTO params);
	public SellingDTO selectSellingDetail(int registerdId);
	public int updateSelling(SellingDTO params);
	public int deleteSelling(@Param("registerd_id")int registerdId, @Param("account_id")String accountId);
	public List<SellingDTO> selectSellingAll();
	public List<SellingDTO> selectSellingList();
	public List<SellingDTO> selectSellingPersonal(String accountId);
}
