package com.classwork.innercls;

public class Class6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Test
{
	static void show()
	{
		InTest obj = new InTest();
		System.out.println(obj.x);
	}
	class InTest
	{
		int x=99;
	}
}