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
		System.out.println("좀비의 체력은? "+ this._health);
	}
	public void evolve() {
		System.out.println("좀비가 사람으로 진화했습니다");
	}
	public int healthChg(boolean isWin) {
		if(isWin) {
			return _health++;
		}else {
			return _health--;
		}
	}
	public void chase() {
		System.out.println("좀비가 쫒아갑니다");
	}
}
class Dracula implements Monster{
	
	private int _health;
	public Dracula(int health) {
		this._health = health;
	}
	public void health() {
		System.out.println("드라큘라의 남은 힘은? "+ this._health);
	}
	public void evolve() {
		System.out.println("드라큘라가 사람으로 진화했습니다");
	}
	public int healthChg(boolean isWin) {
		if(isWin) {
			return _health*=2;
		}else {
			return _health/=2;
		}
	}
	public void hunt() {
		System.out.println("드라큘라가 사냥을 시작합니다.");
	}
}


public class PolyQuiz {

	public static void main(String[] args) {
		
	}

}
