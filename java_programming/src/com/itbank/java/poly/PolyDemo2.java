package com.itbank.java.poly;

interface I2{
	public String A();	// A�޼ҵ� ���� ����
}
interface I3{
	public String B();	// B�޼ҵ� ���� ����
}
class D implements I2,I3 {
	public String A() {	// I2 �������̽��� ����  A�޼ҵ� ����
		return "A";
	}
	public String B() {	// I3 �������̽��� ���� B�޼ҵ� ����
		return "B";
	}
}


public class PolyDemo2 {
	public static void main(String[] args) {
		// 1) Ŭ������ ������ Ÿ�� ����
		D obj = new D();
		obj.A();
		obj.B();
		
		// 2) ������ Ÿ���� I2 - ������ Ÿ���� ���� D�� �޼ҵ� �κ��� �Ϻκи� ����� �� �ְ� ������ ������ �� ����.
		I2 obj2 = new D();
		System.out.println(obj2.A());
		//System.out.println(obj2.B());	// ���� : I2�� B�޼ҵ尡 �������� �ʾ� ���� �߻�
		
		// 3) ������ Ÿ���� I3
		I3 obj3 = new D();
		//System.out.println(obj3.A());	// ���� : I3�� A�޼ҵ尡 �������� �ʾ� ���� �߻�
		System.out.println(obj3.B()); 
		
		// ���
		// - � Ŭ������ ������Ÿ������ �������̽��� ����Ѵٴ� ����
		//   ��ġ �� Ŭ������ �� �������̽����� ������ ����� ���� ������ �ִ� Ŭ������ ��ó�� ����
		
		// ���� �������̽����� �������� Ȱ���ϸ�
		// ���ϴ� ��ɸ� ����ϰ�, ������ ��ɵ��� �Ű澲�� ���� �� �ֱ� ������
		// �ش� ��ɿ��� ������ �� �ִ�. (����� ���忡��)
		
	}
}
