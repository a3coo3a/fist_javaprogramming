package com.itbank.java.day04;

import java.io.IOException;	// 예외사항 처리
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;		// System.in이 InputStream 객체임.
		//int a ;
		//a = in.read();
		// read 메소드는 1byte의 사용자 입력을 받아 들임. (3byte값을 전달해서 앞에서부터 1byte만 읽어들임)
		// byte자료형이 아닌 int자료형으로 저장됨.
		// 저장되는 int값은 0~255 사이의 정수값으로 출력 , 아스키코드값
		
		// 아스키코드? 
		// - 미국표준기구에서 정한 문자를 표현하는 수단
		// - 컴퓨터의 언어는 결국 숫자이기 때문에 컴퓨터에 문자와 기호가 해당 숫자 표현으로 변환되어 하는 필요성이 있음.
		// - 문자를 숫자로 표현하기 위한 약속
		// - 0-9, a-z, A-Z, 특수문자 를 표현하는 코드
		// - ex ) a -> 97
		
		//System.out.println(a);
		// 실행시 프로그램이 종료되지 않고 사용자의 입력 대기
		
		// 입력스트림
		// - 사용자가 전달한 데이터
		
		// 스트림(Stream)
		// - 이어져 있는 데이터(byte)의 형태
		// - 처음과 끝이 있는 수도꼭지에 물의 흐름처럼 데이터를 받아와 흘려주는 것
		// 1. 파일 데이터 (파일에는 시작과 끝이 있는 데이터의 스트림)
		// 2. HTTP 응답 데이터 (브라우저가 요청시 서버가 응답하는 HTTP 응답 데이터)
		// 3. 키보드 입력 (사용자가 키보드로 입력하는 문자열)
		
		// 3byte 읽는법
		/*int x,y,z;
		
		x = in.read();
		y = in.read();
		z = in.read();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
		
		// 개선
		/*byte[] d = new byte[3];
		in.read(d);
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		// 출력문 for문 작성해보기
		for(byte i : d) {
			System.out.println(i);
		}*/
		
		// 아스키코드로 해야해야 하는 방식 -> 불편
		// 입력값 그대로 출력하고 싶다면
		// 바이트 대신 문자로 입력 스트림을 읽는다 -> InputStreamReader
		
		// 객체 생성할때는 생성자의 입력이 필요
		InputStreamReader reader = new InputStreamReader(in);		
		
		char[] b = new char[3];
		reader.read(b);
		
		System.out.println(b);
		
		
		
	}

}
