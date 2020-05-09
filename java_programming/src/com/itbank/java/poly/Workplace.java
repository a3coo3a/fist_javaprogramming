package com.itbank.java.poly;

interface programmer{
	public void coding();
}
interface tutor{
	public void tutoring();
}
interface youtuber{
	public void fliming();
}
class Jack implements programmer, tutor{		//전업이 프로그래머, 부업이 튜터라고 가정
	public void coding() {
		System.out.println("takes 2 days");
	}
	public void tutoring() {
		System.out.println("teaches kids");
	}
}
class Jenny implements programmer, youtuber{	//전업이 프로그래머, 부업이 유튜버라고 가정
	public void coding() {
		System.out.println("takes 3 days");
	}
	public void fliming() {
		System.out.println("fliming video");
	}
}
public class Workplace {	// 직장

	public static void main(String[] args) {
		// 현재 Workplace, 즉 직장이라는 곳에서 각 직원을 만들어 내고 있기 때문에
		// 본업인 프로그래머 이외의 기능은 필요가 없음
		// 따라서 인터페이스 중 programmer로 데이터 타입을 지정하면 다른 인터페이스에서의 기능이 어떻든 상관이 없어짐
		programmer emp1 = new Jack();
		programmer emp2 = new Jenny();
		
		// coding 을 두 직원에게 요청함
		emp1.coding();
		emp2.coding();
		//emp1.tutoring();  // 에러
		//emp2.fliming();	// 에러
		
		// 만약, 직장이 아닌 집이라면 본업과 부업모두 가지게 되므로
		Jack jack = new Jack();		// 코딩, 튜터링 가능
		Jenny jenny = new Jenny();	// 코딩, 필리밍 가능
		
	}

}
