package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	public static void main(String[] args) {
		VariablePractice variable = new VariablePractice();
		
		variable.method1();
		variable.method2();
		variable.method3();
		variable.method4();
		variable.method5();
		variable.method6();
		variable.method7();
	}

	private Scanner sc;
	
	/*
	 * 영화관의 요금표는 다음과 같다.
	 *  - 성인 : 10000원
	 *  - 청소년 : 7000원
	 * 
	 * 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	 * */
	public void method1() {
		int a = 10000;
		int t = 7000;
		int sum1 = (a * 2) + (t * 3);
		
		System.out.println(sum1);
		
		System.out.println("-------------------");
	}
	
	/*
	 * x=5, y=7, z=9의 값을 직접 변경하지 않고 변수를 사용하여
	 * 
	 * x=7
	 * y=9
	 * z=5
	 * 
	 * 로 출력하세요.
	 * */
	public void method2() {
		int x = 5; // 7
		int y = 7; // 9
		int z = 9; // 5
		int change = x; // change 변수에 x값 저장
		x = y; // 저장한 x값을 y값으로 변환
		y = z; // y값을 z값으로 변환 
		z = change; // z값을 change 변수값에 저장 
		
		
		// 코드 적어주세요!
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		System.out.println("-------------------");
	}

	/*
	 * 정수 두 개를 입력 받아 두 수의 합(+), 차(-), 곱(*), 나누기(/)한 몫을 출력하세요.
	 * 
	 * 첫 번째 정수 : 23
	 * 두 번째 정수 : 7
	 * 더하기 : 30
	 * 빼기 : 16
	 * 곱하기 : 161
	 * 나누기 몫 : 3
	 * */
	public void method3() {
		int d1 = 23;
		int d2 = 7;
		
		int sum2 = d1 + d2;
		int min1 = d1 - d2;
		int mul1 = d1 * d2;
		int div1 = d1 / d2;
		
		System.out.printf("더하기 : %d\n"
						+ "빼기 : %d\n"
						+ "곱하기 : %d\n"
						+ "나누기 : %d\n",sum2, min1, mul1, div1);
		
		System.out.println("-------------------");
	}

	/*
	 * 키보드로 가로, 세로 값을 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	 * 공식) 면적 : 가로 * 세로
	 *       둘레 : (가로 + 세로) * 2
	 * 
	 * 가로 : 13.5 width
	 * 세로 : 41.7 height
	 * 면적 : 562.95 area
	 * 둘레 : 110.4 Round
	 * */ 
	public void method4() {
		double width = 13.5;
		double height = 41.7;
		double area = width * height;
		double round = (width + height) * 2;
		
		System.out.printf("면적 : %.2f\n" + "둘레 : %.1f\n",area, round);
		
		System.out.println("-------------------");
		
		
	}

	/*
	 * 영어 문자열 값을 입력 받아 문자에서 첫번째, 두번째, 마지막 글자(문자열.length())를 출력하세요.
	 * 
	 * 문자열을 입력하세요 : apple
	 * 첫번째 문자 : a
	 * 두번째 문자 : p
	 * 마지막 문자 : e
	 * */
	public void method5() {
		
	}

	/*
	 * 문자 하나를 입력 받아 그 문자와 다음 문자의 유니코드를 출력하세요.
	 * 
	 * 문자 : A
	 * A unicode : 65
	 * B unicode : 66
	 * */
	public void method6() {

	}
	
	/*
	 * 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	 * 
	 * 국어 : 75
	 * 영어 : 63
	 * 수학 : 80
	 * 총점 : 218
	 * 평균 : 72.67
	 * */
	public void method7() {

	}

}
