package src.H14.h14quiz1;

public class H14q1V implements MijnInterfaceV{
	public void methode() {
		// x++; /*1*/
		System.out.print(x);
	}
	public void methode(int i) {
		int z = 1;
		// z = z + x; /*2*/
		methode();
		System.out.print(z);
	}
	public static void main(String[] args) {
		new H14q1V().methode(4);
	}
}