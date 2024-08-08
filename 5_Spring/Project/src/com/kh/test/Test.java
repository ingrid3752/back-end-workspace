package com.kh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 원인3 : while(false)
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine(); // 원인1 : nextInt
			if(str.equals("exit")) { // 원인5 : equals 미삽입
				break; // 원인4 : continue; -> break; 
			} else {
				System.out.println(str.length() + "글자 입니다."); // 원인2 : length () 미작성
			}
		}

		System.out.println("프로그램을 종료합니다.");
	}

}
