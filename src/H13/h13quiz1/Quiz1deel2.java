package src.H13.h13quiz1;

public class Quiz1deel2 extends Quiz1 {
	
	int bereken() {
		
		return x + 5;
	}
	int bereken(int x) {
		
		return super.x + x;
	}
	public static void main (String[] args) {
		
		Quiz1deel2 mk = new Quiz1deel2();
		System.out.print(mk.bereken(4));
	}
}
