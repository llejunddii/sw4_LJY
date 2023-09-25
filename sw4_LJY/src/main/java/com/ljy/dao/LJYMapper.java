package com.ljy.dao;

import java.util.List;

public interface LJYMapper {
	
	// 데이터 보여주기
	List<LJYVO> check();
	
	// 데이터 넣어주기
	void insert(LJYVO vo);
	
	// 제품 수정
	int update(LJYVO vo);

	
}
