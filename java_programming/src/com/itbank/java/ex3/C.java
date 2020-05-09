package com.itbank.java.ex3;

//import com.itbank.java.ex1.*;
//import com.itbank.java.ex2.*;

// 자바가 자동으로 import 해주는 패키지
import java.lang.*;	//  덕분에 System class 사용가능
// - 자바를 이용하는데 필수적이고 자주 이용하는 클래스


public class C {

	public static void main(String[] args) {

		// B b = new B();
		// 에러 발생
		// The type B is ambiguous // 모호하다
		// 해결방법 : 명시적으로 특정 클래스 지정		
		com.itbank.java.ex1.B b = new com.itbank.java.ex1.B();
		
		System.out.println(1);
		// println(1) --> 매개변수를 갖는 메소드
		// System  -- > 클래스명
		// out  --> System 클래스의 멤버중 하나인 변수
		// 클래스를 사용하기 위해서는 인스턴스화를 시켜주는 것이 필수
		// out -> 인스턴스화가 필요없는 static 이다!
		// static : 불필요한 인스턴스의 생성을 방지하기 위한 키워드
	}
		// java.lang : 자바 프로그래밍을 위한 가장 기본적인 패키지와 클래스를 포함하고 있음
		// java.util : 프로그램을 제어하기 위한 클래스와 데이터를 효율적으로 저장하기 위한 클래스를 담고 있음
		// java.io  : 키보드, 모니터, 프린터, 파일등을 제어할 수 있는 클래스의 모음
		// java.net : 통신을 위한 기능들을 담고 있음
}
