package com.ljy.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class LJYMapperTest {
	
	@Test
	public void list() {
		log.info("select문 테스트 !!!!!!!!! 겸 데이터 다뽑기!!!!!!");
	}

}
