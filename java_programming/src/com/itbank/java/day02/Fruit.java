package com.itbank.java.day02;

public class Fruit {
	String name;
	int price = 0;

	public void setName(String name1) {
		// this�� �ش� ��ü, �ڱ��ڽ��� ��Ÿ����.
		// �Ķ���ͷ� ���� name�� ��ü name�� �̸��� �����ϱ� ������ ��Ȯ�� ���ִ� ��
		//this.name = name;
		name = name1;		// �̸��� �ٸ� ��� �̷��� ��� ����, ������������ ���� ��츦 ��ȣ
	}
	
	public static void main(String[] args) {
		Fruit apple = new Fruit();
		System.out.println(apple.name);	// . : ��Ʈ ������, ��ü�� ������ �Ӽ��� ���� ���� 
		apple.name = "���";
		System.out.println(apple.name);
		apple.price = 990;
		System.out.println(apple.price);
		
		Fruit bnanan = new Fruit();
		bnanan.price = 1000;
		bnanan.name = "�ٳ���";
		System.out.println(bnanan.name);
		System.out.println(bnanan.price);
		
		// ��ü ������ �������� �ʴ´�.
		// ��ü ������ ���� ���������� ���� �ȴ�. -> Ŭ������ ���� ����
		
		apple.setName("���ִ� ���");
		System.out.println(apple.name);
		
		
		
		
		
	}

}
