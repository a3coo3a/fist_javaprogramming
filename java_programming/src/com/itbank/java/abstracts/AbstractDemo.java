package com.itbank.java.abstracts;


// 추상화
// - 추상클래스 내에 추상 메소드 존재
// - 추상메소드는 본체를 가질 수 없음
// 추상 클래스를 사용하는 이유?
// - 상속을 강제하기 위함
// - Ex추상클래스는 정의를 하였다기 보다 추상메소드를 선언 하였다고 생각하면 됨
// - 일반 메소드도 추상클래스 내에 존재 할수 있음.
// - 단, 추상 메소드는 상속 후 '오버라이딩' 필수!

abstract class Ex{
	// final : 상속, 변경을 금지하는 규제 / 바뀔 수 없는 값 ->상수선언에 사용되는 키워드
	// 디폴트 접근제어자를 가지는 것임.
	// final int BASE = 10;
	// final 선언의 일반적 형식 : public static final
	// public - 어디서든 접근 가능한 제어자
	// static - 클래스 변수 선언
	public static final int BASE = 10;	// 상수
		
	public abstract int b();
	
	// public abstract void c() {System.out.println("hello");}
	// 에러 - 추상화 메소드는 본체를 가질 수 없으므로 

	public void d() {
		//BASE = 20; // 불가능
		System.out.println("hello");
	}
}


// b() 메소드는 추상 메소드
// 추상메소드의 특징 
// - 중괄호로 시작하는 본체가 존재하지 않음
// - 구체적인 로직을 담고 있는 본체가 없고, 시그니처만이 남아있는 메소드

class B extends Ex{
	// 메소드를 반드시 '오버라이딩'하여 구체적인 로직을 정의하여야 함
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// Ex obj = new Ex();	// 인스턴스화 에러
		// 추상 클래스는 반드시 상속해서 사용해야 함. - 그래서 에러가 발생한 것임
		
		B obj = new B();
		System.out.println(obj.b());
		
		
		
		
		
	}

}
