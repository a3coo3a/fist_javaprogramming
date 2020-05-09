package com.itbank.java.day02;

public class ScopeDemo {

	public static void a() {
		int i = 0;	// i라는 변수가 a라는 메소드 안에서 선언되고 있으므로 i는 a메소드 밖에서는 영향을 미치지 않음.
		// 유효범위(Scope:스코프)
	}
	
	public static void main(String[] args) {
		 for (int i = 0 ; i < 5; i++) {
			 a();
			 System.out.print(i +" ");
		 }	// 결과 값이 무한루프가 아닌 0,1,2,3,4 출력됨
		
	}

}
