package com.itbank.java.day03;
/* Overloading(�����ε�)
 * - �Ȱ��� ���۹��, �Ȱ��� ������ ������ ������, �Ű������� �޶����� ���� �ٸ� �̸��� ���� �� �ۿ� ���� ���� �ذ��� ���� ���
 * - �������̵����� �ٸ��� ��Ӱ��� ������ ����
 * - ����� ������ �Ű������� ���� ���� �޼ҵ���� �޶����� ����� ȥ���� �� -> ������ �̸����� ���� ȥ���� ���� �� ����.
 * - ���� �̸�, ���� ���� ����� ���� �޼ҵ带 ���� �̸����� ��������.
 * - �ڹٿ����� �޼ҵ��� �̸��� ���ٰ� �ϴ��� �޼ҵ��� �Ű������� ������ Ÿ���̳� �Ű������� �޶����� �ٸ� �޼ҵ�� �ν���.
 * 		-->> �׷��� ������ �����ε��� ����.
 * >> ���� �̸��� �޼ҵ带 ������ ���� �ϴ� ���
 * */
class Calculator8{
	int one, two;
	int three = 0;
	
	public void setOprands(int one, int two) {
		this.one = one;
		this.two = two;
		System.out.println("setOprands(int one, int two)");
		// �ڹ� -> �޼ҵ峻�� ��¹��� �ִ� ���� �ش� �޼ҵ尡 ȣ��Ǿ����� Ȯ���ϱ� ���� �뵵
	}
	public void setOprands(int one, int two, int three) {
		// ������ ��Ȱ�뼺, �ߺ��� ����, ���������� ���Ǽ� ���ÿ� �޼��Ǵ� ȿ���� ����. 
		this.setOprands(one, two);
		//setOprands(one,two); == this.setOprands(one, two);
		this.three = three;
		System.out.println("setOprands2(int one, int two, int three)");
	}
	/*public void setOprands(int one, int two, int three) {
		this.one = one;
		this.two = two;
		this.three = three;
		System.out.println("setOprands2(int one, int two, int three)");
	}*/
	public void sum() {
		System.out.println(one+two+three);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator8 c1 = new Calculator8();
		c1.setOprands(10, 20);
		c1.sum();
		c1.setOprands(10, 20, 30);
		c1.sum();
		
	}

}
