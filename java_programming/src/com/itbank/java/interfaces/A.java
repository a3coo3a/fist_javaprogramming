package com.itbank.java.interfaces;

// 인터페이스
// - 개발자 사이의 코드 규약을 정한다
// - 여러 구현체에서 공통적인 부분을 추상화 한다.
// 	: 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 
//	    그 객체는 반드시 인터페이스의 메소드들을 구현해야 한다.

// 인터페이스의 의미 
// - 특정한 클래스를 특정한 인터페이스와 결함시키게 되면
// 	 클래스를 정의할 때 인터페이스 내에 정의 되어 있는 메소드를 반드시 구현하도록 강제하고 있음.
// - 클래스 A는 인터페이스 I를 구현한다

interface I {
	public void z();
	// z() 는 본체가 없는 메소드
}

//  implements : I라는 인터페이스를 구현하기 위한 키워드
public class A implements I{
	
	public void z() {	// 인터페이스의 비어있는 메소드를 필히 구현해야함.
		System.out.println("z()");
	}
	public static void main(String[] args) {

	}

}
