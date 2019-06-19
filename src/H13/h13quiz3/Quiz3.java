package src.H13.h13quiz3;

abstract class Quiz3 {
	
	String str = "N";
	
	Quiz3() {
		this("0");
		str += "L";
	}
	Quiz3(String str) {
		str += str;
	}
}
 