package com.itbank.java.abstracts;

// ����
// - �߻�Ŭ�������� ���������� ���Ǵ� ������ �����ϰ� �װ��� ��� �޴� �ڽ�Ŭ�������� 
// 	 �뵵�� ���� �޶����� ������ ����ڰ� �����ϵ��� �ϴ� ���� �߻�Ŭ������ �뵵
abstract class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	// ��Ȳ�� ���� �޶��� �� �ִ� �κ� ->�޼ҵ� ����ڿ��� ���� ������ �κ�
	public abstract void sum();
	public abstract void avg();
	
	// ���������� default
	// - ���� ��Ű�� �������� ��� ����
	int _sum() {	
		return this.left+this.right;
	}
	int _avg() {
		return _sum()/2;
	}
	
	// �������� �κ�
	public void run() {
		sum();
		avg();
	}
}
class CalculatorKor extends Calculator {
	public void sum() {
		System.out.println("�� ���� ���� : "+ _sum());
	}
	public void avg() {
		System.out.println("�� ���� ����� : "+ _avg());
	}
}

class CalculatorEng extends Calculator {
	public void sum() {
		System.out.println("Sum of two numbers: "+ _sum());
	}
	public void avg() {
		System.out.println("Average of two numbers: "+ _avg());
	}
}

public class AbstractCalculator {

	public static void main(String[] args) {
		
		CalculatorKor c1 = new CalculatorKor();
		c1.setOprands(10, 20);
		c1.run();
		System.out.println();
		CalculatorEng c2 = new CalculatorEng();
		c2.setOprands(10, 20);
		c2.run();
		
		
		
	}

}
