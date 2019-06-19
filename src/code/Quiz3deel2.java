package code;

public class Quiz3deel2 extends Quiz3 {
	
	Quiz3deel2() {
		this(2);
		str += 7;
	}
	Quiz3deel2(int x) {
		str += x;
	}
	
	public static void main(String[] args) {
		
		Quiz3deel2 mk = new Quiz3deel2();
		System.out.print(mk.str);
	}
}
