package com.itbank.java.ex2;
// import
// - 다른 패키지의 것을 로드 할수 있도록 하는 것
// - '*' 의 의미 : 패키지 안에 있는 모든 클래스를 가져옴.(와일드카드)
// - ex) import com.itbank.java.ex1.*;

import com.itbank.java.ex1.A;	// 특정 클래스만 포함시킴

public class B {
	// 같은 이름의 클래스가 있지만 패키지가 달라 오류가 발생하지 않음

	public static void main(String[] args) {
		// 다른 패키지에 있는 클래스 파일을 로드하는 것은 불가능.
		A a = new A();	// 에러발생
	}
	// 수동 컴파일시
	// javac 패키지경로/소스코드이름.java -d bin 
	//   : 클래스 파일이 자동으로 bin디렉터리 아래에 생성
}
