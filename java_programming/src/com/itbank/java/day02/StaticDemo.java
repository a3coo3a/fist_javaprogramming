package com.itbank.java.day02;

class C1{
	// static�� ���(����, �޼���)�տ� ���̸� Ŭ������ ����� ��.
	static int base = 10;
	// �ν��Ͻ� ���� = a,b
	int a , b;
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a+b+base;
	}
	public double avg() {
		return (a+b)/2;
	}
	
	// Ŭ���� �޼��� ����
	// - �ν��Ͻ� ������ ���ԵǾ� ������ �ȵ�
	public static int multiply(int c, int d) {
		return c*d;
	}
	
	// Ŭ���� �޼��尡 �ν��Ͻ� ������ ���� �����Ѱ�?
	// - Ŭ���� �޼���� �ν��Ͻ� ����� ���� �� �� ����.
	// 	   why? �ν��Ͻ� ������ �ν��Ͻ��� ��������鼭 �����Ǵµ�, 
	//			Ŭ���� �޼���� �ν��Ͻ��� �����Ǳ� ���� ��������� ������ 
	//			Ŭ���� �޼��尡 �ν��Ͻ� ����� �����Ѵٴ� ����
	//			�������� �ʴ� �ν��Ͻ� ������ �����ϴ� �Ͱ� ����.
	public static void static_multiply() {
		// System.out.println(b+base);	// error!
	}
}

public class StaticDemo {
		// public : ����������. ����������� �ش� ��ü�� ������ �� �ִ�.
		// static : �ڹٰ� ������ �Ǵ� ���� ����
		// void : return���� �������� ����
		// main : ���α׷��� ����
	public static void main(String[] args) {
		// C1 -> a,b
		// setNum()
		// sum(), avg()
		C1 num = new C1();
		num.setNum(5, 10);
		System.out.println(num.sum());
		System.out.println(num.avg());
		
		// ��� (������)
		// - ����(field), �޼���(method)�� �ǹ���.
		// Ŭ���� ��� vs �ν��Ͻ� ��� �� ����
		// - �ν��Ͻ� ���� ���� �ٸ� ���� ������ ������ �ν��Ͻ� ����� ����
		// - Ŭ���� ����� ��� �ν��Ͻ����� ���� ���� ����
		
		// Ŭ���� ���� : �ν��Ͻ��� �������� �ʰ� Ŭ������ ���� �����ؼ� Ŭ������ �ҼӵǾ��ִ� ������ ���� ����
		// Ŭ���� ����(static field) / �ν��Ͻ� ����(non-static field)
		System.out.println(num.base);
		
		C1 c2 = new C1();
		System.out.println(c2.base);
		
		System.out.println(C1.base);
		
		C1.base = 20;	// Ŭ���� ���� �� ����
		// ���� ��������� ��� �ν��Ͻ��� ����
		System.out.println(C1.base);
		System.out.println(num.base);
		System.out.println(c2.base);
		
		// Ŭ���� �޼��带 Ŭ������ ���� �����ؼ� ȣ��
		// ��ȸ��ó�� �ѹ��� ����ϰ� ������ ���
		System.out.println(C1.multiply(4, 2));
		
		// �޼ҵ尡 �ν��Ͻ� ������ �������� �ʴ´ٸ�, Ŭ���� �޼ҵ� ���
		// ���� ���ʿ��� �ν��Ͻ��� ������ ���� �� �ִ�.
		
		// Ŭ���� ���(����, �޼���)�� ȿ�밡ġ : ���ʿ��� �ν��Ͻ��� ������ ���� ����.
		// �ڹٰ� ������ �Ǵ� ���� Ŭ���� ����� ���� ��.
		
		// static �޼ҵ��� ��������
		// - ���� static����� ������ ����
		// - this Ű���� ��� �Ұ��� : ��ü�� �������� ���� ��Ȳ������ ����� �����ϹǷ�
			
	}

}
