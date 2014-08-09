package com.clswrk.inherit;

public class Cls16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Y ref =null;
		ref.x=101;
		
	
	}

}

class X
{
	static int x=99;
	{
		System.out.println("A.I.B");
	}
}

class Y extends X
{
	{
		System.out.println("B.I.B");
	}
}