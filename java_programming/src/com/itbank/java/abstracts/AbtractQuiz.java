package com.itbank.java.abstracts;

abstract class Machine {
	public abstract void turnOn();
	public abstract void turnOff();
}
class Car extends Machine{
	public void turnOn() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
}

public class AbtractQuiz {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.turnOn();
		c1.turnOff();
				
	}

}
// [����������]
// ���ø� ����
// : � �۾��� ó���ϴ� �Ϻκ��� ���� Ŭ������ ĸ��ȭ�� ��ü ���� �����ϴ� ������ �ٲ��� �����鼭, 
//   Ư���ܰ�ּ� �����ϴ� ������ �ٲ�
