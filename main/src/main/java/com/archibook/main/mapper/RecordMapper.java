package com.archibook.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.archibook.main.domain.RecordDTO;

@Mapper
public interface RecordMapper {

	public int insertRecord(RecordDTO params);
	public RecordDTO selectRecordDetail(int recordId);
	public int updateRecordPublic(RecordDTO params);
	public int updateRecordPrivate(RecordDTO params);
	public int deleteRecord(@Param("record_id")int recordId, @Param("account_id")String accountId);
	public List<RecordDTO> selectRecordList();
	public List<RecordDTO> selectRecordPersonal(String accounId);
}
