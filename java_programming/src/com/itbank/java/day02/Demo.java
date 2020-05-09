package com.itbank.java.day02;

class Monster{
	int health, level =0;
	String name;
	static String food;
	
	public Monster(String name, int health) {	// 생성자
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
	/* 선생님 5)
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
		if(res.equals("이겼다")) {
			System.out.println(name+"이 게임에서 이겼습니다!\n");
			this.level++;
			this.health *= 2;
		}else {
			System.out.println(name+"이 게임에서 졌습니다....\n");
			this.level--;
			if(level < 0) level = 0;
			this.health /= 2;
		}
	}

	public static String foodChange(String newfood) {
		return food = newfood;	// 이름이 다르다면
		// return Monster.food = food; // 이름이 같다면
	}

	public void showRes() {
		System.out.println("*** [ 몬 스 터 정 보 ] ***");
		System.out.println("몬스터 이름 : "+ name);
		System.out.println("몬스터 체력 : "+ health);
		System.out.println("몬스터 레벨 : "+ level);
		System.out.println("몬스터 파워 : "+ power());
		System.out.println("몬스터 주식 : "+ food);
		System.out.println();
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Monster 클래스 만들어 보기
		// 1) 몬스터는 체력(health), 이름(name), 레벨(level), 주식(food) 속성을 가지고 있다.
		// 2) 체력과 이름은 몬스터마다 다르지만, 초기 레벨은 0으로 설정, 모든 몬스터의 주식은 동일하다
		//    주식이 달라지면, 모든 종류의 몬스터의 주식도 달라져야 한다.
		// 3) 몬스터의 이름과 체력을 세팅해주는 메소드 생성하기
		// 4) 몬스터의 파워(power)는 레벨+체력으로 계산된다. 파워값을 얻는 메소드를 생성하기
		// 5) 레벨과 체력을 변화시켜주는 메소드를 생성하기
		//	  만약, 게임에서 이겼다면 -> 레벨 1 상승, 체력 2배 상승
		// 		      게임에서 졌다면 -> 레벨 1 감소, 체력 2배 감소
		// 게임 이후 현재 레벨 및 체력을 출력해줘야 함.
		// 6) 몬스터의 주식을 변경하는 메소드 만들기
		
		Monster zombie = new Monster("좀비",100);
		Monster dragon = new Monster("용용",200);
		Monster.food = "고기";
		//zombei.setHealthName("좀비", 100);
		//dragon.setHealthName("용용", 200);
		
		zombie.showRes();
		dragon.showRes();
		
		Monster.foodChange("생선");
		
		
		
		// 개선점 : 레벨이 0보다 작아질 경우 or 체력이 0보다 작아질 경우에 대한 처리
		//		    몬스터가 가진 속성 or 능력치 or 메소드 -> 기능에 대한 추가
	}

}
