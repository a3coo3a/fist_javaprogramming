package com.itbank.java.day04;

class Calculator{
	private int left, right;	// �ٸ� Ŭ�������� ���� ���� ����.
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int sum() {
		return this.left+this.right;
	}
	public void sumPlus() {
		System.out.println("++++ "+sum());
	}
	public void sumMinus() {
		System.out.println("---- "+sum());
	}
	
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		// c1.sum(); private ������ ���� �Ұ���
		c1.sumPlus();
		c1.sumMinus();
		
		// ���� ����� �Ͼ�� �κ��� private���� �����ؼ� 
		// ����ڵ��� ���� �޼ҵ忡 ���� �����ϴ� ���� ������ �� ����.
		
		// ���������� private�� ����
		// private�� �ƴ� ��� c1.left = 100; ���� �� ������ ����
		// ������ ���� �����ϰ� �Ǹ� ����ڰ� �Է��ϴ� ���� ���� �� ���� ���� ��.
		// ex, �Է°��� ������� �ϴ� ������ �ִٰ� �����Ѵٸ�,
		// public������ ���� ����ڰ� ������ �Է��ص� ���� �� ���� ����.
		// ����, ����ڰ� �������� ���ϵ��� ������ ������ �ٶ� private�� ����
		
		// ����, ����ڰ� �ǵ����� ���� ������� �������� ����, �޼ҵ��� ���¸� �����ϴ� ���� �����ϱ� ����.
		// ����� ���忡����, sum�̶�� private�޼ҵ忡 �������� ���ϱ� ������
		// �Ű澲�� �ʾƵ� ��.
		// �ᱹ, �� ���⸦ ����Կ� �־ �˾ƾ��� ������ �پ��.
		
	}

}
