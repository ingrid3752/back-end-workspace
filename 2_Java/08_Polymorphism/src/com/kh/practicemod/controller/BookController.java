package com.kh.practicemod.controller;

import com.kh.practice.model.Book;
import com.kh.practice.model.Member;

public class BookController {
    private Member member = new Member();
    int count = 0;
    
    public BookController(Member member) {
        this.member = member;
    }

    public String rentBook(Book book) {
        Book[] bookList = member.getBookList();

        for (int i = 0; i < bookList.length; i++) {
        	
            if (bookList[i] != null && bookList[i].getTitle().equals(book.getTitle())) {
                return "이미 대여한 책입니다.";
            }

            if (member.getAge() < book.getAccessAge()) {
                return "나이 제한으로 대여 불가능입니다.";
            }

            if (bookList[i] == null) {
                bookList[i] = book;
                count++;
                member.setCoupon(member.getCoupon() + (book.isCoupon() ? 1 : 0));
                return "성공적으로 대여되었습니다.";
            }
        }
        return "더이상 대여할 수 없습니다.";
    }

    public Member getMember() {
        return member;
    }
}
