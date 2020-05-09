package com.itbank.java.game;
// ���� ��Ű�� �������� ���ٰ����� Ŭ���� ����
class Zombie implements Monster{
	private int health;
	public Zombie(int health) {		// ������
		this.health = health;
	}
	public void getHealth() {
		System.out.println("������ ü����? "+ this.health);
	}
	public void doEvolve() {
		System.out.println("���� ������� ��ȭ�߽��ϴ�");
	}
	public int changeHealth(boolean isWin) {
		if(isWin) {
			return this.health++;
		}else {
			return this.health--;
		}
	}
	public void chase() {
		System.out.println("���� �i�ư��ϴ�");
	}
}
