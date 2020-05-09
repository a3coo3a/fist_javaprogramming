package com.itbank.java.day03;

class Calculator7{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public int avg() {
		return (left+right)/2;
	}
}

class OverrideCalc extends Calculator7{
	public void division() {
		System.out.println(left/right);
	}
	
	@Override
	public int avg() {
		// �θ�Ŭ������ �ִ� �޼ҵ带 �״�� ������ ����ϰڴ�. 
		// �θ�޼ҵ忡 ���ǵǾ� �ִ� �޼ҵ� ȣ��
		// super Ű���带 Ȱ���� �������̵�
		// - superŰ���� �ؿ� ���� �߰��ϸ� �߰� ��� ���� ����
		return super.avg();		
	}
	
}

public class OverridingDemo3 {

	public static void main(String[] args) {
		OverrideCalc calc = new OverrideCalc();
		calc.setOprands(10, 5);
		calc.sum();
		System.out.println(calc.avg());
		calc.division();
	}
	
	// �������̵�
	// - �޼ҵ��� ������ ���� �ؾ� �Ѵ�.
	// 		-> �޼ҵ��� �̸�/ �Ű������� ����,������Ÿ��,����/ ����Ÿ��
	// - ���� ������ �ȿ� ������ �ٸ����� �������̵��̴�.
	// - �θ�Ŭ������ ������ �ִ� ����� �ʿ信 ���� �����ϴ� ��.
	// - �ڽĸ޼ҵ尡 �θ�޼ҵ带 ȣ���ϱ� ���ؼ��� superŰ���� ���
	

}
