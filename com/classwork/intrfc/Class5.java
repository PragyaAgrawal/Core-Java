package com.classwork.intrfc;

public class Class5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Aa().show(65);
	}

}

class Aa
{
	void show(short ab)
	{
		System.out.println("Show->int");
	}
	
	void show(char ab)
	{
		System.out.println("Show->char");
	}
}