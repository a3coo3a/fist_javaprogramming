package com.itbank.java.interfaces;

class X {
	public String a() {
		return "X.a";
	}
}
class Y extends X {
	public String a() {
		return "Y.a";
	}
	public String b() {
		return "b";
	}
}
class Y2 extends X{
	public String a() {
		return "Y2.a";
	}
}
// 클래스와 다형성
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		X obj = new Y();
		X obj2 = new Y2();
		
		System.out.println(obj.a());
		System.out.println(obj2.a());
		
		//System.out.println(obj.b()); // 에러 , 데이터 타입이 부모클래스 이기 때문에 자식클래스에 있는 b를 호출할 수 없음.
				
		
		// 다형성의 의의
		// - 동일한 데이터타입으로 존재하면서도 
		//   각각의 클래스에 소속되어 있는 메소드의 동작방식대로 동작하고 있음
		
	}

}
