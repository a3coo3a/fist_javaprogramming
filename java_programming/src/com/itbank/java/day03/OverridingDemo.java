package com.itbank.java.day03;

// Overriding(�������̵�) : �޼ҵ� ������
// - �θ� ������ �޼ҵ� �߿��� �ڽ�Ŭ�������� �� ����� ����������ν�
// 	  �ڽ�Ŭ������ �������� �޼ҵ带 �����ؾ� �ϴ� ���
// - ��ӵ� �޼ҵ���� ������ : ��� -> ��ӵ� �޼ҵ� + �߰����
//					�������̵� -> ��ӵ� �޼ҵ� + ��ӵ� �޼ҵ��� ����(������Ͽ� ������) + �߰����
// - �޼ҵ带 �������̵��� �� ȣ���ϰԵǸ�, �θ�Ŭ������ �ִ� �޼ҵ�� ���ð� �ǰ� �ڽ�Ŭ������ �żҵ� ����
// - �θ�Ŭ������ �żҵ庸�� ���� �켱������ �����Ѵ�.


class Calculator5{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println("����? " + (this.left + this.right));
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}
class SubstractClass extends Calculator5{
	@Override // ������̼� : �������̵��� �޼ҵ����� ǥ��
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		SubstractClass c1 = new SubstractClass();
		c1.setOprands(10, 20);
		c1.sum();
		
		Calculator5 c2 = new Calculator5();
		c2.setOprands(10, 20);
		c2.sum();
		
		
	}

}
