package com.itbank.java.eclipse;

public class WhileDemo {

	public static void main(String[] args) {
		// while( 조건문 ) {
		// 반복 작업할 내용
		// }
		// 조건문을 만족하는 동안 반복, 무한 루프 가능
		// 어느시점에 조건문을 탈출할지 잘 정해야함.
		/*int i = 0;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		int sum = 0;
		while(i<4) {
			sum += i;
			System.out.println(sum);
			i++;
		}
		*/
		// 커피 사먹기
		// coffee = 10원/10개
		// money = 300원
		// 돈이 다 떨어질때까지 커피를 마시고 싶어
		// 커피가 다 떨어진다면, 판매중지 메시지 출력
		int coffeepay = 10, coffeeamount = 10;
		int money = 300;
		while (money > 0) {
			if (coffeeamount <= 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매중지");
				break;
			}
			money -= coffeepay;
			coffeeamount--;
			System.out.println("커피 " + coffeeamount + "잔 남았습니다.");
		}
		
		// 1 ~ 10 까지 출력하는데 3의 배수는 제외
		int a = 0;
		while(a < 10) {
			a++;
			if(a % 3 == 0) continue;	// while문의 { 로 이동하여 실행
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
	} 
}
