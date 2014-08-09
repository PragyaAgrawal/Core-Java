package com.clswrk.inherit;

public class Cls24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cc ref = new Cc();
		ref.x=96;
		System.out.println(ref.x);
	}

}


class Aa
{
	int x=99;
	
}

class Bb extends Aa
{
	String x="JLC";
}

class Cc extends Bb
{
	float x=11.11F;
}