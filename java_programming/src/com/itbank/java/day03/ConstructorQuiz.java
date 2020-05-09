package com.itbank.java.day03;
	/* 실습
	 * Bus 클래스의 Car클래스의 자식 클래스
	 * Car 클래스의 생성자는 name, number을 입력받고,
	 * Bus 클래스의 생성자는 name, number, fee를 입력받음
	 * 부모클래스의 생성자를 이용해 name, number를 초기화한 후 
	 * fee를 직접초기화 하는 Bus의 생성자 만들어 보기
	 * */

class Car {
	String name;
	int number;
	//public Car() {}
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}

class Bus extends Car{
	int fee;
	public Bus(String name, int number, int fee) {
		super(name, number);
		this.fee = fee;	// super위에 가면 오류 발생
	}
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		Bus maeul = new Bus("마을", 6, 1250);
		System.out.println(maeul.name);
		System.out.println(maeul.number);
		System.out.println(maeul.fee);
		System.out.println();
		
		maeul.name = "마을버스";
		System.out.println(maeul.name);
		maeul.number = 9;
		System.out.println(maeul.number);
		System.out.println(maeul.fee+200);
		System.out.println();
		
		// Car객체 생성해보기 객체명 car
		Car car = new Car("레이", 4564);
		System.out.println(car.name);
		System.out.println(car.number);
				
	}

}
