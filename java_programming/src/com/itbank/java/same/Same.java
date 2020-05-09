package com.itbank.java.same;

// 접근제어자 - 클래스 멤버
public class Same {
	private void _private() {
		System.out.println("private");
	}
	// default : 접근제어자를 명시하지 않는 경우
	void _default() {
		System.out.println("default");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}
	
	
}
