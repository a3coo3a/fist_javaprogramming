package com.itbank.java.interfaces;

// ������ (polymorphism)
// - �ϳ��� �޼ҵ尡 Ŭ������ ���� �� �̰͵��� �پ��� ������� �����ϴ� ��
// - �޼ҵ�� �����ϳ� �� ��û�� �޴� ����Ŭ������ ���� ���۹���� �޶����� ��
//   ex) �����̴� -> �� ���, ���ư��� ���� / �����̶��, �پ�� ����
// - ���� ���� ������ �����ε�
// - ���� �޼ҵ������� �Ű������� ���Ŀ� ���� �ٸ� ���� ���� ����

class D{	// ���� �ε�
	public void a(int param) {
		System.out.println("���� ��� "+ param);
	}
	public void a(String param) {
		System.out.println("������� "+param);
	}
}
// �޼ҵ�� ������
public class PolymorphismDemo {

	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");
	}

}
