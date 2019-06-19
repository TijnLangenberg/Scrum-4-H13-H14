package src.H13.h13quiz5;

public class Quiz5deel2 extends Quiz5 {
	
	void methodeA() {
		
		System.out.print("x");
	}
	void methodeA(int x) {
		
		System.out.print("y" + "x");
	}
	String methodeB(String s) {
		
		return s + x;
	}
	String methodeB(int x) {
		
		return "x" + x;
	}
	public static void main(String[] args) {
		
		Quiz5deel2 mk = new Quiz5deel2();
		mk.Quiz5deel2();
		System.out.print(mk.methodeB("y"));
	}
	private void Quiz5deel2() {
		// TODO Auto-generated method stub
		
	}
}
   