package com.itbank.java.day03;

// OverloadingDemo 코드 개선하기
class Calculator9{
	int[] oprands;	// 배열
	
	// 매개변수로 배열사용
	// 이렇게 사용하면 하나의 인자로 여러개의 값을 받을 수 있다는 장점이 있다.
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum() {
		int total = 0;
		// for - each문 : 배열에 있는 값을 하나씩 다 꺼내 보자
		for(int value: this.oprands) {
			total += value;
		}
		System.out.println(total);
	}
	public void avg() {
		int sum = 0;
		//int count =0;
		for(int value: this.oprands) {
			sum += value;
			//count++;
		}
		//System.out.println(sum/count);
		System.out.println(sum/this.oprands.length);
	}
}

public class OverloadingDemo4 {

	public static void main(String[] args) {
		Calculator9 c1 = new Calculator9();
		
		c1.setOprands(new int[] {10,20});
		c1.sum();	// 30
		c1.avg();	// 15
		c1.setOprands(new int[] {10,20,30});
		c1.sum();	// 60
		c1.avg();	// 20
	}

}
