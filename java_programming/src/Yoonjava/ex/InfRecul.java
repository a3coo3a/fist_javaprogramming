package Yoonjava.ex;

public class InfRecul {

	public static void main(String[] args) {
		showHi(3);
	}
	
	public static void showHi(int cnt) {
		System.out.println("Hi~");
		if(cnt == 1) return;
		//showHi(cnt--);	// 값이 전달된 후 -1이 진행됨.
		showHi(--cnt);
	}
}
