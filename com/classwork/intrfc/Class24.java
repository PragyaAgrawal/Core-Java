package com.classwork.intrfc;

public class Class24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intr in[]=new D[5];//this will not print any value as it is equal to int a[]=new int[5];
		//If we want to assign new value then in this in[0]=new D();
		
		
	}

}
interface Intr{}

class D implements Intr{
	D()
	{
		System.out.println("D Default contructor");
	}
	
}