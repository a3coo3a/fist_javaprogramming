package com.itbank.java.day03;
/* �����ε��� ��������
 * - �޼ҵ��, �Ű�����(������Ÿ��,����,����)�� �����ϰ� ����Ÿ�Ը� �ٸ��ٸ� 
 * 			-> ���� � ���� ȣ���ؾ� ���� �� / �����߻�
 * - 
 * 
 * 
 * 
 * */

public class OverloadingDemo2 {
	public void A() {
		System.out.println("void A()");
	}
	public void A(int num) {
		System.out.println("void A(int num)");
	}
	public void A(String str) {
		System.out.println("void A(String str)");
	}

	/*public String A(String str) {
		return str;
	}*/
	public void B() {
		System.out.println("void B()");
	}
	public int B(int b) {
		return b;
	}
	public static void main(String[] args) {
		OverloadingDemo2 o = new OverloadingDemo2();
		o.A();
		o.A(2);
		o.A("Hello");
				
		
	}

}
