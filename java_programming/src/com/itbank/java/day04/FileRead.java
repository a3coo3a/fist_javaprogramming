package com.itbank.java.day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

// ���� �б�
public class FileRead {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
		FileInputStream fi = new FileInputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt");
		// InputStream -> byte������ �޾ƿ��Ե�
		
		fi.read(b);
		System.out.println(new String(b));
		fi.close();
		// FileInputStream Ŭ���� �̿�
		// - byte �迭�� �̿��ؼ� ������ �о�� �ϱ� ������ ��Ȯ�� ���̸� �� ��� ���� �߻�
		
		// ������ ���� ������ �б�
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt"));
		while(true) {	// ���ѷ���
			String line = br.readLine();
			if(line == null) break;	// ���̻� ���� ������ ���� ��� ����
			System.out.println(line);
		}
		br.close();
		
		
		
	}

}
