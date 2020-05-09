package com.itbank.java.interfaces;

class E{
	public String x() {
		return "E.x";
	}
}
class F extends E{
	public String x() {
		return "F.x";
	}
	public String y() {
		return "y";
	}
}
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		E obj = new F();		//  ������ Ÿ���� �θ�� �ص� ������ ���� ����.
		// Ŭ���� F�� �ν��Ͻ��� ���������, �̴� Ŭ���� E ������ Ÿ���� �༼�� �ϰ� �ִ� ��.
		obj.x();
		//obj.y();	// ������ Ÿ���� �θ�Ŭ����(E)�� �ڽ�Ŭ����(F)�� �ִ� y�� ȣ����� ����.
		System.out.println(obj.x());
		
		// ���,
		// Ŭ������ �ν��Ͻ�ȭ �� �� �ν��Ͻ��� ��� ������ ������ Ÿ���� �ش� Ŭ������ �� ���� �ְ� 
		// �� Ŭ������ �θ�Ŭ������ �� ���� ����
		
		// �������̵� �Լ� -> �ڽ�Ŭ������ �޼ҵ� ȣ��
		// �ᱹ���� EŬ���� �༼�� �ϰ� ������, �޼ҵ� x��� ����? F�� ����̴�.
				
		// ���, 
		// - Ŭ����F���� �߰������� ������ �޼ҵ�(y())�� ������� �ʴ´ٴ� ��
		// - �������̵��� �޼ҵ尡 �ִٸ� �ν��Ͻ�ȭ ��Ų Ŭ������ �޼ҵ带 �����Ŵ
		
		
	}

}
