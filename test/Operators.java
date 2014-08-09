package test;

public class Operators {

	public static void main(String[] ars) {

		final int a = 19;
		int b = +a;
		byte c = a;
		char ch = 'A';
		int ch1 = +ch;// char ch1=+ch;invalid
		double d1 = 1234.567;
		double d2 = -d1;
		System.out.println(d2);
		System.out.println(b);
		System.out.println(ch1);
		// ///////////////////////////////////////////////

		final int b1 = 8;
		final int b2 = 90;
		byte i = b1 + b2;
		System.out.println(i);

	}
}
