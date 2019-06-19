package code;

public class Quiz1deel2 extends Quiz1 {
	
	Quiz1deel2() {
		this(2);
		str += 7;
	}
	Quiz1deel2(int x) {
		str += x;
	}
	
	public static void main(String[] args) {
		
		Quiz1deel2 mk = new Quiz1deel2();
		System.out.print(mk.str);
	}
}
