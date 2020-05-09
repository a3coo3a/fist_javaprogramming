package com.itbank.java.day02;

class C2{
	int v = 10;
	
	public void m(){
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}


public class ScopeDemo4 {
	
	public static void main(String[] args) {

		C2 c1 = new C2();
		
		c1.m();	
		
		// this붙여서 출력시 10 을 출력
		// this -> 인스턴스 자기자신을 의미
		// 		-> 인스턴스에 대한 전역을 의미
		
		// 결론
		// - 변수를 전역변수, 지역변수로 나누어서 좀 더 관리하기 편리하도록 한 것
		// - 객체라는 개념이 존재하지 않는 절차 지향 프로그래밍(c언어)에서는 모든 메소드에서 접근이 가능한 변수의 사용을 죄악시함.
		// - 만약 적절한 변수와 메소드를 묶어서 객체로 생성하면,
		// 	 그것들은 객체 내에서의 전역으로 동작하기 때문에 유효범위 제한 할 수 있음.
		//   따라서 연관된 변수나 메소드들을 그룹핑함으로써 마음놓고 객체 안에서 전역변수를 사용가능
		// - 하지만, 객체도 너무 커질 수 있기 때문에 적당한 크기를 유지하고 전역변수를 남용하지 않는 것이 중요
		// - 최적화가 중요.
		
		
		
		
		
		
	}

}
