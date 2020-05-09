package com.itbank.java.day03;

// 상속 : 물려준다는 의미
// 어떤 객체가 있을 때 그 객체의 필드(변수)와 메소드를 다른 객체가 물려받을 수 있는 기능
// 변수, 메소드 -> 객체의 멤버
// 하나의 클래스는 여러개의 자식클래스를 가질 수 있다.

// class Calculator (extends Object) 부분이 생략되어 있음.
// Object : 모든 클래스의 공통된 조상, 최상단의 클래스
// 아무것도 상속받고 있지 않다면, 암묵적으로 object클래스를 자동 상속 받게 됨. 
// https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
// object 클래스의 매소드들을 상속받아서 사용할 수 있다는 의미

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
// class 자식클래스명 extends 부모클래스명{}	//extend - (사업등을)확대하다
class AddSubstractCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

// Calculator 를 상속받는 곱셈 클래스
class AddMultiplyCalculator extends Calculator{
	public void multiply() {
		System.out.println(this.left*this.right);
	}
}
// 상속 받은 자식 클래스를 또 상속 받아 사용 가능
class AddDevisionCalculator extends AddSubstractCalculator{
	public void devision() {
		System.out.println(this.left/this.right);
	}
}

// 계산기의 기능과, multiply 기능을 할 수 있으면서,
// left값을 right값으로 나눴을때의 나머지 출력 가능한 기능 가진 클래스 구현
class AddRemainderCalculator extends AddMultiplyCalculator{
	public void remainder() {
		System.out.println(this.left%this.right);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();	// c1  인스턴스 생성
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		System.out.println();
		
		AddSubstractCalculator c2 = new AddSubstractCalculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		c2.substract();
		System.out.println();
		
		AddMultiplyCalculator c3 = new AddMultiplyCalculator();
		c3.setOprands(3, 4);
		c3.multiply();
		System.out.println();
		
		AddDevisionCalculator c4 = new AddDevisionCalculator();
		// Calculator에서 상속
		c4.setOprands(10, 20);
		c4.sum();
		c4.avg();
		// AddSubstractCalculator에서 상속
		c4.substract();
		// 기능 추가
		c4.devision();
		System.out.println();
		
		// 결론
		// - 끊임없이 상속 관계를 이어 나갈 수 있음.
		
		AddRemainderCalculator c5 = new AddRemainderCalculator();
		c5.setOprands(7, 11);
		c5.sum();
		c5.avg();
		c5.multiply();
		c5.remainder();
		
		// 상속의 효용
		// 1. 중복의 제거 : 부모가 가지고 있는 기능을 자식이 또 만들 필요가 없다.  --> 코드의 재활용성 증가
		// 2. 코드의 재활용성이 증대 된다.  --> 유지보수 편의, 가독성 증가
		// 3. 유지 보수의 편의성 증대
		// 		- 부모클래스를 개선하게 되면, 이를 상속받고 있는 자식 클래스에게 개선된 부분이 자동으로 적용된다.
		// 4. 가독성 증가
		//		- 클래스가 가지고 있는 주요 기능을 제외한 나머지 코드는 부모에게 존재.
		
		
		
		
	}

}
