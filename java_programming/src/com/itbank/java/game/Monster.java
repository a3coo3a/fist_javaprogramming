package com.itbank.java.game;
// 같은 패키지 내에서만 접근 가능한 인터페이스 생성
interface Monster {
	public void getHealth();		// 조회는 함수명에 get을 많이 사용함
	public void doEvolve();
	public int changeHealth(boolean isWin);
}
