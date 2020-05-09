package com.itbank.java.day04;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteQuiz {

	public static void main(String[] args) throws IOException {
		/* 파일 생성 실습
		 * 학생의 이름, 키가 담긴 배열이 주어졌을 때 다음의 파일을 생성하시오.
		 * class.txt 
		 * */
		String[] names = {"Jack","Rachel","Tom","Anna","Jenny"};
		int[] heights = {170,155,180,185,160};
		
		PrintWriter stu =new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\class.txt");
		
		stu.println("이름 키");
		/*int j = 0;
		for(String i : names) {
			stu.println(i+" "+heights[j]);
			j++;
		}*/
		for(int i = 0; i < names.length; i++) {
			stu.println(names[i]+" "+heights[i]);
		}
		stu.close();
	}

}
