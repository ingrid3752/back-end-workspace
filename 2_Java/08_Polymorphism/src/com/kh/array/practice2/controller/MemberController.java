package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	/* 완전 자유롭게! */
	private Member member = new Member();
	private Member[] mArr = new Member[3];
	public int count = 0;

	/*private String id;
	private String name;
	private String pwd;
	private String email;
	private char gender;
	private int age;
	+ add(id:String, name:String, pwd: String,email:String, char:gender,age:int) : void*/
	
	/*
	public void add(String id, String pwd, String email, char gender, int age) {
		member.setId(id);
		member.setPwd(pwd);
		member.setEmail(email);
		member.setGender(gender);
		member.setAge(age);
	}
	
	public void modify1(String id) {
		member.setId(id);
	}
	
	public void modify2(String name) {
		member.setName(name);
	}
	
	public void modify3(String email) {
		member.setEmail(email);
	}
	
	public void modify4(String pwd) {
		member.setPwd(pwd);
	}
	
	public Member info() {
		return member;
	}
	*/
	
	// 멤버 추가
	public void insertMember(Member m) {
		mArr[count++] = new Member(m.getId(), m.getName(), m.getPwd(),
				m.getEmail(), m.getGender(), m.getAge());
		
	}
	// 멤버 아이디 검색 -> 멤버 index를 아이디로 조회 
	public int checkId(String id) {
		for(int i = 0; i <mArr.length; i++) {
			if(mArr[i] !=null && mArr[i].getId().equals(id)) {
				// 기존 멤버 배열에 아이디가 있는 경우!
				return i;
			}
		}
		// 아이디가 없는 경우
		return -1;
	}
	
	public void updateMember(String id, String name, String email, String pwd) {
		// 멤버의 index 찾기!
		int index = checkId(id);
		mArr[index].setName(name);
		mArr[index].setEmail(email);
		mArr[index].setPwd(pwd);
	}
	
	// 멤버 조회 
	public Member[] printAll() {
		return mArr;
	}
}
