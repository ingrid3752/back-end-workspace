package com.kh.test3;

public class Overloading {
	
	public void test() {} // 원인1 : 매개변수 없음
	public void test(String str) {} // 원인2 : 타입이 같음
	public void test(int i) {} // 원인3 : 매개변수 개수가 같음
	//public void test(String s) {} // 원인2 : 타입이 같음
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i,String str) {}
	//private void test(int i) {} // 원인3 : 매개변수 개수가 같음
	//public int test() {return 0;} // 원인1 : 매개변수 없음
	
}
