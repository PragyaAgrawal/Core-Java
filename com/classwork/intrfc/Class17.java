package com.classwork.intrfc;

public class Class17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Driver().m1();
		System.out.println( Ccc.x);
	}

}

abstract class Auto
{
	static int x=99;
	void m1()
	{
		
	}
}

class Driver extends Auto{
	 Driver() {
		// TODO Auto-generated constructor stub
		x=80;
	}
	 
	 void m1()
		{
		
		 System.out.println("Driver");
		}
}


class Ccc extends Auto{}