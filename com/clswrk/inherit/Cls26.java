package com.clswrk.inherit;

public class Cls26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ee ref=new Ee();
		ref.super.x=99;
		ref.show();
	}

}

class Dd
{
	int x=99;
}

class Ee extends Dd
{
	String x="JLC";
	void show()
	{
		System.out.println(super.x);
	}
}