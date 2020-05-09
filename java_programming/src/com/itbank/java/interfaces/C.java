package com.itbank.java.interfaces;


// 인터페이스도 상속이 가능할까?
// -> 가능하다!
// 상속받은 부모클래스의 인터페이스내 메소드 또한 구현해 주어야 함.


interface I3{
	public void x();
}
interface I4 extends I3{
	public void y();
}

public class C implements I4 {
	public void y() {}
	public void x() {}
	// 상속 받은 메소드 또한 구현해 주어야 함.
}

// 인터페이스 규칙
// 1. 하나의 클래스가 여러개의 인터페이스 구현 가능
// 2. 인터페이스도 상속이 된다.
// 3. 인터페이스는 반드시 public를 가져야 한다.

