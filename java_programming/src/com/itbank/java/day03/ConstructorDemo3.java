package com.itbank.java.day03;

class Calculator3 {
	int left, right;
	
	public Calculator3() {}
	
	public Calculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	/*public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}*/
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class AddSubstractCalculator3 extends Calculator3{
	/*public AddSubstractCalculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}*/
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class ConstructorDemo3 {

	public static void main(String[] args) {
		/*
		 * ������ �����غ���
		 * 1. �θ�Ŭ������ ��������ǻ����ڰ� �ִµ� �ڽ�Ŭ������ ��������ǻ����ڰ� ���� ���
		 * 2. �θ�Ŭ������ ��������ǻ����ڰ� ���µ� �ڽ�Ŭ������ ��������ǻ����ڰ� �ִ� ���
		 * 3. �θ�Ŭ����, �ڽ�Ŭ���� ������ ��������ǻ����ڰ� �ִ� ���
		 * 
		 * ������ �߻��Ѵٸ� -> ���� �ذ���
		 * ����� ����ȴٸ� -> �� ������?
		 * */
		
		// 1.
		//AddSubstractCalculator3 cc = new AddSubstractCalculator3();
		//cc.sum();
		//cc.avg();
		//cc.substract();
		// error
		// Implicit super constructor Calculator3() is undefined for default constructor. 
		//	�θ� �⺻�����ڰ� ����
		// Must define an explicit constructor
		//  �����ڸ� �����ؾ� �Ѵ�.
		// �ذ� : �θ�Ŭ������ �⺻������ ����, ������ �ǳ� �ʱⰪ�� ���� �Է����� �ʾ� ����� 0
		
		// 2.
		//AddSubstractCalculator3 cc = new AddSubstractCalculator3(5, 10);
		//cc.sum();
		//cc.avg();
		//cc.substract();
		// ���� ? �θ𿡰Դ� �⺻�����ڰ� ���� �Ǿ���, �ڽĿ��Դ� �θ� �⺻�����ڰ� �־ �ʿ� ����?
		
		//3. 
		//AddSubstractCalculator3 cc = new AddSubstractCalculator3(10,20);
		//cc.sum();
		//cc.avg();
		//cc.substract();
		// ����
		// Implicit super constructor Calculator3() is undefined. 
		// Must explicitly invoke another constructor
		
		
		// Q1. �θ� �׻� �⺻�����ڰ� �־�� �ϳ�? 
		// Q2. �⺻�����ڴ� �ʼ� �ΰǰ�?
		
		
	}

}
