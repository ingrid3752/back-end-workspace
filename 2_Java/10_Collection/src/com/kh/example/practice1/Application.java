package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Application {
//	public void method1() {
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
//		System.out.print("["+ lotto[i] + "]");
//		}
//		Set<Integer> set2 = new TreeSet<Integer>();
//		set2.add(4);
//		set2.add(28);
//		set2.add(35);
//		set2.add(39);
//		set2.add(44);
//		set2.add(45);
//		Set<Integer> set = new TreeSet<Integer>();
//		int n = 0;
//		for(int i=0; set.size() < 6; i++) {
//			Random ran = new Random();
//			int number = ran.nextInt(45);
//			set.add(new Integer(number));
//		}
//		System.out.println("로또 번호 : " + set2);
//		System.out.println("내 번호 : " + set);
//		
//		
//	}
//	Application a = new Application();
//	a.method1();
	public static void main(String[] args) {
		

		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		// 기존 로또 번호는 6개, 보너스 번호가 필요해서 1개 더 추가!
		while(lotto.size() < 7){
	
		int num = (int) (Math.random() * 45 + 1);
		if(!lotto.contains(num)) {
			lotto.add(num);
		}
		
	  }
	  
	  // 0 ~ 6까지 범위 지정해서 로또 번호 6개 따로, 보너스 번호 따로!
	  List<Integer> lottoList = lotto.subList(0, 6);
	  int bonus = lotto.get(6);
	
		
		int count = 0;
		
		while(true) {
			
			count++;
			
			ArrayList<Integer> myLotto = new ArrayList<>();
			
			while(myLotto.size() < 6) {
				int num = (int) (Math.random() * 45 + 1);
				if(!myLotto.contains(num)) {
					myLotto.add(num);
				}
			}
			
			System.out.println("로또 번호 : " + lottoList);
			System.out.println("내 번호 : " + myLotto);
			
			Collections.sort(lottoList);
			Collections.sort(myLotto);
			
			// 멈추는 조건! 로또 번호와 내 번호가 정확히 일치! 1등 당첨!
			if(lottoList.equals(myLotto)) {
				System.out.println("1등 당첨!횟수 : " + count);
				break;
			}
			
			int match = 0;
			
			for(Integer num : lottoList) {
				if(myLotto.contains(num)) {
					match++;
				}
			}
			
			if(match == 5) {
				if(myLotto.contains(bonus)) {
					System.out.println("2등 당첨! 보너스 번호 : " + bonus + ", 횟수 : " + count);
					break;
				} else {
					System.out.println("3등 당첨! 횟수 : " + count);
					break;
				}
			} else if(match == 4) {
				System.out.println("4등 당첨! 횟수 : " + count);
				break;
			} else if(match == 3) {
				System.out.println("5등 당첨! 횟수 : " + count);
				break;
			}
			
		}
	}

}
