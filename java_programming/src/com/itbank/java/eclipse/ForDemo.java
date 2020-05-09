package com.itbank.java.eclipse;

public class ForDemo {

	public static void main(String[] args) {
		// for(초기값; 조건문; 증감식){
		// 		실행
		// }
		
		/*int sum = 0;
		for(int i = 0; i < 4; i++) {
			System.out.println("i : "+i+"sum : "+sum);
			sum += i;	// sum = sum + i; 와 같음.
		}	
		
		for(int i = 0; i<=10; i++) {
			if(!(i % 3 == 0)) {
				System.out.println(i);
			}else {
				System.out.println("*");
			}
		}
		System.out.println("*******************************");
		// continue; 스킵하는 것 
		
		for(int i = 0; i < 20; i++) {
			if(i*2 == 10) break;	// for문의 ({}) 를 빠져나감.
			System.out.println(i);
		}
		
		
		System.out.println("*******************************");
		
		for(int i = 5; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("*******************************");*/
		
		// 이중 for문
		
		/*for(int i = 0; i <= 3; i++) {
			for(int j = 3; j >= 0; j--) {
				System.out.println(i+" - "+j);
			}System.out.println("");
		}
		
		System.out.println("*******************************");
		
		String[] numbers = {"one","two","three"};
		for(int i = 0; i<numbers.length; i++) {	// 넘버스의 길이만큼 돌아 numbers.length >> 3임
			System.out.println(numbers[i]);
		}
		
		// for-each
		for(String num: numbers) {	// numbers의 배열의 문자열을 num으로 하나씩 받아오겠다.
			System.out.println(num);
		}*/
		// numbers : iterate 객체, 루프를 돌릴 객체, 하나씩 읽을 수 있는 객체, 하나씩 순차적으로 대입.
		// 종류 : 배열
		// 단점 : 1스탭씩 순차적으로만 가능
		
		// 퀴즈 : 2단 ~ 9단 구구단 만들기
		// 같은 단은 한줄에 프린트
		
		for(int i = 2 ; i <= 9; i++) {
			System.out.print(i+"단");
			for(int j = 1 ; j <= 9; j++) {
				System.out.print(" / "+ i +" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	}

}
