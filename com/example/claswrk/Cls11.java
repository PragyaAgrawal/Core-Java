package com.example.claswrk;

public class Cls11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(m1()&&m2())
			System.out.println("IF");
		
		else
			System.out.println("ELSE");
	}

	static boolean m1()
	{
		System.out.println("m1");
		return true;
	}
	
	static boolean m2()
	{
		System.out.println("m2");
		return false;
	}
}
