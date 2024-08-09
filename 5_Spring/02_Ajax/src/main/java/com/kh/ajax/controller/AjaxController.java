package com.kh.ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.ajax.model.vo.Member;
import com.kh.ajax.service.MemberService;

@Controller
public class AjaxController {
	
	private int count = 0;
	
	@Autowired
	private MemberService service;
	
	@ResponseBody
	@GetMapping("/count")
	public int count() {
		System.out.println("ajax로 요청이 들어옴");
		return ++count;
	}
	
	@ResponseBody
	@GetMapping("/encoding")
	public String encoding(String nickname) {
		System.out.println("encoding!" + nickname);
		return nickname;
	}
	
	// /check로 id 값 넘겨서 결과값(boolean)을 받아서
	@ResponseBody
	@PostMapping("/check")
	public boolean check(String id) {
		//아이디가 있으면 ID 사용 불가, 없으면 ID 사용 가능
		Member member = service.idCheck(id);
		if(member != null) {
			System.out.println("ID 사용 불가");
			return true;
		} else {
			System.out.println("ID 사용 가능");
			return false;
		}
	}
	@ResponseBody
	@PostMapping("/serial")
	public Member serial(Member member) {
		System.out.println(member);
		service.register(member);
		return member;
	}
	
	
	
}
