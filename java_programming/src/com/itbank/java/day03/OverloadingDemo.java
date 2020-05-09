package com.itbank.java.day03;
/* Overloading(오버로딩)
 * - 똑같은 동작방법, 똑같은 로직을 가지고 있지만, 매개변수가 달라짐에 의해 다른 이름을 가질 수 밖에 없는 문제 해결을 위한 방법
 * - 오버라이딩과는 다르게 상속과는 관련이 없음
 * - 기능은 같지만 매개변수의 수에 따라 메소드명이 달라질시 사용의 혼돈이 옴 -> 동일한 이름으로 사용시 혼돈을 줄일 수 있음.
 * - 같은 이름, 같은 동작 방식을 갖는 메소드를 같은 이름으로 정의해줌.
 * - 자바에서는 메소드의 이름이 같다고 하더라도 메소드의 매개변수의 데이터 타입이나 매개변수가 달라지면 다른 메소드로 인식함.
 * 		-->> 그렇기 때문에 오버로딩이 가능.
 * >> 같은 이름의 메소드를 여러개 정의 하는 방법
 * */
class Calculator8{
	int one, two;
	int three = 0;
	
	public void setOprands(int one, int two) {
		this.one = one;
		this.two = two;
		System.out.println("setOprands(int one, int two)");
		// 자바 -> 메소드내에 출력문을 넣는 것은 해당 메소드가 호출되었는지 확인하기 위한 용도
	}
	public void setOprands(int one, int two, int three) {
		// 로직의 재활용성, 중복의 제거, 유지보수의 편의성 동시에 달성되는 효과가 있음. 
		this.setOprands(one, two);
		//setOprands(one,two); == this.setOprands(one, two);
		this.three = three;
		System.out.println("setOprands2(int one, int two, int three)");
	}
	/*public void setOprands(int one, int two, int three) {
		this.one = one;
		this.two = two;
		this.three = three;
		System.out.println("setOprands2(int one, int two, int three)");
	}*/
	public void sum() {
		System.out.println(one+two+three);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator8 c1 = new Calculator8();
		c1.setOprands(10, 20);
		c1.sum();
		c1.setOprands(10, 20, 30);
		c1.sum();
		
	}

}
