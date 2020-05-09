package com.itbank.java.day04;

class Calculator{
	private int left, right;	// 다른 클래스에서 열람 되지 않음.
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int sum() {
		return this.left+this.right;
	}
	public void sumPlus() {
		System.out.println("++++ "+sum());
	}
	public void sumMinus() {
		System.out.println("---- "+sum());
	}
	
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		// c1.sum(); private 때문에 접근 불가능
		c1.sumPlus();
		c1.sumMinus();
		
		// 실제 계산이 일어나는 부분은 private으로 지정해서 
		// 사용자들이 내부 메소드에 직접 접근하는 것을 통제할 수 있음.
		
		// 전역변수가 private로 지정
		// private가 아닐 경우 c1.left = 100; 접근 및 변경이 가능
		// 변수를 직접 변경하게 되면 사용자가 입력하는 값을 통제 할 수가 없게 됨.
		// ex, 입력값이 양수여야 하는 조건이 있다고 가정한다면,
		// public변수일 때는 사용자가 음수를 입력해도 제어 할 수가 없음.
		// 따라서, 사용자가 접근하지 못하도록 변수를 선언해 줄때 private로 지정
		
		// 따라서, 사용자가 의도하지 않은 방법으로 내부적인 변수, 메소드의 상태를 변경하는 것을 방지하기 위함.
		// 사용자 입장에서도, sum이라는 private메소드에 접근하지 못하기 때문에
		// 신경쓰지 않아도 됨.
		// 결국, 이 계산기를 사용함에 있어서 알아야할 사항이 줄어듬.
		
	}

}
