package com.itbank.java.day03;

// OverloadingDemo �ڵ� �����ϱ�
class Calculator9{
	int[] oprands;	// �迭
	
	// �Ű������� �迭���
	// �̷��� ����ϸ� �ϳ��� ���ڷ� �������� ���� ���� �� �ִٴ� ������ �ִ�.
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum() {
		int total = 0;
		// for - each�� : �迭�� �ִ� ���� �ϳ��� �� ���� ����
		for(int value: this.oprands) {
			total += value;
		}
		System.out.println(total);
	}
	public void avg() {
		int sum = 0;
		//int count =0;
		for(int value: this.oprands) {
			sum += value;
			//count++;
		}
		//System.out.println(sum/count);
		System.out.println(sum/this.oprands.length);
	}
}

public class OverloadingDemo4 {

	public static void main(String[] args) {
		Calculator9 c1 = new Calculator9();
		
		c1.setOprands(new int[] {10,20});
		c1.sum();	// 30
		c1.avg();	// 15
		c1.setOprands(new int[] {10,20,30});
		c1.sum();	// 60
		c1.avg();	// 20
	}

}
