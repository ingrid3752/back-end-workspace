package com.kh.example.practice1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Application {
	public void method1() {
		// 로또 
		// 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 출력
//		Random random = new Random();
//		int[] lottoNumber = new int[6];
//		
//		for(int i = 0; i < 6; i++) {
//			int number = random.nextInt(45)*1;
//			for(int j = 0; j < i; j++) {
//				if(lottoNumber[j] == number) {
//					number = random.nextInt(45) + 1;
//					j = -1;
//				}
//			}
//			lottoNumber[i] = number;
//		}
//		
//		System.out.println("내 번호 : ");
//		for(int number : lottoNumber) {
//			System.out.println("[" + number + "]");
//		}
//		Set<String> set = new HashSet<>();
//		
//		set.add("4");
//		set.add("28");
//		set.add("35");
//		set.add("39");
//		set.add("44");
//		set.add("45");
//		System.out.println("로또 번호 : " + set);
//		int lotto[] = new int [6];
//		System.out.println("내 번호 : ");
//		for(int i = 0; i < lotto.length; i++) {
//			int num = (int)(Math.random() * 45) + 1;
//			lotto[i] = num;
//			for(int j = 0; j < i; j++) {
//				if(lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//			System.out.print("["+ lotto[i] + "]");
//		}
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(4);
		set2.add(28);
		set2.add(35);
		set2.add(39);
		set2.add(44);
		set2.add(45);
		Set<Integer> set = new TreeSet<Integer>();
		int n = 0;
		for(int i=0; set.size() < 6; i++) {
			Random ran = new Random();
			int number = ran.nextInt(45);
			set.add(new Integer(number));
		}
		System.out.println("로또 번호 : " + set2);
		System.out.println("내 번호 : " + set);
		
		
	}

	public static void main(String[] args) {
		
		Application a = new Application();
		a.method1();
	}

}
