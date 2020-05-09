package com.itbank.java.exceptions;

// Exception : 예외

class Calculator {
	int left, right;
	public void setOprands (int left, int right) {
		this.left = left;
		this.right = right;
	}
	// 에러 : java.lang.ArithmeticException: / by zero
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다");
		}catch(Exception e){	// 매개변수로 에러에 대한 정보를 담고 있는 객체 전달
			// 데이터 타입은 Exception이라는 클래스
			System.out.println("오류발생!! "+ e.getMessage());
			System.out.println("e.toString: "+e.toString());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
			
			// 1. e.getMessage() : / by zero
			// 2. e.toString() : java.lang.ArithmeticException: / by zero
			// 3. e.printStackTrace() 
			//    : java.lang.ArithmeticException: / by zero
			//		at com.itbank.java.exceptions.Calculator.divide(CalculatorDemo.java:15)
			//		at com.itbank.java.exceptions.CalculatorDemo.main(CalculatorDemo.java:31)
			
			// 1. 오류에 관한 기본내용 출력, 상세하지 않음
			// 2. 예외상황에 대한 좀 더 자세한 정보 출력 (ArithmeticException: 수학적 계산과정의 예외)
			// 3. 리턴값이 별도로 없음, 가장 구체적인 예외정보 내용 출력
		}
			
	}
}
public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
				
	}
	
}
