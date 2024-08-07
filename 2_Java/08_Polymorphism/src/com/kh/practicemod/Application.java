package com.kh.practicemod;

import java.util.Scanner;

import com.kh.practice.controller.BookController;
import com.kh.practice.model.Book;
import com.kh.practice.model.Member;

public class Application {
    Scanner sc = new Scanner(System.in);
    Member member = new Member();
    Book[] books = {
        new Book("밥을 지어요", true, 0),
        new Book("오늘은 아무래도 덮밥", false, 0),
        new Book("원피스 108", false, 15),
        new Book("귀멸의 칼날 23", false, 19)
    };
    BookController bc = new BookController();

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
        
        boolean close = true;
        while (close) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 대여하기");
            System.out.println("3. 프로그램 종료하기");
            System.out.print("메뉴 번호 : ");
            int number = Integer.parseInt(sc.nextLine());

            switch (number) {
                case 1:
                    // System.out.println(bc.getMember()); controller에서 getMember지정했는데..
                    break;

                case 2:
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + "번 도서 : " + books[i]);
                    }
                    System.out.print("대여할 도서 번호 선택 : ");
                    int select = Integer.parseInt(sc.nextLine());

                    if (select < 1 || select > books.length) {
                        System.out.println("잘못된 도서 번호입니다.");
                        
                    } else {
                        String result = bc.rentBook(books[select - 1]);
                        System.out.println(result);
                    }
                    break;

                case 3:
                    close = false;
                    break;
            }
        }
    }
}
