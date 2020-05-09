package com.itbank.java.eclipse;

public class IfDemo {
	public static int conditionTest(int value) {
		// value 값이 선언되어 있다고 가정
		int ret = 0;
		if(value % 3 == 0) {
			if(value % 6 == 0) {
				ret = 3;
			}else {
				ret = 5;
			}
		}
		// 조건문을 추가해  value가 4의 배수 이면 ret에 4를 저장하는 코드 추가 
		else if(value % 4 == 0) ret = 4;
		else ret = -1;
		// 결과 반환
		return ret;
	}

	public static void main(String[] args) {
		// if문
		/* if (조건문){
		 *  참이면  ({}) 안에 실행
		 *  }
		 * */
		if (true) {
			System.out.println("TRUE");		// 실행
		}
		if (false) {
			System.out.println("FALSE");	// 실행되지 않음
		}
		
		// if ~ else
		int i = 4;
		if(i*2 > 5) {
			System.out.println("FALSE");	// 실행
		}else {
			System.out.println("TRUE");		// 미실행
		}
		
		// if~ else if~ else if~.... else
		int score = 89;
		char grade = 'F';	// char : 단일 문자
		
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
		
		if(isSuccess && (x>1)) {	// f && t -> false , 미실행
			System.out.println("isSuccess && (x>1)");
		}else {
			System.out.println("true");
		}
		
		if(isSuccess || (x>1)) {	// f || t -> true , 실행
			System.out.println("isSuccess || (x>1)");
		}else {
			System.out.println("true");
		}
		
		
		System.out.println(conditionTest(6));	// 3
		System.out.println(conditionTest(5));	// -1
		
		
		
		
		
		
		
	}

}
