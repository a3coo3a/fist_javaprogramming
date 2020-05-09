package com.itbank.java.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
	// Array ( �迭 )
	// - ������ �� ũ�⸦ �����־�� ��.	
	// - ���� : ������Ÿ�� [] �迭��
	// - ex) int[] array1 = new int[4];	
	// - �迭�� ��� : ������Ʈ  / �迭�� ��ġ : �ε��� (0���� ����)	
		
		int[] array1 = new int[4];
		System.out.println(array1.length);
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		System.out.println(array1);		// ������ �迭�� �ּҰ��� ��µ�.
		System.out.println(Arrays.toString(array1));	// ��Ʈ�� ������ ��ȯ�Ͽ� ��¿�û
		
		//  ����� ���ÿ� �Ҵ�����
		int[] a = new int[] {1, 2, 3, 4, 5}; // {}�� ���� ���̸� �˼� �־ []�ȿ� ���̸� �Է����� �ʾƵ���
		int[] b = {1, 2, 3, 5, 4};	// �̷��Ե� �����ϸ�, ������ �̷��� ���� ���
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		// �� �迭�� �ε���(��ġ)�� �����ϰ�, ������Ʈ ���� �����ؾ� ���� �迭
		System.out.println(Arrays.equals(a, b));	// false
		
		// ���� �Լ�
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a, b));	// true
		//System.out.println(a); �ּҴ� �ٸ�����, ���� ���� �� true �� ����.
		//System.out.println(b);
	
		Arrays.fill(a, 4);		//fill : ä���, a�� 4�� ä���
		System.out.println(Arrays.toString(a));
	
		// �ʱ�ȭ
		// - �⺻������ 0���� �ʱ�ȭ �Ǿ� ����.
		int[] c = new int[4];
		System.out.println(Arrays.toString(c));
		
		// ���ڿ�
		// - �ʱ� ���� null ������ �� ����.
		String[] d = new String[3];
		System.out.println(Arrays.toString(d));
		
		String[] weeks = {"��","ȭ","��","��","��","��","��"};
		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));		// ��ü
		System.out.println(weeks[3]);					// �κ�
		
		// �迭�� �Ѱ�
		// - ũ�Ⱑ ������ �ִ�. 
		//System.out.println(weeks[7]);	// error! 
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
		
		int[] array3 = new int[10];
		// Quiz
		// for�� �̿��ؼ� i��° �ε����� 1~10���� �Ҵ� 
		for(int i = 0; i < array3.length; i++) {
			array3[i] = i+1;
		}
		System.out.println(Arrays.toString(array3));
		
		// 2���� �迭 
		// - �迭�ȿ� �迭�� �� �� �ִ� ��
		// - ����
		int[][] array4 = new int[3][4];
		System.out.println(Arrays.deepToString(array4));
		// [3] : �ٱ��� �迭�� ũ��
		// [4] : ���� �迭�� ũ��
		
		// 3��¥�� �迭�� ������ ����. ������ 3��¥�� �迭�� ���� �����ϴ� �迭 ����.
		int[][] array5 = new int[3][];
		System.out.println(Arrays.deepToString(array5));
		
		array5[0] = new int[1];		// ũ�Ⱑ 1�� �迭�� ����, array5�� 0��° �ε����� ����
		array5[1] = new int[2];		// ũ�Ⱑ 2�� �迭�� ����, array5�� 1��° �ε����� ����
		array5[2] = new int[3];		// ũ�Ⱑ 3�� �迭�� ����, array5�� 2��° �ε����� ����
		
		System.out.println(Arrays.deepToString(array5));
		
		int[][] array6 = {{1},{2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(array6));
		System.out.println(array6[0][0]);
		
		int[][] test = {{1},{1,2},{1,2,3},{1,2,3,4}};
		// 2���� �迭 test�� �� ���� ����ϱ�
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]);
			}System.out.println();
		}
	
		// ����Ʈ(List)
		// - ����Ʈ�� �迭�� ����� �ڹ��� �ڷ���.
		// - �迭���� ���� ����� ������ ����.
		// - �迭�� ũ�Ⱑ ������ ������, ����Ʈ�� ũ�Ⱑ ������ ���� ����.
		// - List �ڷ��� -> ArrayList, LinkedList ... �ڷ��� ����
		
		// ArrayList
		// - ���尣���� �ڷ���
		// - ������� ä������ ��.
		// - ������ Ÿ���� ���� �������� �ʾƵ� ������ ���� ������, ������ ��
		// - <>�� �̿��Ͽ� ������ Ÿ�� ����
		// - ���� :
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add(2, "three");	// 2��° �ε����� "three"�� �־��
		list1.add(3, "four");
		//list1.add(4, "four");	// error!! ������� ä�� ��������.
		System.out.println(list1);
		
		// get : Ư�� �ε��� �� ����
		System.out.println(list1.get(2));
		
		// size : ����Ʈ ũ��
		System.out.println(list1.size());
		
		// contains : ����Ʈ �ȿ� Ư�� ���� �������� �Ǻ� -> boolean���� ����
		System.out.println(list1.contains("five"));
		System.out.println(list1.contains("one"));
		
		// remove : Ư�� �ε��� �� ����
		System.out.println(list1.remove("one"));
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
			
	}

}
