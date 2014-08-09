package com.classwork.intrfc;

public class Class6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Tst ref = new Tst();
		Tst ref = new Test1();
		ref.show(65);
	}

}

class Tst
{
	void show(int ab)
	{
		System.out.println("Tst.show->int");
	}
}

class Test1 extends Tst
{
	void show(int ab)
	{
		System.out.println("Test1 show->int");
	}
}