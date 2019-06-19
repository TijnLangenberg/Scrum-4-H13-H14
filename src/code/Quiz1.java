package code;

abstract class Quiz1 {
	
	String str = "N";
	
	Quiz1() {
		this("0");
		str += "L";
	}
	Quiz1(String str) {
		str += str;
	}
}
