package com.itbank.java.exceptions;

// ������ ����

class A{
	private int[] arr = new int[3];
	
	A() {	// �����ڴ� ����Ÿ���� ����
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	void z(int first, int second) {
		try {
		System.out.println(arr[first]/arr[second]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Err");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Err");
		}catch(Exception e) {		// ���� �������� �����̹Ƿ� �ϴܿ� ��ġ�ؾ���.
			System.out.println("Exception");
		}finally {	// ���� ���ο� ������� ������ ����Ǵ� ����
			System.out.println("finally");
		}
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		
		A a = new A();
		a.z(10, 1);
		//����! java.lang.ArrayIndexOutOfBoundsException: 10
		// ArrayIndexOutOfBoundsException : �迭�� 3���� ���� ���� �� �ִµ�, 10��° �ε����� ȣ���ϰ� �ִ�
		// 									�������� �ʴ� ���� ���������� �õ��ϰ� �ֱ� ������ ���� �߻�
				
		a.z(1, 0);
		// ���� ! java.lang.ArithmeticException: / by zero
		// ArithmeticException : ���������� ���� �߻� / 0���� ������ ����.
				
		// ���
		// - ���� ���������� ��Ȳ�� ���� �ٸ� ���ܰ� �߻��� �� ����.
		a.z(2, 1);
		
	}

}
