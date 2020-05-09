package com.itbank.java.day02;

public class ScopeDemo3 {
	static int i = 5;	// 전역변수
	
	public static void a() {
		int i = 10;		// 지역변수
		b();
		System.out.println(i);
	}
	
	public static void b() {
		// int i = 30;
		System.out.println(i);
	}
		
	public static void main(String[] args) {
		a();	// 5
		
		// 왜 5가 출력 되었을까?
		// 1. a메소드의 호출이 main의 스코프에서 영향을 받은 것인지 확인
		int i = 1;
		a();	// 5
		
		// 2. b메소드 수정해 보기
		// 		b함수에 int i = 30; 입력
		a();	// 30
		// - i는 b의 스코프를 사용했음을 의미함
		// 만약에 지역변수 i가 없다면 전역변수 i가 사용됨을 의미함.
		
		// 결론
		// - b라는 메소드를 호출하고 있는 메소드들(a, main)이 가지고 있는 지역변수들은
		//   b가 가지고 있는 변수에 영향을 주지 않음.
		// - b라는 메소드를 누가 호출했는지는 전혀 중요하지 않음.
		
		// 정적인 유효범위 (static(lexical) scope)
		// - 메소드 자기자신, 혹은 전역변수에만 접근할 수 있다.
		
		// 동적인 유효범위 (dynamic scope)
		// - b를 호출한 a 메소드에서의 i값이 출력되었다면
	
		
	
	
	
	
	
	
	
	}

}
