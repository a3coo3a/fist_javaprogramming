package com.itbank.java.eclipse;

public class WhileDemo {

	public static void main(String[] args) {
		// while( ���ǹ� ) {
		// �ݺ� �۾��� ����
		// }
		// ���ǹ��� �����ϴ� ���� �ݺ�, ���� ���� ����
		// ��������� ���ǹ��� Ż������ �� ���ؾ���.
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
		// Ŀ�� ��Ա�
		// coffee = 10��/10��
		// money = 300��
		// ���� �� ������������ Ŀ�Ǹ� ���ð� �;�
		// Ŀ�ǰ� �� �������ٸ�, �Ǹ����� �޽��� ���
		int coffeepay = 10, coffeeamount = 10;
		int money = 300;
		while (money > 0) {
			if (coffeeamount <= 0) {
				System.out.println("Ŀ�ǰ� �� ���������ϴ�. �Ǹ�����");
				break;
			}
			money -= coffeepay;
			coffeeamount--;
			System.out.println("Ŀ�� " + coffeeamount + "�� ���ҽ��ϴ�.");
		}
		
		// 1 ~ 10 ���� ����ϴµ� 3�� ����� ����
		int a = 0;
		while(a < 10) {
			a++;
			if(a % 3 == 0) continue;	// while���� { �� �̵��Ͽ� ����
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
	} 
}
