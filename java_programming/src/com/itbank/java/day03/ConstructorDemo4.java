package com.itbank.java.day03;
class Calculator4 {
	int left, right;
	
	// public Calculator4() {}
	public Calculator4(int left, int right) {
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
class AddSubstractCalculator4 extends Calculator4{
	public AddSubstractCalculator4(int left, int right) {
		// �θ�Ŭ������ �����ڿ��� left, right���� ����
		// �θ�Ŭ������ �����ڸ� �ڽ�Ŭ������ �����ڿ��� ȣ���ؼ� �����Ű�� �ִ�.
		super(left, right);		// super(�θ�Ŭ����) = �θ������ ȣ��
		
		// �ڽ�Ŭ������ �߰��ϰ� ���� �ʱ�ȭ �ڵ� �Է� ����
		
		// ���� ���� : �ڽ� Ŭ������ �ʱ�ȭ �ڵ尡 super �������� ���� �����ؼ��� �ȵȴ�.
		// �θ�Ŭ���� ȣ�� �� �ڽ�Ŭ���� ���� �ۼ��ؾ���. 
		// why? �ڽ�Ŭ������ �ν��Ͻ�ȭ �ȴ� ��� ���� 
		//		��, �θ�Ŭ������ �̸� �ν��Ͻ�ȭ �� ���Ŀ� �ڽ�Ŭ������ �ν��Ͻ�ȭ �ȴٴ� �ǹ��̱� ������
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
public class ConstructorDemo4 {

	public static void main(String[] args) {
		AddSubstractCalculator4 c = new AddSubstractCalculator4(10,20);
		c.sum();
		c.avg();
		c.substract();
	}

}


// �θ�Ŭ������ �ڽ�Ŭ����, �׸��� ������
// 1. ��ü�� ������ �� �ݵ�� �����ڰ� ȣ��ȴ�.
// 2. �����(explicit)���� �����ڸ� �ۼ����� ������ ����Ʈ �����ڸ� ������(implicit)���� ���Եȴ�.
// 3. ��������� �����ڸ� �ۼ��ϸ� ����Ʈ �����ڴ� ���������� ���Ե��� �ʴ´�.
// 4. ��� Ŭ������ �ֻ��� �θ� Ŭ������  Object�̴�
// 5. �ƹ��� Ŭ������ ��ӹ��� ���� Ŭ������ ���������� extends Object�� �����Ѵ�.
// 6. �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.
// 7. �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ ������ ȣ���� �� ù�ٿ��� �ؾ��Ѵ�.
// 8. �����ڸ� ������ ȣ������ ������ ����Ʈ �θ� �����ڸ� ���������� ȣ��ȴ�.


