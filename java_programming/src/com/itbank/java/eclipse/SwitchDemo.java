package com.itbank.java.eclipse;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// switch ( 조건 ){
		// case 1 : 
		//	 실행 내용
		//	 break;
		//	  ....
		// }
		
		switch(1) {
		case 1:
			System.out.println("one");
			break;	// 조건문의 {}를 빠져나옴.
		case 2:
			System.out.println("two");
			break;
		case 3: 
			System.out.println("three");
			break;
		default:	// if 문의 else 같은 것
			System.out.println("else");
			break;	// default가 마지막일때는 안해도 상관 없음.
		}
		
		// month 값을 조건으로 받아 해당 월에 대한 월 이름 ex) jan, feb....
		// 반환해 주는 스위치 케이스 문 작성
		// 존재하지 않는 월의 경우  wrong 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
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
