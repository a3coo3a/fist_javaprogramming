package com.itbank.java.ex2;
// import
// - �ٸ� ��Ű���� ���� �ε� �Ҽ� �ֵ��� �ϴ� ��
// - '*' �� �ǹ� : ��Ű�� �ȿ� �ִ� ��� Ŭ������ ������.(���ϵ�ī��)
// - ex) import com.itbank.java.ex1.*;

import com.itbank.java.ex1.A;	// Ư�� Ŭ������ ���Խ�Ŵ

public class B {
	// ���� �̸��� Ŭ������ ������ ��Ű���� �޶� ������ �߻����� ����

	public static void main(String[] args) {
		// �ٸ� ��Ű���� �ִ� Ŭ���� ������ �ε��ϴ� ���� �Ұ���.
		A a = new A();	// �����߻�
	}
	// ���� �����Ͻ�
	// javac ��Ű�����/�ҽ��ڵ��̸�.java -d bin 
	//   : Ŭ���� ������ �ڵ����� bin���͸� �Ʒ��� ����
}
