package com.itbank.java.abstracts;


// �߻�ȭ
// - �߻�Ŭ���� ���� �߻� �޼ҵ� ����
// - �߻�޼ҵ�� ��ü�� ���� �� ����
// �߻� Ŭ������ ����ϴ� ����?
// - ����� �����ϱ� ����
// - Ex�߻�Ŭ������ ���Ǹ� �Ͽ��ٱ� ���� �߻�޼ҵ带 ���� �Ͽ��ٰ� �����ϸ� ��
// - �Ϲ� �޼ҵ嵵 �߻�Ŭ���� ���� ���� �Ҽ� ����.
// - ��, �߻� �޼ҵ�� ��� �� '�������̵�' �ʼ�!

abstract class Ex{
	// final : ���, ������ �����ϴ� ���� / �ٲ� �� ���� �� ->������� ���Ǵ� Ű����
	// ����Ʈ ���������ڸ� ������ ����.
	// final int BASE = 10;
	// final ������ �Ϲ��� ���� : public static final
	// public - ��𼭵� ���� ������ ������
	// static - Ŭ���� ���� ����
	public static final int BASE = 10;	// ���
		
	public abstract int b();
	
	// public abstract void c() {System.out.println("hello");}
	// ���� - �߻�ȭ �޼ҵ�� ��ü�� ���� �� �����Ƿ� 

	public void d() {
		//BASE = 20; // �Ұ���
		System.out.println("hello");
	}
}


// b() �޼ҵ�� �߻� �޼ҵ�
// �߻�޼ҵ��� Ư¡ 
// - �߰�ȣ�� �����ϴ� ��ü�� �������� ����
// - ��ü���� ������ ��� �ִ� ��ü�� ����, �ñ״�ó���� �����ִ� �޼ҵ�

class B extends Ex{
	// �޼ҵ带 �ݵ�� '�������̵�'�Ͽ� ��ü���� ������ �����Ͽ��� ��
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// Ex obj = new Ex();	// �ν��Ͻ�ȭ ����
		// �߻� Ŭ������ �ݵ�� ����ؼ� ����ؾ� ��. - �׷��� ������ �߻��� ����
		
		B obj = new B();
		System.out.println(obj.b());
		
		
		
		
		
	}

}
