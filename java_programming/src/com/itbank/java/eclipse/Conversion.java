package com.itbank.java.eclipse;

public class Conversion {

	public static void main(String[] args) {
		double a = 3.0f;	// double 타입이  float 타입크므로 자동형변환이 이루어짐.
		//float b = 3.0;	// error! 데이터 타입크기가 큰 double을 작은 float로 넣으려니 문제 발생
		
		/*자동형변환 : 표현범위가 좁은 데이터 타입에서 넓은 데이터타입으로 변환*/
		
		// 수동 형변환
		float c = (float)4.0009;	// 명시적 형변환
		int d = (int)100.0f;
		
		// 해보기
		long longVal = 10;
		// int형 변수  intVal 을 선언하고 longVal에 들어있는 값 할당
		int intVal = (int) longVal;	//long이 int보다 사이즈가 커서 ()를 통해 수동형변환
		System.out.println(intVal);
		
		// 상수
		final int BASE = 10;
		
	}

}
