package com.itbank.java.day02;

public class ScopeDemo {

	public static void a() {
		int i = 0;	// i��� ������ a��� �޼ҵ� �ȿ��� ����ǰ� �����Ƿ� i�� a�޼ҵ� �ۿ����� ������ ��ġ�� ����.
		// ��ȿ����(Scope:������)
	}
	
	public static void main(String[] args) {
		 for (int i = 0 ; i < 5; i++) {
			 a();
			 System.out.print(i +" ");
		 }	// ��� ���� ���ѷ����� �ƴ� 0,1,2,3,4 ��µ�
		
	}

}