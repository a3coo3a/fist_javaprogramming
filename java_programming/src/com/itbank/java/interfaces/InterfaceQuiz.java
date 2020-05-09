package com.itbank.java.interfaces;

/*interface Meter{
	public void start();
	public int stop(int distance);
}*/

class Taxi implements Meter{
	public void start() {
		System.out.println("운행을 시작합니다");
	}
	public int stop(int distance) {
		int fee = distance*2;
		return fee;
	}
}

public class InterfaceQuiz {

	public static void main(String[] args) {
		Taxi t = new Taxi();
		t.start();
		System.out.println(t.stop(20));
		
		
	}

}
