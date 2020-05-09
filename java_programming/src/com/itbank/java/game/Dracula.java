package com.itbank.java.game;
//같은 패키지 내에서만 접근가능한 클래스 생성
class Dracula implements Monster{
	private int health;
	public Dracula(int health) {
		this.health = health;
	}
	public void getHealth() {
		System.out.println("드라큘라의 남은 힘은? "+ this.health);
	}
	public void doEvolve() {
		System.out.println("드라큘라가 사람으로 진화했습니다");
	}
	public int changeHealth(boolean isWin) {
		if(isWin) {
			return health*=2;
		}else {
			return health/=2;
		}
	}
	public void hunt() {
		System.out.println("드라큘라가 사냥을 시작합니다.");
	}
}
