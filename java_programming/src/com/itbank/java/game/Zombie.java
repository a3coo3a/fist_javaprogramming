package com.itbank.java.game;
// 같은 패키지 내에서만 접근가능한 클래스 생성
class Zombie implements Monster{
	private int health;
	public Zombie(int health) {		// 생성자
		this.health = health;
	}
	public void getHealth() {
		System.out.println("좀비의 체력은? "+ this.health);
	}
	public void doEvolve() {
		System.out.println("좀비가 사람으로 진화했습니다");
	}
	public int changeHealth(boolean isWin) {
		if(isWin) {
			return this.health++;
		}else {
			return this.health--;
		}
	}
	public void chase() {
		System.out.println("좀비가 쫒아갑니다");
	}
}
