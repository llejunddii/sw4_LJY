package com.ljy.service;


import com.ljy.dao.LJYVO;

public interface LJYService {
	
	// 등록 서비스
	void insert(LJYVO vo);
	
	// 조회 서비스
	String checkNow(String code);

}
