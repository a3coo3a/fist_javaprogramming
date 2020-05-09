package com.itbank.java.game;

public class User {
	
	public static void play(Monster mon) {
		mon.doEvolve();
	}
	public static void fight(Monster mon, boolean isWin) {
		mon.changeHealth(isWin);
		mon.getHealth();
	}
	
	public static void main(String[] args) {
		Monster zombie = new Zombie(150);
		Monster dracula	= new Dracula(200);
		
		fight(zombie, true);
		fight(dracula, false);
		play(zombie);
		play(dracula);
		System.out.println();
		//zombie.chase(); 사용불가
		//dracula.hunt(); 사용불가
		
		Zombie z = new Zombie(150);
		Dracula d = new Dracula(200);
		
		z.chase();
		d.hunt();
		
		play(z);
	}

}
