package com.itbank.java.interfaces;

// 다형성 (polymorphism)
// - 하나의 메소드가 클래스에 있을 때 이것들이 다양한 방법으로 동작하는 것
// - 메소드는 동일하나 그 요청을 받는 구현클래스에 따라서 동작방식이 달라지는 것
//   ex) 움직이다 -> 새 라면, 날아가는 형태 / 동물이라면, 뛰어가는 형태
// - 가장 쉬운 예제가 오버로딩
// - 같은 메소드이지만 매개변수의 형식에 따라서 다른 로직 실행 가능

class D{	// 오버 로딩
	public void a(int param) {
		System.out.println("숫자 출력 "+ param);
	}
	public void a(String param) {
		System.out.println("문자출력 "+param);
	}
}
// 메소드와 다형성
public class PolymorphismDemo {

	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");
	}

}
