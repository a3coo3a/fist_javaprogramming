package com.itbank.java.day02;

class C1{
	// static을 멤버(변수, 메서드)앞에 붙이면 클래스의 멤버가 됨.
	static int base = 10;
	// 인스턴스 변수 = a,b
	int a , b;
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a+b+base;
	}
	public double avg() {
		return (a+b)/2;
	}
	
	// 클래스 메서드 생성
	// - 인스턴스 변수가 포함되어 있으면 안되
	public static int multiply(int c, int d) {
		return c*d;
	}
	
	// 클래스 메서드가 인스턴스 변수에 접근 가능한가?
	// - 클래스 메서드는 인스턴스 멤버에 접근 할 수 없다.
	// 	   why? 인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 
	//			클래스 메서드는 인스턴스가 생성되기 전에 만들어지기 때문에 
	//			클래스 메서드가 인스턴스 멤버에 접근한다는 것은
	//			존재하지 않는 인스턴스 변수에 접근하는 것과 같다.
	public static void static_multiply() {
		// System.out.println(b+base);	// error!
	}
}

public class StaticDemo {
		// public : 접근제어자. 어느곳에서든 해당 객체를 참조할 수 있다.
		// static : 자바가 컴파일 되는 순간 정의
		// void : return값이 존재하지 않음
		// main : 프로그램의 시작
	public static void main(String[] args) {
		// C1 -> a,b
		// setNum()
		// sum(), avg()
		C1 num = new C1();
		num.setNum(5, 10);
		System.out.println(num.sum());
		System.out.println(num.avg());
		
		// 멤버 (구성원)
		// - 변수(field), 메서드(method)를 의미함.
		// 클래스 멤버 vs 인스턴스 멤버 로 구분
		// - 인스턴스 마다 서로 다른 값을 가지기 때문에 인스턴스 멤버로 구분
		// - 클래스 멤버는 모든 인스턴스에서 같은 값을 가짐
		
		// 클래스 변수 : 인스턴스를 생성하지 않고도 클래스에 직접 접근해서 클래스에 소속되어있는 변수에 접근 가능
		// 클래스 변수(static field) / 인스턴스 변수(non-static field)
		System.out.println(num.base);
		
		C1 c2 = new C1();
		System.out.println(c2.base);
		
		System.out.println(C1.base);
		
		C1.base = 20;	// 클래스 변수 값 변경
		// 값의 변경사항을 모든 인스턴스가 공유
		System.out.println(C1.base);
		System.out.println(num.base);
		System.out.println(c2.base);
		
		// 클래스 메서드를 클래스에 직접 접근해서 호출
		// 일회용처럼 한번만 사용하고 싶을때 사용
		System.out.println(C1.multiply(4, 2));
		
		// 메소드가 인스턴스 변수를 참조하지 않는다면, 클래스 메소드 사용
		// 따라서 불필요한 인스턴스의 생성을 막을 수 있다.
		
		// 클래스 멤버(변수, 메서드)의 효용가치 : 불필요한 인스턴스의 생성을 막기 위함.
		// 자바가 컴파일 되는 순간 클래스 멤버가 정의 됨.
		
		// static 메소드의 제약조건
		// - 오직 static멤버만 접근이 가능
		// - this 키워드 사용 불가능 : 객체가 생성되지 않은 상황에서도 사용이 가능하므로
			
	}

}
