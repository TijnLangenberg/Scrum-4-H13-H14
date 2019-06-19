package code;

public class Quiz4deel2 extends Quiz4 {
	
	Quiz4deel2() {
		this(2);
		str += 7;
	}
	Quiz4deel2(int x) {
		str += x;
	}
	
	public static void main(String[] args) {
		
		Quiz4deel2 mk = new Quiz4deel2();
		System.out.print(mk.str);
	}
}
