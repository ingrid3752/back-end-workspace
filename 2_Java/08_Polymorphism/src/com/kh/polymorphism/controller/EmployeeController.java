package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {

	private Employee employee = new Employee(); 
	/*
	 * int index = checkId(id);
	mArr[index].setName(name);
	mArr[index].setEmail(email);
	mArr[index].setPwd(pwd);
	 * */
	/*public int checkId(String id) {
		for(int i = 0; i <mArr.length; i++) {
			if(mArr[i] !=null && mArr[i].getId().equals(id)) {
				// 기존 멤버 배열에 아이디가 있는 경우!
				return i;
			}
		}
		// 아이디가 없는 경우
		return -1;
	}*/
//	for(int i = 0; i <name.length(); i++) {
//		if(name[i] !=null && name[i].getName().equals(name)) {
//			return i;
//		}
//	}
//	String index = checkName(name);
	// 이름으로 사람 찾기
	public Employee findEmployeeByName(String name, Employee[] empArr) {
		
		for(int i=0; i < empArr.length; i++) {
			if(empArr[i].getName().equals(name)) {
				return empArr[i];
			}
		}
		
		return null;
	}
	
	// 찾는 사람의 연봉은?
	public int getAnnualsalary(Employee e) {
		if(e instanceof Engineer) { // 특정 자식 객체 찾는 방법!
			Engineer engineer = (Engineer) e; // 부모 -> 자식 : 강제 형 변환!
			return e.getSalary() * 12 + e.getBonus();
			
		}
		return e.getSalary() * 12;
	}
	
	// 전체 사람들의 연봉 총합은?
	public int getTotalSalary(Employee[] empArr) {
		int sum = 0;
		for(Employee employee : empArr) {
			sum += getAnnualSalary(employee);
		}
		return 0;
		
	}

	private int getAnnualSalary(Employee employee2) {
		return 0;
	}
	
	
	
	
	
	
}
