package com.itbank.java.day04;


class Car {
	private String name;
	private int number;
	
	// ���� �ʱ�ȭ�� ������ ��� - set�Լ����� �����ϰ� "������ ����"
	/* public Car(String name, int number){
	 * 		this.name = name;
	 * 		this.number = number;
	 * }
	 * */
	
	// ��ȸ
	public String getName() {
		return this.name;
	}
	public int getNumber() {
		return number;
	}
	// �Ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	private void stop() {
		System.out.println("���� ����ϴ�.");
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
