package com.itbank.java.interfaces;

class X {
	public String a() {
		return "X.a";
	}
}
class Y extends X {
	public String a() {
		return "Y.a";
	}
	public String b() {
		return "b";
	}
}
class Y2 extends X{
	public String a() {
		return "Y2.a";
	}
}
// Ŭ������ ������
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		X obj = new Y();
		X obj2 = new Y2();
		
		System.out.println(obj.a());
		System.out.println(obj2.a());
		
		//System.out.println(obj.b()); // ���� , ������ Ÿ���� �θ�Ŭ���� �̱� ������ �ڽ�Ŭ������ �ִ� b�� ȣ���� �� ����.
				
		
		// �������� ����
		// - ������ ������Ÿ������ �����ϸ鼭�� 
		//   ������ Ŭ������ �ҼӵǾ� �ִ� �޼ҵ��� ���۹�Ĵ�� �����ϰ� ����
		
	}

}
