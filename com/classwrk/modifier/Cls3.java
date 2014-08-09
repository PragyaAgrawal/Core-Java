package com.classwrk.modifier;

public class Cls3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello h = new Hello(99);//Paratermrized Constructor
		System.out.println(h.getX());
		
	}

}


class Hello
{
	private int x;
	Hello(int x)
	{
		this.x=x;
		
	}
	
	int getX()
	{
		return this.x;
		
	}
	
}