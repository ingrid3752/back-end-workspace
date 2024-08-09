package com.kh.test4;

import java.util.ArrayList;
import java.util.List;

import com.kh.test4.model.Fruit;

public class Application {

	public static void main(String[] args) {
		
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		list.add(new Fruit("바나나", "노랑")); // 원인1 : 타입에 맞춰서 작성
		
		// 반복문인 for문으로 일괄출력
//		for(int i = 0; i < list.size(); i++) { // 원인2 : list에 맞춰 length가 아닌 size 사용
//			System.out.println(list.get(i).getName()); // 원인3 : [i]는 배열의 형식이기때문에 .get(i) 뒤에 .getName()이 붙는다.
//		}
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName());
//		}
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName());
//		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
