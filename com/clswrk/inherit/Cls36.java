package com.clswrk.inherit;

public class Cls36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oo r1=new Oo();
		Oo r2=new Oo();
		r1.show();
		r2.show();
	}

}


class Rr
{
	static int x;
}

class Oo extends Rr
{
	void show()
	{
		System.out.println(super.x);
	}
}