package com.itbank.java.day04;
// ���� ������ ��� ����
// - ���ø����̼� : ����, ����� ���� : �ݰ�
// - 
class A{
	public String y() {		// public : �������� Ŭ������ �޼ҵ带 ȣ���ؼ� ��� ����
		return "public vold y()";
	}
	
	private String z() {	// private :  ���������δ� ����� �� ������, �ܺ� Ŭ������ ��� �Ұ���
		return "public vold z()";	
	}
	
	public String x() {		// x()�� z()�� ���� Ŭ���� �̱⿡ private ���� ����
		return z();
	}
}
public class AccessDemo {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z());	// private Ű���� ������ ����
		System.out.println(a.x());
	}
}
