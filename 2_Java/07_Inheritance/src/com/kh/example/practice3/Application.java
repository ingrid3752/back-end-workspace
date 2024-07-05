package com.kh.example.practice3;

import java.util.Scanner;

import com.kh.example.practice3.controller.EmployeeController;
import com.kh.example.practice3.model.Employee;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		EmployeeController c = new EmployeeController();
		
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");
		int num1 = sc.nextInt();
	    System.out.print("사원 번호 : ");
	    int num2 = sc.nextInt();
	    System.out.print("사원 이름 : ");
	    String name = sc.nextLine();
	    System.out.print("사원 성별 : ");
	    char gender = sc.nextLine().charAt(0);
	    System.out.print("전화 번호  : ");
	    
	}

}
