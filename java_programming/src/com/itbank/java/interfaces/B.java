package com.itbank.java.interfaces;

// �ϳ��� Ŭ������ �������� �������̽��� ������ �� ������?
// -> �����ϴ�! 
// - ������ �������̽��� ���� �Ǿ� �ִ� �޼ҵ���� �ش�Ŭ���� ������ ��� ������ ��� ��.

interface I1{
	public void x();
}
interface I2{
	public void y();
}

public class B implements I1,I2 {

	public void x() {}
	public void y() {}
		
}
// �߻�Ŭ������ �������̽� ����
// - �߻�Ŭ������ ����� �ϳ��� ����, �������̽��� ������ ���� ����