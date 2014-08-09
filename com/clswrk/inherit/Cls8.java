package com.clswrk.inherit;

public class Cls8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B ref = new B();
		ref.x=101;
		System.out.println(ref.ref.x);
	}

}

class A
{
	int x=99;
}


class B extends A
{
	int y=88;
	A ref= new A();
}