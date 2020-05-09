package com.itbank.java.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
	// Array ( 배열 )
	// - 정의할 때 크기를 정해주어야 함.	
	// - 형식 : 데이터타입 [] 배열명
	// - ex) int[] array1 = new int[4];	
	// - 배열의 요소 : 엘리먼트  / 배열의 위치 : 인덱스 (0부터 시작)	
		
		int[] array1 = new int[4];
		System.out.println(array1.length);
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		System.out.println(array1);		// 생성한 배열의 주소값이 출력됨.
		System.out.println(Arrays.toString(array1));	// 스트링 값으로 변환하여 출력요청
		
		//  선언과 동시에 할당진행
		int[] a = new int[] {1, 2, 3, 4, 5}; // {}를 통해 길이를 알수 있어서 []안에 길이를 입력하지 않아도됨
		int[] b = {1, 2, 3, 5, 4};	// 이렇게도 가능하며, 실제로 이렇게 많이 사용
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		// 각 배열의 인덱스(위치)가 동일하고, 엘리먼트 값이 동일해야 같은 배열
		System.out.println(Arrays.equals(a, b));	// false
		
		// 정렬 함수
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a, b));	// true
		//System.out.println(a); 주소는 다르지만, 값이 같아 서 true 로 나옴.
		//System.out.println(b);
	
		Arrays.fill(a, 4);		//fill : 채우다, a를 4로 채우다
		System.out.println(Arrays.toString(a));
	
		// 초기화
		// - 기본적으로 0으로 초기화 되어 있음.
		int[] c = new int[4];
		System.out.println(Arrays.toString(c));
		
		// 문자열
		// - 초기 값은 null 값으로 들어가 있음.
		String[] d = new String[3];
		System.out.println(Arrays.toString(d));
		
		String[] weeks = {"월","화","수","목","금","토","일"};
		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));		// 전체
		System.out.println(weeks[3]);					// 부분
		
		// 배열의 한계
		// - 크기가 정해져 있다. 
		//System.out.println(weeks[7]);	// error! 
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
		
		int[] array3 = new int[10];
		// Quiz
		// for문 이용해서 i번째 인덱스에 1~10까지 할당 
		for(int i = 0; i < array3.length; i++) {
			array3[i] = i+1;
		}
		System.out.println(Arrays.toString(array3));
		
		// 2차원 배열 
		// - 배열안에 배열이 또 들어가 있는 것
		// - 형식
		int[][] array4 = new int[3][4];
		System.out.println(Arrays.deepToString(array4));
		// [3] : 바깥쪽 배열의 크기
		// [4] : 내부 배열의 크기
		
		// 3개짜리 배열을 참조해 생성. 하지만 3개짜리 배열은 아직 참조하는 배열 없음.
		int[][] array5 = new int[3][];
		System.out.println(Arrays.deepToString(array5));
		
		array5[0] = new int[1];		// 크기가 1인 배열을 생성, array5의 0번째 인덱스가 참조
		array5[1] = new int[2];		// 크기가 2인 배열을 생성, array5의 1번째 인덱스가 참조
		array5[2] = new int[3];		// 크기가 3인 배열을 생성, array5의 2번째 인덱스가 참조
		
		System.out.println(Arrays.deepToString(array5));
		
		int[][] array6 = {{1},{2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(array6));
		System.out.println(array6[0][0]);
		
		int[][] test = {{1},{1,2},{1,2,3},{1,2,3,4}};
		// 2차원 배열 test의 각 원소 출력하기
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]);
			}System.out.println();
		}
	
		// 리스트(List)
		// - 리스트는 배열과 비슷한 자바의 자료형.
		// - 배열보다 편리한 기능을 가지고 있음.
		// - 배열은 크기가 정해져 있지만, 리스트는 크기가 정해져 있지 않음.
		// - List 자료형 -> ArrayList, LinkedList ... 자료형 존재
		
		// ArrayList
		// - 가장간단한 자료형
		// - 순서대로 채워져야 함.
		// - 데이터 타입을 따로 선언하지 않아도 에러가 나진 않지만, 워닝은 남
		// - <>를 이용하여 데이터 타입 기입
		// - 형식 :
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add(2, "three");	// 2번째 인덱스에 "three"를 넣어라
		list1.add(3, "four");
		//list1.add(4, "four");	// error!! 순서대로 채워 나가야함.
		System.out.println(list1);
		
		// get : 특정 인덱스 값 추출
		System.out.println(list1.get(2));
		
		// size : 리스트 크기
		System.out.println(list1.size());
		
		// contains : 리스트 안에 특정 값의 존재유무 판별 -> boolean으로 리턴
		System.out.println(list1.contains("five"));
		System.out.println(list1.contains("one"));
		
		// remove : 특정 인덱스 값 삭제
		System.out.println(list1.remove("one"));
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
			
	}

}
