package com.itbank.java.day03;

class OverrideCalc2 extends Calculator7{		// ctrl ����ü�� Calculator7�� ������ ��� ��ũȭ �Ǿ� ���� �Ǿ� �ִ� ������ �̵�
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
