package com.ljy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ljy.dao.LJYVO;
import com.ljy.service.LJYService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/back/**")
@AllArgsConstructor
public class LJYController {
	
	private LJYService service;
	
	// 메인 화면
	@GetMapping("view")
	public String veiw1() {
		log.info("veiw1 겟매핑 호출@@@@");
		return "back/view1";
		
	}
	
	// 입력 화면
	@GetMapping("view2")
	public void view2() {
		log.info("입력화면 호출@@@@");
		
	}
	
	// 입력화면 포스트 요청 
	@PostMapping("view2")
	public void view2_1(LJYVO vo) {
		log.info("입력화면 URL post요청!!!!!!!!!"+vo);
		service.insert(vo);
		
	}
	
	
	

}
