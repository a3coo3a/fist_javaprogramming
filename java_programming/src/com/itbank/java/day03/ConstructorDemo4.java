package com.itbank.java.day03;
class Calculator4 {
	int left, right;
	
	// public Calculator4() {}
	public Calculator4(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
class AddSubstractCalculator4 extends Calculator4{
	public AddSubstractCalculator4(int left, int right) {
		// 부모클래스의 생성자에게 left, right값을 전달
		// 부모클래스의 생성자를 자식클래스의 생성자에서 호출해서 실행시키고 있다.
		super(left, right);		// super(부모클래스) = 부모생성자 호출
		
		// 자식클래스의 추가하고 싶은 초기화 코드 입력 가능
		
		// 주의 사항 : 자식 클래스의 초기화 코드가 super 구문보다 먼저 등장해서는 안된다.
		// 부모클래스 호출 후 자식클래스 내용 작성해야함. 
		// why? 자식클래스가 인스턴스화 된다 라는 말은 
		//		즉, 부모클래스가 미리 인스턴스화 된 이후에 자식클래스가 인스턴스화 된다는 의미이기 때문에
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
public class ConstructorDemo4 {

	public static void main(String[] args) {
		AddSubstractCalculator4 c = new AddSubstractCalculator4(10,20);
		c.sum();
		c.avg();
		c.substract();
	}

}


// 부모클래스와 자식클래스, 그리고 생성자
// 1. 객체가 생성될 때 반드시 생성자가 호출된다.
// 2. 명시적(explicit)으로 생성자를 작성하지 않으면 디폴트 생성자를 묵시적(implicit)으로 포함된다.
// 3. 명시적으로 생서자를 작성하면 디폴트 생서자는 묵시적으로 포함되지 않는다.
// 4. 모든 클래스의 최상위 부모 클래스는  Object이다
// 5. 아무런 클래스도 상속박지 않은 클래스는 묵시적으로 extends Object로 동작한다.
// 6. 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출해야 한다.
// 7. 자식 클래스의 생성자에서 부모 클래스의 생성자 호출은 맨 첫줄에서 해야한다.
// 8. 생성자를 별도로 호출하지 않으면 디폴트 부모 생성자를 묵시적으로 호출된다.


