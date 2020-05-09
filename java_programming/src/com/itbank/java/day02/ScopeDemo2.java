package com.itbank.java.day02;

// 변수 선언시 생성된 곳의 {} 내에서만 유효
// 변수 선언은 변수의 유효범위(Scope)를 정하는 행위

public class ScopeDemo2 {
	// 전역 변수 (global variable) 
	// - 클래스에 직접 속해 있는 변수
	// - 클래스 바로 아래에 i가 선언
	// - 클래스 내에 있는 모든 메소드와 모든 변수에 영향을 미침
	static int i;
		
	public static void a() {
		i = 0;
		// i 앞에 int가 없음. 선언은 전역변수에서 해준 것.
		// 이곳에서 선언이 되지 않았기 때문에 어디서 선언이 되었는지 찾아다닐것이다.
		// 가까운 메소드 내에서 찾고 없으면 바깥 메소드로 이동하여 찾고 또 바깥으로 이동하다가 class내 선언한 i를 찾은것
		// int i = 0;
		// 지역변수 (local variable)
		// - 메소드 내에서 선언된 변수
	}
	public static void main(String[] args) {
		// 무한루프에 빠짐
		for(i = 0; i < 5; i++) {	
			a();	// i 값을 0으로 초기화 하는 함수가 됨.
			System.out.println(i);	// 가까운 곳에 선언된 i의 영향을 받음 for문의 i가 int i라면 for문의 i와 같게됨.
		}
	}
	
}
