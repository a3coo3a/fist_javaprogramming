package com.itbank.java.game;
//���� ��Ű�� �������� ���ٰ����� Ŭ���� ����
class Dracula implements Monster{
	private int health;
	public Dracula(int health) {
		this.health = health;
	}
	public void getHealth() {
		System.out.println("���ŧ���� ���� ����? "+ this.health);
	}
	public void doEvolve() {
		System.out.println("���ŧ�� ������� ��ȭ�߽��ϴ�");
	}
	public int changeHealth(boolean isWin) {
		if(isWin) {
			return health*=2;
		}else {
			return health/=2;
		}
	}
	public void hunt() {
		System.out.println("���ŧ�� ����� �����մϴ�.");
	}
}
