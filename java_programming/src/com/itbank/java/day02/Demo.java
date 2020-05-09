package com.itbank.java.day02;

class Monster{
	int health, level =0;
	String name;
	static String food;
	
	public Monster(String name, int health) {	// ������
		this.name = name;
		this.health = health;
	}
	
	/*public void setHealthName(String name, int health) {
		this.health = health;
		this.name = name;
	}*/

	public int power() {
		return level+health;
	}
	/* ������ 5)
	 * public void changeLevel(boolean isWin){
	 * 		if(isWin){
	 * 			level++;
	 * 			health *= 2;
	 * 		} else {
	 * 			level--;
	 * 			health /= 2;
	 * 		}
	 * 
	 * */
	//public boolean game() {
		
	//}
	
	public void gameRes(String res) {
		if(res.equals("�̰��")) {
			System.out.println(name+"�� ���ӿ��� �̰���ϴ�!\n");
			this.level++;
			this.health *= 2;
		}else {
			System.out.println(name+"�� ���ӿ��� �����ϴ�....\n");
			this.level--;
			if(level < 0) level = 0;
			this.health /= 2;
		}
	}

	public static String foodChange(String newfood) {
		return food = newfood;	// �̸��� �ٸ��ٸ�
		// return Monster.food = food; // �̸��� ���ٸ�
	}

	public void showRes() {
		System.out.println("*** [ �� �� �� �� �� ] ***");
		System.out.println("���� �̸� : "+ name);
		System.out.println("���� ü�� : "+ health);
		System.out.println("���� ���� : "+ level);
		System.out.println("���� �Ŀ� : "+ power());
		System.out.println("���� �ֽ� : "+ food);
		System.out.println();
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Monster Ŭ���� ����� ����
		// 1) ���ʹ� ü��(health), �̸�(name), ����(level), �ֽ�(food) �Ӽ��� ������ �ִ�.
		// 2) ü�°� �̸��� ���͸��� �ٸ�����, �ʱ� ������ 0���� ����, ��� ������ �ֽ��� �����ϴ�
		//    �ֽ��� �޶�����, ��� ������ ������ �ֽĵ� �޶����� �Ѵ�.
		// 3) ������ �̸��� ü���� �������ִ� �޼ҵ� �����ϱ�
		// 4) ������ �Ŀ�(power)�� ����+ü������ ���ȴ�. �Ŀ����� ��� �޼ҵ带 �����ϱ�
		// 5) ������ ü���� ��ȭ�����ִ� �޼ҵ带 �����ϱ�
		//	  ����, ���ӿ��� �̰�ٸ� -> ���� 1 ���, ü�� 2�� ���
		// 		      ���ӿ��� ���ٸ� -> ���� 1 ����, ü�� 2�� ����
		// ���� ���� ���� ���� �� ü���� �������� ��.
		// 6) ������ �ֽ��� �����ϴ� �޼ҵ� �����
		
		Monster zombie = new Monster("����",100);
		Monster dragon = new Monster("���",200);
		Monster.food = "���";
		//zombei.setHealthName("����", 100);
		//dragon.setHealthName("���", 200);
		
		zombie.showRes();
		dragon.showRes();
		
		Monster.foodChange("����");
		
		
		
		// ������ : ������ 0���� �۾��� ��� or ü���� 0���� �۾��� ��쿡 ���� ó��
		//		    ���Ͱ� ���� �Ӽ� or �ɷ�ġ or �޼ҵ� -> ��ɿ� ���� �߰�
	}

}
