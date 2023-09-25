package com.ljy.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class LJYMapperTest {
	
	@Autowired
	private LJYMapper ljy;
	
	@Test
	public void testcheck() {
		log.info("select문 테스트 !!!!!!!!!");
		ljy.check().forEach(x->log.info(x));;
	}
	
	@Test
	public void testinsert() {
		log.info("데이터 등록 테스트 !!!!!!!!!!!!!");
		LJYVO vo = new LJYVO();
		vo.setCode("A08");
		vo.setPname("나는3테스트");
		vo.setCost(123);
		vo.setJnum(157);
		vo.setSale(1422);
		vo.setPnum(0001234);
		vo.setGcode("A");
		ljy.insert(vo);
		log.info(vo.getPname());
		
	}
	
	@Test
	public void testupdate() {
		log.info("수정 테스트!!@!@@@@");
		LJYVO vo = new LJYVO();
		vo.setCode("A05");
		vo.setJnum(111111);
		vo.setCost(111111);
		vo.setPnum(111111);
		vo.setPname("수정작업!");
		vo.setSale(111111);
		log.info("수정된 자료 @@" +ljy.update(vo));
		
		
	}
	
	@Test
	public void testdelete() {
		log.info("삭제 테스트!!");
		LJYVO vo = new LJYVO();
		vo.setCode("A11");
	}

}
