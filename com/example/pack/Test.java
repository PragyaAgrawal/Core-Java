package com.example.pack;

public class Test extends A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The main method");
		//A b= new A();
		//b.method();
		//privtmethd();	
		Test t= new Test();
		t.method();
	}
	
	public static  void method()
	{
		System.out.println("Hello");
	}
	/*
	static void privtmethd()
	{
		System.out.println("Mehod of TEst");
	}*/

}


class A
{
	private int a=90;
	private void privtmethd()//In the case of private we cannot access the method outside the class ie 
	//we cannot override the method then in that case it will be consider as the new method of the class 
	{
		System.out.println(a);
	}
	public static void method()
	{
	
	A a= new A();
	a.privtmethd();
	}
}