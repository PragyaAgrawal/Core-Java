package com.clswrk.inherit;

public class Cls33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tt ref = new Tt();
		ref.setX(90);
		System.out.println(ref.getX());
	}

}


class Ss
{
	int x;
	void setX(int x)
	{
		this.x=x;
	}
	
	
	int getX()
	{
		return x;
	}
}


class Tt extends Ss
{
	String x;
}