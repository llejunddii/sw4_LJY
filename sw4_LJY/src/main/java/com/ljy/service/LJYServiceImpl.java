package com.ljy.service;

import org.springframework.stereotype.Service;

import com.ljy.dao.LJYMapper;
import com.ljy.dao.LJYVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class LJYServiceImpl implements LJYService{

	private LJYMapper mapper;
	
	@Override
	public void insert(LJYVO vo) {
		log.info("등록 서비스 요청!!!!!"+vo);
		mapper.insert(vo);
		
	}

}
