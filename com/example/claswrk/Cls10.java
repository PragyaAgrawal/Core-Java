package com.example.claswrk;

public class Cls10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for(System.out.println("BEGIN");Hey.process(i);i++,System.out.println("Update"))
		{
			System.out.println(i);
		}

	}

}

class Hey
{
	static boolean process(int a)
	{
		System.out.println("Condition");
		if(a<1)
			return true;
		else 
			return false;
	}
}
