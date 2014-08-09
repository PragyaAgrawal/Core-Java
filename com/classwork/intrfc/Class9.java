package com.classwork.intrfc;

public class Class9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gg ref=new Tt();
		ref.x=88;
		//ref.x="Sri"; Class10
		System.out.println(ref.x);
	}

}

class Gg
{
	int x=99;
}

class Tt extends Gg
{
	String x="Jlc";
}