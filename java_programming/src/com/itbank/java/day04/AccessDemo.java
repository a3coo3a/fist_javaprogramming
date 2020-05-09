package com.itbank.java.day04;
// 접근 제어자 사용 이유
// - 어플리케이션 : 은행, 사용자 정보 : 금고
// - 
class A{
	public String y() {		// public : 누구든지 클래스의 메소드를 호출해서 사용 가능
		return "public vold y()";
	}
	
	private String z() {	// private :  내부적으로는 사용할 수 있지만, 외부 클래스는 사용 불가능
		return "public vold z()";	
	}
	
	public String x() {		// x()와 z()는 같은 클래스 이기에 private 접근 가능
		return z();
	}
}
public class AccessDemo {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z());	// private 키워드 때문에 에러
		System.out.println(a.x());
	}
}
