package com.itbank.java.day03;
/* 오버로딩의 제약조건
 * - 메소드명, 매개변수(데이터타입,갯수,순서)는 동일하고 리턴타입만 다르다면 
 * 			-> 둘중 어떤 것을 호출해야 할지 모름 / 오류발생
 * - 
 * 
 * 
 * 
 * */

public class OverloadingDemo2 {
	public void A() {
		System.out.println("void A()");
	}
	public void A(int num) {
		System.out.println("void A(int num)");
	}
	public void A(String str) {
		System.out.println("void A(String str)");
	}

	/*public String A(String str) {
		return str;
	}*/
	public void B() {
		System.out.println("void B()");
	}
	public int B(int b) {
		return b;
	}
	public static void main(String[] args) {
		OverloadingDemo2 o = new OverloadingDemo2();
		o.A();
		o.A(2);
		o.A("Hello");
				
		
	}

}
