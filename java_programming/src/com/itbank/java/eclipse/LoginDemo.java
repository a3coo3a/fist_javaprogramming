package com.itbank.java.eclipse;

import java.util.Scanner;

// id��  password �����ϴ� �ý��� �����
public class LoginDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id, password�� �Է��ϼ���");
		String id = scan.next();
		int password = scan.nextInt();
		System.out.println("id : "+id);
		System.out.println("password : "+password);
		
		// id = Eclipse, password = 0000�̿��߸� �ý��� �α��� ����
		// �� �� �¾ƾ� �α��� ("welcome!")
		// id Ʋ���� "enter the right id"
		// password Ʋ���� "enter the right password"
		
		/*if(id.equals("Eclipse") && (password == 0000)) {
			System.out.println("welcome!");
		}else {
			if(!(id.equals("Eclipse"))) {
				System.out.println("enter the right id");
			}else if(!(password == 0000)) {
				System.out.println("enter the right password");
			}
		}*/
		
		if(id.equals("Eclipse")) {
			if(password == 0000) {
				System.out.println("welcome!");
			}else {
				System.out.println("enter the right password");
			}
		}else {
			System.out.println("enter the right id");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
