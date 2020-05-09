package com.itbank.java.day02;

public class ScopeDemo3 {
	static int i = 5;	// ��������
	
	public static void a() {
		int i = 10;		// ��������
		b();
		System.out.println(i);
	}
	
	public static void b() {
		// int i = 30;
		System.out.println(i);
	}
		
	public static void main(String[] args) {
		a();	// 5
		
		// �� 5�� ��� �Ǿ�����?
		// 1. a�޼ҵ��� ȣ���� main�� ���������� ������ ���� ������ Ȯ��
		int i = 1;
		a();	// 5
		
		// 2. b�޼ҵ� ������ ����
		// 		b�Լ��� int i = 30; �Է�
		a();	// 30
		// - i�� b�� �������� ��������� �ǹ���
		// ���࿡ �������� i�� ���ٸ� �������� i�� ������ �ǹ���.
		
		// ���
		// - b��� �޼ҵ带 ȣ���ϰ� �ִ� �޼ҵ��(a, main)�� ������ �ִ� ������������
		//   b�� ������ �ִ� ������ ������ ���� ����.
		// - b��� �޼ҵ带 ���� ȣ���ߴ����� ���� �߿����� ����.
		
		// ������ ��ȿ���� (static(lexical) scope)
		// - �޼ҵ� �ڱ��ڽ�, Ȥ�� ������������ ������ �� �ִ�.
		
		// ������ ��ȿ���� (dynamic scope)
		// - b�� ȣ���� a �޼ҵ忡���� i���� ��µǾ��ٸ�
	
		
	
	
	
	
	
	
	
	}

}
