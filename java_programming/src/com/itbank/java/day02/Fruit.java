package com.itbank.java.day02;

public class Fruit {
	String name;
	int price = 0;

	public void setName(String name1) {
		// this는 해당 객체, 자기자신을 나타낸다.
		// 파라미터로 들어온 name과 객체 name의 이름이 동일하기 때문에 명확히 해주는 것
		//this.name = name;
		name = name1;		// 이름이 다를 경우 이렇게 사용 가능, 구독성때문에 위에 경우를 선호
	}
	
	public static void main(String[] args) {
		Fruit apple = new Fruit();
		System.out.println(apple.name);	// . : 도트 연산자, 객체가 보유한 속성에 접근 가능 
		apple.name = "사과";
		System.out.println(apple.name);
		apple.price = 990;
		System.out.println(apple.price);
		
		Fruit bnanan = new Fruit();
		bnanan.price = 1000;
		bnanan.name = "바나나";
		System.out.println(bnanan.name);
		System.out.println(bnanan.price);
		
		// 객체 변수는 공유되지 않는다.
		// 객체 변수의 값이 독립적으로 유지 된다. -> 클래스의 존재 이유
		
		apple.setName("맛있는 사과");
		System.out.println(apple.name);
		
		
		
		
		
	}

}
