package com.kh.inheritance;

import com.kh.inheritance.child.SmartPhone;

public class Application {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("애플", "app-01", "맥북 프로 16", 3400000, "M3");
		
		System.out.println(notebook);
		
		SmartPhone smartPhone = new SmartPhone("삼성", "sam-02", "갤럭시 S24 울트라", 
												1500000, "SKT");
		System.out.println(smartPhone);
	}

}
