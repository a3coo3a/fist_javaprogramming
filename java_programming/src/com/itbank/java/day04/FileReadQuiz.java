package com.itbank.java.day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadQuiz {

	public static void main(String[] args) throws IOException {
		/*byte[] b = new byte[1024];
		FileInputStream con = new FileInputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\Congress.txt");		
		FileOutputStream con2 = new FileOutputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\Congress_edit.txt");
				
		con.read(b);
		System.out.println(new String(b));
		
		for(int i = 6; i<b.length; i++) {
			
			con2.write(b[i]);
			
		}*/
		
		// 선생님 답
		// 데이터 후처리
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KGITBANK\\Desktop\\docs\\Congress.txt"));
		PrintWriter pw = new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\Congress_edit.txt");
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			// substring
			String name = line.substring(0,3);// 시작인덱스 <= 자르는 부분 <마지막 인덱스
			String area = line.substring(3);  // 시작 인덱스 ~ 끝까지
			String data = name + " " + area;
			pw.println(data);
			System.out.println(data);
		}
		br.close();
		pw.close();
	}

	
}
