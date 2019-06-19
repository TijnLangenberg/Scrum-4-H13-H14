package code;

abstract class Quiz4 {
	
	String str = "N";
	
	Quiz4() {
		this("0");
		str += "L";
	}
	Quiz4(String str) {
		str += str;
	}
}
