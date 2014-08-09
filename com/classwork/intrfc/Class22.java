package com.classwork.intrfc;

public class Class22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inter ref = new Hel();
		ref.m1();
		Inter2 ref1=new Hel();
		ref1.m2();
	}

}

interface Inter{
	 void m1();
}

interface Inter2{
	 void m2();
}


class Hel implements Inter2,Inter
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hel->m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Hel->m2");
	}
	
}