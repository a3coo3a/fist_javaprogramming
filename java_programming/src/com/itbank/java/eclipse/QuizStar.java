package com.itbank.java.eclipse;

import java.util.Scanner;

public class QuizStar {

	public static void main(String[] args) {
		// 1.
		/*for(int i = 0; i<3; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();*/
		// 2.
		/*for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<4 ; j++) {			
				if(i<j) break;
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();*/
		// ������ 2��
		// for(int i = 0; i<4 ; i++){
		//	for(int j = 0; j<i+1 ; j++){
		
		// 3.
		/*or(int i = 0; i<4; i++) {
			for(int j = 3; j>=0; j--) {
				if(j<=i) {
					System.out.print("*");
				}else System.out.print(" ");
			}System.out.println();
		}
		System.out.println();*/
		// ������ 3��
		// for(int i = 0; i < 4; i++){
		// 	for(int j = 4; j>0; j--){
		//		if(i<j) (" ");
		//		else ("*");
		
		// 4.
		/*for(int i = 3; i>=0; i--) {
			for(int j = 0; j<7 ; j++) {
				if(i==j) System.out.print("*");
				else System.out.print(" ");
			}System.out.println();
		}*/
		
		// ������ 4��
		// 1->3->5->7 ���� ���� // i*2+1
		// 3->2->1->0 ������ ����// 
		// for(int i = 0; i<4; i++){
		//	for(int j = 0; j<3-i ;j++){	// ����� for��
		//	}
		//	for(int k = 0; k<(i*2+1) ;k++){	// *�� for��
		//	}
		
		// 5.
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		System.out.println("�Էµ� ���� : "+num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
