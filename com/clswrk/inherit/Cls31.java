package com.clswrk.inherit;

public class Cls31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kk ref = new Kk();
		ref.x=90;
		System.out.println(ref.x);
	}

}

class Ll
{
	int x;
}

class Kk extends Ll
{
	String x;
}