package com.itbank.java.eclipse;

public class Num {

	public static void main(String[] args) {
		int age = 10;
		long countofstar = 123456432416843541L;
		
		double a = 3.14;
		float b = 3.14f;
		double c = 1.234e2; 	// ����ǥ���� 10^2
		
		int num1 = 11;
		int num2 = 5;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);	// �Ҽ��� ���� �߻��� �������� ������
		System.out.println(num1%num2);	// ������
		
		// ��������
		int i = 0;
		i++;	// i�� 1����
		
		int j = 10;
		j--;	// j�� 1����
		
		System.out.println(i);
		System.out.println(j);
		System.out.println();
		
		int k = 0;
		System.out.println(k++);	// ��� : 0	
		// k++ �ش��ڵ尡 ����Ǵ� ��������  k���� ������� ����.
		// �ڵ尡 ������ �� �� ���� -> ���� ������ ���Ŀ� ����.
		System.out.println(k);		// ��� : 1
		
		System.out.println(++k);	// ��� : 2
		// ���� ��Ų �Ŀ�  k�� ���
		System.out.println(k);		// ��� : 2
		
		
		
		
		
		
		
		
		
		
		
	}

}
