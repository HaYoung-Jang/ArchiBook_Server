package com.archibook.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.archibook.main.domain.BookDTO;
import com.archibook.main.domain.KeywordDTO;
import com.archibook.main.domain.RecommendDTO;
import com.archibook.main.domain.RecordDTO;
import com.archibook.main.domain.SellingDTO;
import com.archibook.main.domain.SoldDTO;
import com.archibook.main.domain.UserDTO;
import com.archibook.main.mapper.BookMapper;
import com.archibook.main.mapper.KeywordMapper;
import com.archibook.main.mapper.RecommendMapper;
import com.archibook.main.mapper.RecordMapper;
import com.archibook.main.mapper.SellingMapper;
import com.archibook.main.mapper.SoldMapper;
import com.archibook.main.mapper.UserMapper;

@SpringBootTest
class MapperTests {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private SellingMapper sellingMapper;
	
	@Autowired
	private RecordMapper recordMapper;
	
	@Autowired
	private KeywordMapper keywordMapper;
	
	@Autowired
	private RecommendMapper recommendMapper;
	
	@Autowired
	private SoldMapper soldMapper;
	
	@Test
	public void testOfInsert() {
		UserDTO params = new UserDTO();
		params.setAccountId("ii11");
		params.setName("ii");
		params.setNickName("ii");
		params.setEmail("ii@naver.com");
		params.setProfileColor("yellow");
		
		int result = userMapper.insertUser(params);
		
		System.out.println("결과는 " + result + "입니다.");
	}
	
	@Test
	public void testofBookInsert() {
		BookDTO params = new BookDTO();
		params.setIsbn("9788937479953");
		params.setTitle("보건교사 안은영");
		params.setAuthor("지은이: 정세랑");
		params.setPublisher("민음사");
		params.setDatePublished("20200911");
		params.setPriceOrigin(14000);
		params.setImageUrl("http://seoji.nl.go.kr/fu/ecip/dbfiles/CIP_FILES_TBL/2020/08/27/9788937479953.jpg");
		
		int result = bookMapper.insertBook(params);
		
		System.out.println("결과는 " + result + "입니다.");
	}
	
	@Test
	public void testOfSellingInsert() {
		SellingDTO params = new SellingDTO();
		params.setIsbn("9788983927620");
		params.setAccountId("ii11");
		params.setPriceRegisterd(5000);
		params.setImagePath("-");
		params.setDescribeDetail("새 책입니다.");
		params.setDateRegisterd("20211016");
		
		int result = sellingMapper.insertSelling(params);
		
		System.out.println("결과는" + result + "입니다.");
	}
	
	@Test
	public void testOfRecordInsert() {
		RecordDTO params = new RecordDTO();
		params.setAccountId("wkd");
		params.setIsbn("9788954681629");
		params.setDateStarted("20210907");
		params.setDateFinished("20211006");
		params.setDateWriting("20211013");
		params.setBookScore(5);
		params.setContent("아무래도 시대와 배경이 익숙하지 않아 읽는데 오래걸렸지만 18,19 세기 영국 여성의 결혼관 등에 대해 알 수 있었다.");
		params.setIsPublic(true);
		
		int result = recordMapper.insertRecord(params);
		
		System.out.println("결과는" + result + "입니다.");
	}
	
	@Test
	public void testOfKeywordInsert() {
		KeywordDTO params = new KeywordDTO();
		params.setKeyword("사연");
		params.setIsbn("9788936434540");
		
		int result = keywordMapper.insertKeyword(params);
		
		System.out.println("결과는" + result + "입니다.");
	}
	
	@Test
	public void testOfRecommendInsert() {
		RecommendDTO params = new RecommendDTO();
		params.setAccountId("wkd");
		params.setIsbn("9788937479953");
		
		int result = recommendMapper.insertRecommend(params);
		
		System.out.println("결과는" + result + "입니다.");
	}
	
	@Test
	public void testOfSoldInsert() {
		SoldDTO params = new SoldDTO();
		params.setRegisterdId(1);
		params.setBuyerId("kk123");
		
		int result = soldMapper.insertSold(params);
		
		System.out.println("결과는" + result + "입니다.");
	}
}
