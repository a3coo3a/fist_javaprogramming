package com.itbank.java.abstracts;

abstract class Machine {
	public abstract void turnOn();
	public abstract void turnOff();
}
class Car extends Machine{
	public void turnOn() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
}

public class AbtractQuiz {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.turnOn();
		c1.turnOff();
				
	}

}
// [디자인패턴]
// 템플릿 패턴
// : 어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수해하는 구조는 바꾸지 않으면서, 
//   특정단계애서 수행하는 내역을 바꿈
