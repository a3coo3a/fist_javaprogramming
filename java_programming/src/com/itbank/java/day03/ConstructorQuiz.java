package com.itbank.java.day03;
	/* �ǽ�
	 * Bus Ŭ������ CarŬ������ �ڽ� Ŭ����
	 * Car Ŭ������ �����ڴ� name, number�� �Է¹ް�,
	 * Bus Ŭ������ �����ڴ� name, number, fee�� �Է¹���
	 * �θ�Ŭ������ �����ڸ� �̿��� name, number�� �ʱ�ȭ�� �� 
	 * fee�� �����ʱ�ȭ �ϴ� Bus�� ������ ����� ����
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
		this.fee = fee;	// super���� ���� ���� �߻�
	}
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		Bus maeul = new Bus("����", 6, 1250);
		System.out.println(maeul.name);
		System.out.println(maeul.number);
		System.out.println(maeul.fee);
		System.out.println();
		
		maeul.name = "��������";
		System.out.println(maeul.name);
		maeul.number = 9;
		System.out.println(maeul.number);
		System.out.println(maeul.fee+200);
		System.out.println();
		
		// Car��ü �����غ��� ��ü�� car
		Car car = new Car("����", 4564);
		System.out.println(car.name);
		System.out.println(car.number);
				
	}

}
