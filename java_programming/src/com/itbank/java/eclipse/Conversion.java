package com.itbank.java.eclipse;

public class Conversion {

	public static void main(String[] args) {
		double a = 3.0f;	// double Ÿ����  float Ÿ��ũ�Ƿ� �ڵ�����ȯ�� �̷����.
		//float b = 3.0;	// error! ������ Ÿ��ũ�Ⱑ ū double�� ���� float�� �������� ���� �߻�
		
		/*�ڵ�����ȯ : ǥ�������� ���� ������ Ÿ�Կ��� ���� ������Ÿ������ ��ȯ*/
		
		// ���� ����ȯ
		float c = (float)4.0009;	// ����� ����ȯ
		int d = (int)100.0f;
		
		// �غ���
		long longVal = 10;
		// int�� ����  intVal �� �����ϰ� longVal�� ����ִ� �� �Ҵ�
		int intVal = (int) longVal;	//long�� int���� ����� Ŀ�� ()�� ���� ��������ȯ
		System.out.println(intVal);
		
		// ���
		final int BASE = 10;
		
	}

}
