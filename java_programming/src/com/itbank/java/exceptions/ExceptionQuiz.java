package com.itbank.java.exceptions;

public class ExceptionQuiz {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		
		try {
			array[20]=5;
		}catch(Exception e) {
			System.out.println("예외 발생 : "+ e.toString());
		}finally {
			System.out.println("finally");
		}
	}

}
