package com.ljy.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ljy.dao.LJYMapper;
import com.ljy.dao.LJYVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class LJYServiceTests {
	
	@Autowired
	private LJYService lm;
	
	@Test
	public void testInsert() {
		LJYVO vo = new LJYVO();
		vo.setCode("A10");
		vo.setPname("나는3테스트");
		vo.setCost(123);
		vo.setJnum(157);
		vo.setSale(1422);
		vo.setPnum(0001234);
		vo.setGcode("A");
		lm.insert(vo);
	}
}
