package com.itbank.java.eclipse;

public class Strings {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "123";
		
		System.out.println(str1+" "+str2);
		
		// new : ���ο� ��ü ���鶧 ���
		// ��ü  : ���� ������ �ڷ���...
		String str3 = new String("Hello world");
		String str4 = new String("Hello world");
		
		System.out.println(str3 == str4); 		// false	// ��ġ�� ã�ư��� ������ �ٸ��ٰ� �����
		System.out.println(str3.equals(str4));	// true		// equals�� ���빰 ���� ���ϱ⿡ ���ٰ� �����
	
		String a = "Hello Java";
		// indexOf : ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� ���ؽ� ����
		System.out.println(a.indexOf("Java"));
		System.out.println(a.replaceAll("Java","world"));
		System.out.println(a.substring(0,4));	// ù������ ���� �������� �������� ����.
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}

}
