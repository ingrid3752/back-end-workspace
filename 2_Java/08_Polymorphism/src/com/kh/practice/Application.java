package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.model.Book;
import com.kh.practice.model.Member;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	Member member = new Member();
	Book[] books = {new Book("밥을 지어요", true, 0),
			        new Book("오늘은 아무래도 덮밥", false, 0),
			        new Book("원피스 108", false, 15),
			        new Book("귀멸의 칼날 23", false, 19)};
	
	public static void main(String[] args) {
		Application app = new Application();
		app.menu();
	}

	public void menu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		member.setName(name);
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		member.setAge(age);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 대여하기");
			System.out.println("3. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int number = Integer.parseInt(sc.nextLine());
			
			if(number == 1) {
				System.out.println(member);
			} else if(number == 2) {
				for(int i = 0; i < books.length; i++) {
					System.out.println((i+1) + "번 도서 : " + books[i]);
				}
				System.out.print("대여할 도서 번호 선택 : ");
				int select = Integer.parseInt(sc.nextLine());
				// select(index+1) 번호에 따라서 해당 책이 Member - bookList에 추가
				member.getBookList()[0] = books[select-1];
				// 성공적으로 대여되었습니다. (완료되었을때 출력)
				// 이미 대여한 책입니다. (위에서 한번 실행되었던걸 다시 실행했을때 출력되게 조건문 작성)
				// 나이 제한으로 대여 불가능입니다. (처음에 받은 나이 정보와 accessAge를 비교하여 age < accessAge일때 출력)
				// 더 이상 대여할 수 없습니다. (Member값에 Book값을 최대2번저장)
				// 프로그램 종료하기  case 3 check = false; break;
			}
			
		}
		
		
		
	}
	
}
