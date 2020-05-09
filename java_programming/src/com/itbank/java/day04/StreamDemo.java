package com.itbank.java.day04;

import java.io.IOException;	// ���ܻ��� ó��
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;		// System.in�� InputStream ��ü��.
		//int a ;
		//a = in.read();
		// read �޼ҵ�� 1byte�� ����� �Է��� �޾� ����. (3byte���� �����ؼ� �տ������� 1byte�� �о����)
		// byte�ڷ����� �ƴ� int�ڷ������� �����.
		// ����Ǵ� int���� 0~255 ������ ���������� ��� , �ƽ�Ű�ڵ尪
		
		// �ƽ�Ű�ڵ�? 
		// - �̱�ǥ�رⱸ���� ���� ���ڸ� ǥ���ϴ� ����
		// - ��ǻ���� ���� �ᱹ �����̱� ������ ��ǻ�Ϳ� ���ڿ� ��ȣ�� �ش� ���� ǥ������ ��ȯ�Ǿ� �ϴ� �ʿ伺�� ����.
		// - ���ڸ� ���ڷ� ǥ���ϱ� ���� ���
		// - 0-9, a-z, A-Z, Ư������ �� ǥ���ϴ� �ڵ�
		// - ex ) a -> 97
		
		//System.out.println(a);
		// ����� ���α׷��� ������� �ʰ� ������� �Է� ���
		
		// �Է½�Ʈ��
		// - ����ڰ� ������ ������
		
		// ��Ʈ��(Stream)
		// - �̾��� �ִ� ������(byte)�� ����
		// - ó���� ���� �ִ� ���������� ���� �帧ó�� �����͸� �޾ƿ� ����ִ� ��
		// 1. ���� ������ (���Ͽ��� ���۰� ���� �ִ� �������� ��Ʈ��)
		// 2. HTTP ���� ������ (�������� ��û�� ������ �����ϴ� HTTP ���� ������)
		// 3. Ű���� �Է� (����ڰ� Ű����� �Է��ϴ� ���ڿ�)
		
		// 3byte �д¹�
		/*int x,y,z;
		
		x = in.read();
		y = in.read();
		z = in.read();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
		
		// ����
		/*byte[] d = new byte[3];
		in.read(d);
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		// ��¹� for�� �ۼ��غ���
		for(byte i : d) {
			System.out.println(i);
		}*/
		
		// �ƽ�Ű�ڵ�� �ؾ��ؾ� �ϴ� ��� -> ����
		// �Է°� �״�� ����ϰ� �ʹٸ�
		// ����Ʈ ��� ���ڷ� �Է� ��Ʈ���� �д´� -> InputStreamReader
		
		// ��ü �����Ҷ��� �������� �Է��� �ʿ�
		InputStreamReader reader = new InputStreamReader(in);		
		
		char[] b = new char[3];
		reader.read(b);
		
		System.out.println(b);
		
		
		
	}

}
