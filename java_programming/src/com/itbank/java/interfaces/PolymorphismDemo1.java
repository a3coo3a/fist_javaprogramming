package com.itbank.java.interfaces;

class E{
	public String x() {
		return "E.x";
	}
}
class F extends E{
	public String x() {
		return "F.x";
	}
	public String y() {
		return "y";
	}
}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		E obj = new F();		//  데이터 타입을 부모로 해도 에러가 나지 않음.
		// 클래스 F로 인스턴스를 만들었지만, 이는 클래스 E 데이터 타입의 행세를 하고 있는 것.
		obj.x();
		//obj.y();	// 데이터 타입이 부모클래스(E)라서 자식클래스(F)에 있는 y가 호출되지 않음.
		System.out.println(obj.x());
		
		// 결론,
		// 클래스를 인스턴스화 할 때 인스턴스를 담는 변수의 데이터 타입은 해당 클래스가 될 수도 있고 
		// 그 클래스의 부모클래스가 될 수도 있음
		
		// 오버라이딩 함수 -> 자식클래스의 메소드 호출
		// 결국에는 E클래스 행세를 하고 있지만, 메소드 x라는 것은? F의 멤버이다.
				
		// 결론, 
		// - 클래스F에서 추가적으로 정의한 메소드(y())는 실행되지 않는다는 것
		// - 오버라이딩한 메소드가 있다면 인스턴스화 시킨 클래스의 메소드를 실행시킴
		
		
	}

}
