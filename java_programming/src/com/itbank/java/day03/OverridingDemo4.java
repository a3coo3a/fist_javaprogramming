package com.itbank.java.day03;

class OverrideCalc2 extends Calculator7{		// ctrl 누른체로 Calculator7에 가져다 대면 링크화 되어 정의 되어 있는 곳으로 이동
	@Override
	public int avg() {
		return (super.avg()+left+right);
	}
}
	
public class OverridingDemo4 {

	public static void main(String[] args) {
		OverrideCalc2 calc = new OverrideCalc2();
		calc.setOprands(10, 7);
		System.out.println(calc.avg());
	}

}
