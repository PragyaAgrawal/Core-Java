package com.classwork.intrfc;

public class Class15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Lab1().a);
		//System.out.println(Lab1.a);
	}

}

abstract class Lab
{
	  int a=99;
	  //static int a=99;
	Lab()
	{
		System.out.println("Lab->D.C");
	}
	
	static
	{
		System.out.println("Lab->S.C");
	}
}


class Lab1 extends Lab
{
	static
	{
		System.out.println("Lab1->S.C");
	}
}