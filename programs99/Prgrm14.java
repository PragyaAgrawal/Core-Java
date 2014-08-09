package programs99;

import java.util.Scanner;

public class Prgrm14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the valiue of a");
		a=(scanner.nextInt());

		System.out.println("Enter the valiue of b");
		b=(scanner.nextInt());
		
		if(a>b)
			System.out.println("a is greater then b");
		else 
			System.out.println("b is greater then a");

	}

}
