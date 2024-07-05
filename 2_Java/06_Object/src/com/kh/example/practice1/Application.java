package com.kh.example.practice1;

import com.kh.example.practice1.model.Member;

public class Application {

	public static void main(String[] args) {
		Member member = new Member();
		member.changeName("주준영"); // String으로 생성
		member.printName();
	}

}
