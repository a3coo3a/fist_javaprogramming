package com.itbank.java.day03;

// 오버라이딩을 위한 제약사항
class Calculator6{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println("합은? " + (this.left + this.right));
	}
	
	public int avg() {
		return (this.left+this.right)/2;
	}
}

class SubstractCalc extends Calculator6 {
	@Override
	public int avg() {
		return (this.left+this.right)/2;
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class OverridingDemo2 {

	public static void main(String[] args) {
		SubstractCalc c = new SubstractCalc();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		// The return type is incompatible with Calculator6.avg()
		// 자식클래스의 avg()의 리턴타입(void)이 부모클래스의 avg()의 리턴타입(int)과 호환되지 않는다.
		// 따라서, 오버라이딩을 할때, 리턴타입이 달라지는 것은 불가능.
		// cf)) 매개변수 또한 달라지는 것은 불가능
	}

}
