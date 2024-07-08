package com.kh.example.practice3.controller;

import com.kh.example.practice3.model.Employee;

public class EmployeeController {

	private Employee employee = new Employee();
	
	// 오버로딩!!
	
	/*
	 *  + add(empNo:int, name:String, gender:char, phone:String) : void
		+ add(empNo:int, name:String, gender:char, phone:String, dept:String, salary:int, bonus:double) : void
		+ modify(phone:String):void
		+ modify(salary:int):void
		+ modify(bonus:double):void
		+ info() : Employee
	 * */

	// 메서드명이 똑같더라도 변수개수가 다르거나 타입이 다르면 사용가능 = 오버로딩 (add - 개수가 다름, modify - 타입이 다름)
	
	public void add(int empNo, String name, char gender, String phone) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
	}
	// 데이터를 저장하는 메소드
	// add - setter 추가
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
	}
	// 정보를 수정하는 메소드
	// modify - setter 추가
	public void modify(String phone) {
		employee.setPhone(phone);
	}
	
	public void modify(int salary) {
		employee.setSalary(salary);
	}
	
	public void modify(double bonus) {
		employee.setBonus(bonus);
	}
	
	// 데이터 정보 메소드
	public Employee info() {
		return employee;
	}
}
