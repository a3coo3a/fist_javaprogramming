package com.itbank.java.ex3;

//import com.itbank.java.ex1.*;
//import com.itbank.java.ex2.*;

// �ڹٰ� �ڵ����� import ���ִ� ��Ű��
import java.lang.*;	//  ���п� System class ��밡��
// - �ڹٸ� �̿��ϴµ� �ʼ����̰� ���� �̿��ϴ� Ŭ����


public class C {

	public static void main(String[] args) {

		// B b = new B();
		// ���� �߻�
		// The type B is ambiguous // ��ȣ�ϴ�
		// �ذ��� : ��������� Ư�� Ŭ���� ����		
		com.itbank.java.ex1.B b = new com.itbank.java.ex1.B();
		
		System.out.println(1);
		// println(1) --> �Ű������� ���� �޼ҵ�
		// System  -- > Ŭ������
		// out  --> System Ŭ������ ����� �ϳ��� ����
		// Ŭ������ ����ϱ� ���ؼ��� �ν��Ͻ�ȭ�� �����ִ� ���� �ʼ�
		// out -> �ν��Ͻ�ȭ�� �ʿ���� static �̴�!
		// static : ���ʿ��� �ν��Ͻ��� ������ �����ϱ� ���� Ű����
	}
		// java.lang : �ڹ� ���α׷����� ���� ���� �⺻���� ��Ű���� Ŭ������ �����ϰ� ����
		// java.util : ���α׷��� �����ϱ� ���� Ŭ������ �����͸� ȿ�������� �����ϱ� ���� Ŭ������ ��� ����
		// java.io  : Ű����, �����, ������, ���ϵ��� ������ �� �ִ� Ŭ������ ����
		// java.net : ����� ���� ��ɵ��� ��� ����
}
