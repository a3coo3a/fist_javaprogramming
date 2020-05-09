package com.itbank.java.day03;

class Calculator7{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public int avg() {
		return (left+right)/2;
	}
}

class OverrideCalc extends Calculator7{
	public void division() {
		System.out.println(left/right);
	}
	
	@Override
	public int avg() {
		// 부모클래스에 있는 메소드를 그대로 가져다 사용하겠다. 
		// 부모메소드에 정의되어 있는 메소드 호출
		// super 키워드를 활용한 오버라이딩
		// - super키워드 밑에 로직 추가하면 추가 기능 개발 가능
		return super.avg();		
	}
	
}

public class OverridingDemo3 {

	public static void main(String[] args) {
		OverrideCalc calc = new OverrideCalc();
		calc.setOprands(10, 5);
		calc.sum();
		System.out.println(calc.avg());
		calc.division();
	}
	
	// 오버라이딩
	// - 메소드의 서명이 동일 해야 한다.
	// 		-> 메소드의 이름/ 매개변수의 갯수,데이터타입,순서/ 리턴타입
	// - 모든게 같지만 안에 내용이 다른것이 오버라이딩이다.
	// - 부모클래스가 가지고 있는 기능을 필요에 따라 변경하는 것.
	// - 자식메소드가 부모메소드를 호출하기 위해서는 super키워드 사용
	

}
