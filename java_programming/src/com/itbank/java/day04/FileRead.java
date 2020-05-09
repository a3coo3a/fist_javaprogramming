package com.itbank.java.day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

// 파일 읽기
public class FileRead {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
		FileInputStream fi = new FileInputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt");
		// InputStream -> byte단위로 받아오게됨
		
		fi.read(b);
		System.out.println(new String(b));
		fi.close();
		// FileInputStream 클래스 이용
		// - byte 배열을 이용해서 파일을 읽어야 하기 때문에 정확한 길이를 모를 경우 문제 발생
		
		// 파일을 라인 단위로 읽기
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt"));
		while(true) {	// 무한루프
			String line = br.readLine();
			if(line == null) break;	// 더이상 읽을 라인이 없을 경우 리턴
			System.out.println(line);
		}
		br.close();
		
		
		
	}

}
