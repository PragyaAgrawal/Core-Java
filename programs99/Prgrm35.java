package programs99;

import java.util.Scanner;

public class Prgrm35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i;
		int t;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the valiue of n");
		n=(scanner.nextInt());

		
		for(i=1;i<=10;i++)
		{
			t=n*i;
			System.out.println(n+"*"+i+"="+t);
		}

	}

}
