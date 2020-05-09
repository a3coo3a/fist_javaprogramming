package com.itbank.java.eclipse;

public class Strings {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "123";
		
		System.out.println(str1+" "+str2);
		
		// new : 새로운 객체 만들때 사용
		// 객체  : 새로 생성된 자료형...
		String str3 = new String("Hello world");
		String str4 = new String("Hello world");
		
		System.out.println(str3 == str4); 		// false	// 위치를 찾아가는 때문에 다르다고 도출됨
		System.out.println(str3.equals(str4));	// true		// equals는 내용물 값을 비교하기에 같다고 도출됨
	
		String a = "Hello Java";
		// indexOf : 문자열에서 특정 문자가 시작되는 인텍스 리턴
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java","world"));
		System.out.println(a.substring(0,4));	// 첫지점은 포함 끝지점은 포함하지 않음.
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}

}
