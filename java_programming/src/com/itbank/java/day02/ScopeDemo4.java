package com.itbank.java.day02;

class C2{
	int v = 10;
	
	public void m(){
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}


public class ScopeDemo4 {
	
	public static void main(String[] args) {

		C2 c1 = new C2();
		
		c1.m();	
		
		// this�ٿ��� ��½� 10 �� ���
		// this -> �ν��Ͻ� �ڱ��ڽ��� �ǹ�
		// 		-> �ν��Ͻ��� ���� ������ �ǹ�
		
		// ���
		// - ������ ��������, ���������� ����� �� �� �����ϱ� �����ϵ��� �� ��
		// - ��ü��� ������ �������� �ʴ� ���� ���� ���α׷���(c���)������ ��� �޼ҵ忡�� ������ ������ ������ ����� �˾ǽ���.
		// - ���� ������ ������ �޼ҵ带 ��� ��ü�� �����ϸ�,
		// 	 �װ͵��� ��ü �������� �������� �����ϱ� ������ ��ȿ���� ���� �� �� ����.
		//   ���� ������ ������ �޼ҵ���� �׷��������ν� �������� ��ü �ȿ��� ���������� ��밡��
		// - ������, ��ü�� �ʹ� Ŀ�� �� �ֱ� ������ ������ ũ�⸦ �����ϰ� ���������� �������� �ʴ� ���� �߿�
		// - ����ȭ�� �߿�.
		
		
		
		
		
		
	}

}