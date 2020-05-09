package com.itbank.java.eclipse;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// switch ( ���� ){
		// case 1 : 
		//	 ���� ����
		//	 break;
		//	  ....
		// }
		
		switch(1) {
		case 1:
			System.out.println("one");
			break;	// ���ǹ��� {}�� ��������.
		case 2:
			System.out.println("two");
			break;
		case 3: 
			System.out.println("three");
			break;
		default:	// if ���� else ���� ��
			System.out.println("else");
			break;	// default�� �������϶��� ���ص� ��� ����.
		}
		
		// month ���� �������� �޾� �ش� ���� ���� �� �̸� ex) jan, feb....
		// ��ȯ�� �ִ� ����ġ ���̽� �� �ۼ�
		// �������� �ʴ� ���� ���  wrong ���
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println("wrong");
		}
		
	}

}
