package com.itbank.java.day03;

class Calculator3 {
	int left, right;
	
	public Calculator3() {}
	
	public Calculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	/*public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}*/
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class AddSubstractCalculator3 extends Calculator3{
	/*public AddSubstractCalculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}*/
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class ConstructorDemo3 {

	public static void main(String[] args) {
		/*
		 * 생성자 이해해보기
		 * 1. 부모클래스에 사용자정의생성자가 있는데 자식클래스에 사용자정의생성자가 없는 경우
		 * 2. 부모클래스에 사용자정의생성자가 없는데 자식클래스에 사용자정의생성자가 있는 경우
		 * 3. 부모클래스, 자식클래스 각각에 사용자정의생성자가 있는 경우
		 * 
		 * 에러가 발생한다면 -> 에러 해결방법
		 * 제대로 실행된다면 -> 그 이유는?
		 * */
		
		// 1.
		//AddSubstractCalculator3 cc = new AddSubstractCalculator3();
		//cc.sum();
		//cc.avg();
		//cc.substract();
		// error
		// Implicit super constructor Calculator3() is undefined for default constructor. 
		//	부모에 기본생성자가 없다
		// Must define an explicit constructor
		//  생성자를 생성해야 한다.
		// 해결 : 부모클래스에 기본생성자 생성, 실행은 되나 초기값을 따로 입력하지 않아 결과값 0
		
		// 2.
		//AddSubstractCalculator3 cc = new AddSubstractCalculator3(5, 10);
		//cc.sum();
		//cc.avg();
		//cc.substract();
		// 이유 ? 부모에게는 기본생성자가 생성 되었고, 자식에게는 부모가 기본생성자가 있어서 필요 없나?
		
		//3. 
		//AddSubstractCalculator3 cc = new AddSubstractCalculator3(10,20);
		//cc.sum();
		//cc.avg();
		//cc.substract();
		// 에러
		// Implicit super constructor Calculator3() is undefined. 
		// Must explicitly invoke another constructor
		
		
		// Q1. 부모만 항상 기본생성자가 있어야 하나? 
		// Q2. 기본생성자는 필수 인건가?
		
		
	}

}
