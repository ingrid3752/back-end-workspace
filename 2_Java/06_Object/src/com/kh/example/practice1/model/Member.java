package com.kh.example.practice1.model;

public class Member {

	/*
	 * - private
	 * id(String), pwd(String), name(String), age(int), gender(char), phone(String)
	 * email(String)
	 * - public 
	 * Member() Static
	 * changeName(name:String):void
	 * printName():void
	 * */
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void changeName(String name) {
		this.name = name; // this는 생략이 가능하나 변수와 같은 name이기때문에 this로 나눠서 지정
	}
	
	public void printName() {
		System.out.println(name);
	}
}
