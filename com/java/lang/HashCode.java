package com.java.lang;

public class HashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		
	}

}


class Person
{
	void m1()
	{
		System.out.println("Person Class");
	}
}