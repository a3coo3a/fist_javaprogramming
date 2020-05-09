package com.itbank.java.day02;

class C3 {
	static int base = 10;
	int a , b;
	
	// 생성자 (constructor)
	// - 생성자의 이름은 반드시 클래스 이름과 동일해야 함.
	// - 어떤 메소드 보다도 먼저 실행됨.
	// - 객체가 가장 먼저 해야할 일 : 초기화 진행
	// - 클래스를 정의할때 생성자가 없으면 디폴트 값으로 생성자 자동 생성.
	//		따라서, new 뒤에 오는 것은 생성자를 의미함. ex) C3 calc = new C3();
	
	public C3(int a, int b) {	// 생성자  C3
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a+b;
	}
	public int avg() {
		return (a+b)/2;
	}
	public static int multiply(int c, int d) {
		return c*d;
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		/*C3 calc = new C3();
		calc.setNum(3, 5);
		System.out.println(calc.sum());
		System.out.println(calc.avg());*/
		
		// 변수 초기값 설정을 객체 생성 당시에 강제함.
		// 따라서, 객체를 사용할 때 반드시 해야하는 놓치지 않게 함.
		C3 calc = new C3(3,5);
		System.out.println(calc.sum());
		System.out.println(calc.avg());
		
		
		
		
		
		
		
	}

}
