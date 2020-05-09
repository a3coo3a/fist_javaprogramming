package com.itbank.java.day04;


class Car {
	private String name;
	private int number;
	
	// 변수 초기화를 강제한 경우 - set함수들은 삭제하고 "생성자 생성"
	/* public Car(String name, int number){
	 * 		this.name = name;
	 * 		this.number = number;
	 * }
	 * */
	
	// 조회
	public String getName() {
		return this.name;
	}
	public int getNumber() {
		return number;
	}
	// 할당
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void run() {
		System.out.println("차가 달립니다.");
	}
	private void stop() {
		System.out.println("차가 멈춥니다.");
	}
	public void warning() {
		stop();
	}
}

public class AccessQuiz {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		car.run();
		car.warning();
		
		
	}

}
