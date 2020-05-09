package com.itbank.java.poly;

interface Monster {
	public void health();
	public void evolve();
	public int healthChg(boolean isWin);
}
class Zombie implements Monster{
	
	private int _health;
	public Zombie(int health) {
		this._health = health;
	}
	public void health() {
		System.out.println("������ ü����? "+ this._health);
	}
	public void evolve() {
		System.out.println("���� ������� ��ȭ�߽��ϴ�");
	}
	public int healthChg(boolean isWin) {
		if(isWin) {
			return _health++;
		}else {
			return _health--;
		}
	}
	public void chase() {
		System.out.println("���� �i�ư��ϴ�");
	}
}
class Dracula implements Monster{
	
	private int _health;
	public Dracula(int health) {
		this._health = health;
	}
	public void health() {
		System.out.println("���ŧ���� ���� ����? "+ this._health);
	}
	public void evolve() {
		System.out.println("���ŧ�� ������� ��ȭ�߽��ϴ�");
	}
	public int healthChg(boolean isWin) {
		if(isWin) {
			return _health*=2;
		}else {
			return _health/=2;
		}
	}
	public void hunt() {
		System.out.println("���ŧ�� ����� �����մϴ�.");
	}
}


public class PolyQuiz {

	public static void main(String[] args) {
		
	}

}
