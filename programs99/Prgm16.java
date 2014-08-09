package programs99;

import java.util.Scanner;

public class Prgm16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the valiue of a");
		a=(scanner.nextInt());

		System.out.print("Enter the valiue of b");
		b=(scanner.nextInt());
		
		System.out.println("Enter the valiue of c");
		c=(scanner.nextInt());
		
		if(a>b&&a>c)
			System.out.println("a is greatest");
		else if(b>c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
	}

}
