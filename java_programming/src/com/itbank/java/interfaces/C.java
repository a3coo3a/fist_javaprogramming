package com.itbank.java.interfaces;


// �������̽��� ����� �����ұ�?
// -> �����ϴ�!
// ��ӹ��� �θ�Ŭ������ �������̽��� �޼ҵ� ���� ������ �־�� ��.


interface I3{
	public void x();
}
interface I4 extends I3{
	public void y();
}

public class C implements I4 {
	public void y() {}
	public void x() {}
	// ��� ���� �޼ҵ� ���� ������ �־�� ��.
}

// �������̽� ��Ģ
// 1. �ϳ��� Ŭ������ �������� �������̽� ���� ����
// 2. �������̽��� ����� �ȴ�.
// 3. �������̽��� �ݵ�� public�� ������ �Ѵ�.

