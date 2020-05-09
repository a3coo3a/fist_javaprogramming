package com.itbank.java.eclipse;

public class Num {

	public static void main(String[] args) {
		int age = 10;
		long countofstar = 123456432416843541L;
		
		double a = 3.14;
		float b = 3.14f;
		double c = 1.234e2; 	// 지수표현식 10^2
		
		int num1 = 11;
		int num2 = 5;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);	// 소수점 이하 발생시 나머지는 버려짐
		System.out.println(num1%num2);	// 나머지
		
		// 증감연산
		int i = 0;
		i++;	// i를 1증가
		
		int j = 10;
		j--;	// j를 1감소
		
		System.out.println(i);
		System.out.println(j);
		System.out.println();
		
		int k = 0;
		System.out.println(k++);	// 결과 : 0	
		// k++ 해당코드가 실행되는 순간에는  k값이 변경되지 않음.
		// 코드가 실행이 된 후 변경 -> 값이 참조된 이후에 증가.
		System.out.println(k);		// 결과 : 1
		
		System.out.println(++k);	// 결과 : 2
		// 증가 시킨 후에  k값 출력
		System.out.println(k);		// 결과 : 2
		
		
		
		
		
		
		
		
		
		
		
	}

}
