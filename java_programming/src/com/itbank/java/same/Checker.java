package com.itbank.java.same;

import com.itbank.java.other.*;

class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		// �ٸ� ��Ű���� Ŭ���� ���� ���� ����
		Other other = new Other();
		other._public();	// ���ٰ���
		//other._default();		// ���ٺҰ���
		//other._protected();	// ���ٺҰ���
		//other._private();		// ���ٺҰ���
		
		// �ٸ���Ű��, �ڽ�Ŭ�������� ����
		this._public();		// ���ٰ���
		this._protected();	// ���ٰ���		// ����� ����
		//this._default();	// ���ٺҰ���
		//this._private():	// ���ٺҰ���
	}
}

class SamePackageChecker extends Same{
	// ������
	public SamePackageChecker() {
		// ���� ��Ű�� ���� �ִ� Same�� �ν��Ͻ�ȭ
		Same same = new Same();
		same._public();		// ���ٰ���
		same._default();	// ���ٰ���
		same._protected();	// ���ٰ���
		//same._private();	// ���ٺҰ���
		
		// Ŭ������ � Ŭ������ ��� �޾Ұ�, �ڱ��ڽ��� Ŭ���� ���� ������ �ִ� �޼ҵ尡 �������� ������
		// �θ�Ŭ�������� �޼ҵ带 ã�� ��.
		// ����, ���⼭ this�޼ҵ�� �θ�Ŭ������ �޼ҵ�
		this._public(); 	// ���ٰ���    // this -> class�ڱ��ڽ��� �ǹ�
		this._protected();	// ���ٰ���
		this._default();	// ���ٰ���
		// this._private();	// ���ٺҰ���  -- ��� �޾Ƽ� ���� �͵� �Ұ�����.
	}
}

class SameClassChecker{
	public SameClassChecker() {
		// ���� Ŭ������ �����ϴ� �޼ҵ� ȣ��
		this._public();		// ���ٰ���
		this._protected();	// ���ٰ���
		this._default();	// ���ٰ���
		this._private();	// ���ٰ���
		// ��� : ���� Ŭ�������� �����ϸ� ��� ���������ڿ� ���� ���� ����
	}
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
}
public class Checker {

	public static void main(String[] args) {

	}

}
