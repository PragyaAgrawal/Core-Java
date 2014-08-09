package programs99;

import java.util.Scanner;

public class Progm13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the valiue of a");
		a=(scanner.nextInt());

		
		
		if(a%2==0)
			System.out.println("The number is even");
		else 
			System.out.println("The number is odd");

	}

}
