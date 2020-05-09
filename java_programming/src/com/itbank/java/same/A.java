package com.itbank.java.same;

public class A {
	// public int num;		// public 에서 public 변수를 선언하는 것을 금지.
	
	// 아래와 같이 하는 것을 선호함.
	private int num;
	// getter와 setter 라고 하여 보편화 되어 있음.
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
	

}
