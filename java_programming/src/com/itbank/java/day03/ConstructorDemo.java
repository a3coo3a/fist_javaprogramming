package com.itbank.java.day03;

// 생성자 
// - 객체를 생성하는 역할
// - 객체를 생성하는 과정에서 최초로 수행하는 하는 일을 위한 메소드를 정의할 수 있도록 하는 것

public class ConstructorDemo {
	// 기본 생성자를 명시적으로 선언
	public ConstructorDemo() {}
	// 사용자 정의 생성자 선언
	public ConstructorDemo(int a) {
		
	}
	public static void main(String[] args) {
		// ConstructorDemo() == 기본생성자 		// 생성자를 별도 선언하지 않을 경우 자바가 자동으로 생성자 생성
		// ConstructorDemo(int a) == 사용자 정의 생성자	// 사용자 정의 생성자 선언시 기본 생성자를 만들지 않음.
		ConstructorDemo c = new ConstructorDemo();
		
		
		
		
	}

}
