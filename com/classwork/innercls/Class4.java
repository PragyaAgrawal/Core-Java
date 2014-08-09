package com.classwork.innercls;

public class Class4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Aa().show();
	}

}

class Aa
{
	void show()
	{
		B ref = new B();
		System.out.println("OK");
	}
	
	class B
	{
		 B(){}
	}
}