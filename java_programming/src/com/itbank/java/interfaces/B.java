package com.itbank.java.interfaces;

// 하나의 클래스가 여러개의 인터페이스를 구현할 수 있을까?
// -> 가능하다! 
// - 각각의 인터페이스에 정의 되어 있는 메소드들을 해당클래스 내에서 모두 구현해 줘야 함.

interface I1{
	public void x();
}
interface I2{
	public void y();
}

public class B implements I1,I2 {

	public void x() {}
	public void y() {}
		
}
// 추상클래스와 인터페이스 차이
// - 추상클래스는 상속이 하나만 가능, 인터페이스는 여러개 구현 가능