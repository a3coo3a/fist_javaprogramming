package com.itbank.java.poly;

interface I2{
	public String A();	// A메소드 구현 강제
}
interface I3{
	public String B();	// B메소드 구현 강제
}
class D implements I2,I3 {
	public String A() {	// I2 인터페이스에 따라서  A메소드 구현
		return "A";
	}
	public String B() {	// I3 인터페이스에 따라서 B메소드 구현
		return "B";
	}
}


public class PolyDemo2 {
	public static void main(String[] args) {
		// 1) 클래스와 데이터 타입 동일
		D obj = new D();
		obj.A();
		obj.B();
		
		// 2) 데이터 타입을 I2 - 데이터 타입을 통해 D의 메소드 부분을 일부분만 사용할 수 있게 접근을 제어할 수 있음.
		I2 obj2 = new D();
		System.out.println(obj2.A());
		//System.out.println(obj2.B());	// 에러 : I2에 B메소드가 존재하지 않아 오류 발생
		
		// 3) 데이터 타입을 I3
		I3 obj3 = new D();
		//System.out.println(obj3.A());	// 에러 : I3에 A메소드가 존재하지 않아 오류 발생
		System.out.println(obj3.B()); 
		
		// 결론
		// - 어떤 클래스의 데이터타입으로 인터페이스를 사용한다는 것은
		//   마치 그 클래스가 그 인터페이스에서 정의한 멤버들 만을 가지고 있는 클래스인 것처럼 동작
		
		// 따라서 인터페이스에서 다형성을 활용하면
		// 원하는 기능만 사용하고, 나머지 기능들을 신경쓰지 않을 수 있기 때문에
		// 해당 기능에만 집중할 수 있다. (사용자 입장에서)
		
	}
}
