package com.itbank.java.day04;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteQuiz {

	public static void main(String[] args) throws IOException {
		/* ���� ���� �ǽ�
		 * �л��� �̸�, Ű�� ��� �迭�� �־����� �� ������ ������ �����Ͻÿ�.
		 * class.txt 
		 * */
		String[] names = {"Jack","Rachel","Tom","Anna","Jenny"};
		int[] heights = {170,155,180,185,160};
		
		PrintWriter stu =new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\class.txt");
		
		stu.println("�̸� Ű");
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
