package com.itbank.java.eclipse;

public class IfDemo {
	public static int conditionTest(int value) {
		// value ���� ����Ǿ� �ִٰ� ����
		int ret = 0;
		if(value % 3 == 0) {
			if(value % 6 == 0) {
				ret = 3;
			}else {
				ret = 5;
			}
		}
		// ���ǹ��� �߰���  value�� 4�� ��� �̸� ret�� 4�� �����ϴ� �ڵ� �߰� 
		else if(value % 4 == 0) ret = 4;
		else ret = -1;
		// ��� ��ȯ
		return ret;
	}

	public static void main(String[] args) {
		// if��
		/* if (���ǹ�){
		 *  ���̸�  ({}) �ȿ� ����
		 *  }
		 * */
		if (true) {
			System.out.println("TRUE");		// ����
		}
		if (false) {
			System.out.println("FALSE");	// ������� ����
		}
		
		// if ~ else
		int i = 4;
		if(i*2 > 5) {
			System.out.println("FALSE");	// ����
		}else {
			System.out.println("TRUE");		// �̽���
		}
		
		// if~ else if~ else if~.... else
		int score = 89;
		char grade = 'F';	// char : ���� ����
		
		if(score >= 90) {
			grade = 'A';	
		}else if(score >= 80){
			grade = 'B';		
		}else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.println("grade : "+ grade);
		
		boolean isSuccess = false;
		
		if(!isSuccess) {	// isSuccess == true
			System.out.println("true");
		}
		
		int x = 3;
		// x > 1 : true -> !(x>1) : false -> if(false){//todo}
		if(!(x>1)) {
			System.out.println("truex");
		}else {
			System.out.println("x>!");
		}
		
		if(isSuccess && (x>1)) {	// f && t -> false , �̽���
			System.out.println("isSuccess && (x>1)");
		}else {
			System.out.println("true");
		}
		
		if(isSuccess || (x>1)) {	// f || t -> true , ����
			System.out.println("isSuccess || (x>1)");
		}else {
			System.out.println("true");
		}
		
		
		System.out.println(conditionTest(6));	// 3
		System.out.println(conditionTest(5));	// -1
		
		
		
		
		
		
		
	}

}
