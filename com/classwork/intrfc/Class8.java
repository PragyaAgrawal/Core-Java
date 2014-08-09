package com.classwork.intrfc;

public class Class8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bb ref= new Cc();
		ref.show(65);
	}

}

class Bb
{
	static void show(int ab)
	{
		System.out.println("Bb.show->int");
	}
}

class Cc extends Bb
{
	static void show(int ab)
	{
		System.out.println("Cc.show->int");
	}
}