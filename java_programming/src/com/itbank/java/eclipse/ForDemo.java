package com.itbank.java.eclipse;

public class ForDemo {

	public static void main(String[] args) {
		// for(�ʱⰪ; ���ǹ�; ������){
		// 		����
		// }
		
		/*int sum = 0;
		for(int i = 0; i < 4; i++) {
			System.out.println("i : "+i+"sum : "+sum);
			sum += i;	// sum = sum + i; �� ����.
		}	
		
		for(int i = 0; i<=10; i++) {
			if(!(i % 3 == 0)) {
				System.out.println(i);
			}else {
				System.out.println("*");
			}
		}
		System.out.println("*******************************");
		// continue; ��ŵ�ϴ� �� 
		
		for(int i = 0; i < 20; i++) {
			if(i*2 == 10) break;	// for���� ({}) �� ��������.
			System.out.println(i);
		}
		
		
		System.out.println("*******************************");
		
		for(int i = 5; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("*******************************");*/
		
		// ���� for��
		
		/*for(int i = 0; i <= 3; i++) {
			for(int j = 3; j >= 0; j--) {
				System.out.println(i+" - "+j);
			}System.out.println("");
		}
		
		System.out.println("*******************************");
		
		String[] numbers = {"one","two","three"};
		for(int i = 0; i<numbers.length; i++) {	// �ѹ����� ���̸�ŭ ���� numbers.length >> 3��
			System.out.println(numbers[i]);
		}
		
		// for-each
		for(String num: numbers) {	// numbers�� �迭�� ���ڿ��� num���� �ϳ��� �޾ƿ��ڴ�.
			System.out.println(num);
		}*/
		// numbers : iterate ��ü, ������ ���� ��ü, �ϳ��� ���� �� �ִ� ��ü, �ϳ��� ���������� ����.
		// ���� : �迭
		// ���� : 1���Ǿ� ���������θ� ����
		
		// ���� : 2�� ~ 9�� ������ �����
		// ���� ���� ���ٿ� ����Ʈ
		
		for(int i = 2 ; i <= 9; i++) {
			System.out.print(i+"��");
			for(int j = 1 ; j <= 9; j++) {
				System.out.print(" / "+ i +" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	}

}
