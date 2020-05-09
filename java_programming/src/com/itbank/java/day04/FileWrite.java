package com.itbank.java.day04;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// ������ �̿��� ����� ���

public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\test.txt");
		// FileOutputStream("������ ���ϰ�� \\ ���ϸ�.Ȯ����");
		// ��ü ������ ��Ʈ���� �����ٴ� ��
		//output.close();
		// - ����� ���� ��ü�� �ݾ��ִ� ����
		// - ���� ����, �ڹ����α׷��� ����ɶ� ����� ���� ��ü�� �ڵ����� �ݾ��ֱ� ����
		// - ���� ����� ���Ͽ� ���� �۾��� �������� �����ڰ� close�� �̿��� �ݾ��ִ� ���� ����
		// - ��ü�� �ݾ����� �ʰ� �ٽ� ����Ϸ� �ϴ� ���, ���� �߻�
		
		
		// ���ο� ���� ���� �Ȱ��� Ȯ�� �� �� ����.
		// ��ü ������ �������� �Է����� ���ϸ� �Ѱ���� ��.
		
		for(int i = 1; i <= 10 ; i++) {
			String data = i + "��° ���Դϴ�.\r\n";		// \r\n�� �ٹٲ� ����
			output.write(data.getBytes());
		}
		output.close();
	
		
		// FileOutputStream -> byte ������ �����͸� ó���ϴ� Ŭ����
		// String�� byte�迭�� �ٲ��ִ� getBytes() �޼ҵ� ����ؾ� ��.
	
		// byte�� ��ȯ�ؾ� �ϴ� �� ����
		FileWriter fw = new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test2.txt");
	
		for(int i = 1; i <= 10 ; i++) {
			String data = i + "��° ���Դϴ�.\r\n";		// \r\n�� �ٹٲ� ����
			fw.write(data);
		}
		fw.close();
	
		// �ٹٲ� ���ڸ� ���� �Է��ؾ� �ϴ� �� ����
		PrintWriter pw = new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt");
		for(int i = 1; i <= 10 ; i++) {
			String data = i + "��° ���Դϴ�.";
			pw.println(data);
		}
		pw.close();
		
		// ���Ͽ� ���� �߰��ϱ�
		FileWriter fw2 = new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt", true);
		for(int i = 11 ; i <= 20; i++) {
			String data = i + "��° ���Դϴ�.\r\n";
			fw2.write(data);
		}
		fw2.close();
		// �ۼ��� ������ �߰����� ������ boolean �Ķ���͸� true�� ����
		// ���� ���Ͽ� ���� ���ĺ��� ������ �ۼ���
		
		// �ٸ� ���
		// PrintWriter �������� �Է� : ���ϸ� ��� �߰����� ���� FileWriter��ü�� ���
		PrintWriter pw2 =new PrintWriter(new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt",true));
		for(int i = 21 ; i <= 30; i++) {
			String data = i + "��° ���Դϴ�.";
			pw2.println(data);
		}
		pw2.close();
	
	}
	
	
}
