package com.itbank.java.other;

import com.itbank.java.same.*;

class A{
	
}
class B{
	
}

public class ClassAccessDemo2 {

	PublicClass pp = new PublicClass();
	// DefaultClass dd = new DefaultClass();	// 접근 불가능
	// 다른패키지에서 접근시에는 public만 가능
	// default 클래스는 같은 패키지 내에서만 사용 가능
	
	// 패키지내에 default 클래스는 여러개 만들수 있지만,
	// public 클래스가 포함된 소스코드는 public 클래스의 클래스명과 소스코드의 파일명이 같아야 함.
	// 하나의 소스코드 내에는 하나의 public 클래스만 존재가능 

	
	
}
