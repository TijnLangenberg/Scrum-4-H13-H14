public interface MijnInterface{
	int x = 5;
	void methode();
	void methode(int i);
}

public class h14q1 implements MijnInterface{
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
		new h14q1().methode(4);
	}
}