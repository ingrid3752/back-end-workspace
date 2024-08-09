package com.kh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 원인1 : nextInt = 문자열을 입력받는데 스캐너로 받는 형식이 Int(숫자)를 입력받는 값이다
		 * 원인2 : length () = 미작성 length를 지정하는데 ()가 빠져있다
		 * 원인3 : while(false) false는 while문이 돌아가지않는다.
		 * 원인4 : continue; -> break; = continue는 반복문이 끝나지않는다.
		 * 원인5 : equals 미삽입 = 자바에서는 == 대신 .equals로 ("")가 될경우 break로 빠져나가도록한다.
		 * */
		
//		while(true) { // 원인3 : while(false)
//		System.out.print("문자열을 입력해주세요 : ");
//		String str = sc.nextLine(); // 원인1 : nextInt
//		if(str.equals("exit")) { // 원인5 : equals 미삽입
//			break; // 원인4 : continue; -> break; 
//		} else {
//			System.out.println(str.length() + "글자 입니다."); // 원인2 : length () 미작성
//		}
//	}
//
//	System.out.println("프로그램을 종료합니다.");
		
//		while(true) {
//			System.out.print("문자열을 입력해주세요 : ");
//			String str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				System.out.println(str.length() + "글자 입니다");
//			}
//		}
//		
//		System.out.println("프로그램을 종료합니다");
//		
//		while(true) {
//			System.out.print("문자열을 입력해주세요 : ");
//			String str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				System.out.println(str.length() + "글자 입니다");
//			}
//		}
//		
//		System.out.println("프로그램을 종료합니다");
		
//		while(true) {
//			System.out.println("문자열을 입력해주세요 : ");
//			String str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				System.out.println(str.length() + "글자 입니다");
//			}
//		}
//		while(true) {
//			System.out.print("문자열을 입력해주세요");
//			String str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				System.out.println(str.length() + "글자입니다");
//			}
//		}
		
//		while(true) {
//			System.out.println("문자열을 입력해주세요 : ");
//			String str =sc.nextLine();
//			
//			if(str.equals("exit")) {
//				break;
//			} else {
//				System.out.println(str.length() + "글자 입니다.");
//			}
//		}
		
//		while(true) {
//			System.out.println("문자열을 입력해주세요 : ");
//			String str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				System.out.println(str.length() + "글자 입니다.");
//			}
//		}
		
		while(true) {
			System.out.println("문자열을 입력하세요 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자 입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
