package com.itbank.java.day03;

// ��� : �����شٴ� �ǹ�
// � ��ü�� ���� �� �� ��ü�� �ʵ�(����)�� �޼ҵ带 �ٸ� ��ü�� �������� �� �ִ� ���
// ����, �޼ҵ� -> ��ü�� ���
// �ϳ��� Ŭ������ �������� �ڽ�Ŭ������ ���� �� �ִ�.

// class Calculator (extends Object) �κ��� �����Ǿ� ����.
// Object : ��� Ŭ������ ����� ����, �ֻ���� Ŭ����
// �ƹ��͵� ��ӹް� ���� �ʴٸ�, �Ϲ������� objectŬ������ �ڵ� ��� �ް� ��. 
// https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
// object Ŭ������ �żҵ���� ��ӹ޾Ƽ� ����� �� �ִٴ� �ǹ�

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
// class �ڽ�Ŭ������ extends �θ�Ŭ������{}	//extend - (�������)Ȯ���ϴ�
class AddSubstractCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

// Calculator �� ��ӹ޴� ���� Ŭ����
class AddMultiplyCalculator extends Calculator{
	public void multiply() {
		System.out.println(this.left*this.right);
	}
}
// ��� ���� �ڽ� Ŭ������ �� ��� �޾� ��� ����
class AddDevisionCalculator extends AddSubstractCalculator{
	public void devision() {
		System.out.println(this.left/this.right);
	}
}

// ������ ��ɰ�, multiply ����� �� �� �����鼭,
// left���� right������ ���������� ������ ��� ������ ��� ���� Ŭ���� ����
class AddRemainderCalculator extends AddMultiplyCalculator{
	public void remainder() {
		System.out.println(this.left%this.right);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();	// c1  �ν��Ͻ� ����
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		System.out.println();
		
		AddSubstractCalculator c2 = new AddSubstractCalculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		c2.substract();
		System.out.println();
		
		AddMultiplyCalculator c3 = new AddMultiplyCalculator();
		c3.setOprands(3, 4);
		c3.multiply();
		System.out.println();
		
		AddDevisionCalculator c4 = new AddDevisionCalculator();
		// Calculator���� ���
		c4.setOprands(10, 20);
		c4.sum();
		c4.avg();
		// AddSubstractCalculator���� ���
		c4.substract();
		// ��� �߰�
		c4.devision();
		System.out.println();
		
		// ���
		// - ���Ӿ��� ��� ���踦 �̾� ���� �� ����.
		
		AddRemainderCalculator c5 = new AddRemainderCalculator();
		c5.setOprands(7, 11);
		c5.sum();
		c5.avg();
		c5.multiply();
		c5.remainder();
		
		// ����� ȿ��
		// 1. �ߺ��� ���� : �θ� ������ �ִ� ����� �ڽ��� �� ���� �ʿ䰡 ����.  --> �ڵ��� ��Ȱ�뼺 ����
		// 2. �ڵ��� ��Ȱ�뼺�� ���� �ȴ�.  --> �������� ����, ������ ����
		// 3. ���� ������ ���Ǽ� ����
		// 		- �θ�Ŭ������ �����ϰ� �Ǹ�, �̸� ��ӹް� �ִ� �ڽ� Ŭ�������� ������ �κ��� �ڵ����� ����ȴ�.
		// 4. ������ ����
		//		- Ŭ������ ������ �ִ� �ֿ� ����� ������ ������ �ڵ�� �θ𿡰� ����.
		
		
		
		
	}

}
