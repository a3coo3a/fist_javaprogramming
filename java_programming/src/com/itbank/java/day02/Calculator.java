package com.itbank.java.day02;

public class Calculator {
	int a, b;
	
	// 1. ����� �޼���
	// - ���� �ڷ��� ���
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sum1() {
		return a+b;
	}
	
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 2. �Է°� ���� �޼���
	public int multiply() {
		return a*b;
	}
	
	// 3. return ���� ���� �޼��� --> void 
	public void sum2() {
		System.out.println("a�� b�� ���� " + (a+b) + "�Դϴ�.");
	}
		
	// 4. void�޼��� -> return;
	// - return���� �̿��� �޼��带 ��������
	// - �Ϲ� �޼��忡���� return;���� �޼��� ���������� �� �Ұ��� ��ȯ���� �־�� �ϴ� �޼���� ��ȯ�� �� �ۼ�
	public void matchVersion(String version) {
		if("V1".equals(version)) {
			return;
		}
		System.out.println("���� ������? "+version);
	}
	
	public static void main(String[] args) {
		int c = 1;
		int d = 2;
		Calculator calc = new Calculator();
		System.out.println(calc.sum(c, d));
		
		calc.setNum(3, 4);
		System.out.println(calc.multiply());
		System.out.println(calc.sum1());
		calc.sum2();
		
		// calc2 ��� ���ο� ��ü ������ �� ������ ���ڸ� �޼��� ȣ���ϱ�
		Calculator calc2 = new Calculator();
		calc2.setNum(5, 8);
		System.out.println(calc2.sum(6, 8));
		System.out.println(calc2.sum1());
		calc2.sum2();
		System.out.println(calc2.multiply());
		
		calc2.matchVersion("V1");	// �ƹ��͵� ��µ��� ����
		calc2.matchVersion("V3");	// ���� ���� ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
