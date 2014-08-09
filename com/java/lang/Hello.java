package com.java.lang;

public class Hello {
	
	public static void main(String[] args) {
		
		Lab l=new Lab();
		l.m1();
		showInfo(l);//it will give the output as com.java.lang.Lab as 
		           //over here we are passing the Lab class object as the parameter
		
		showInfo("Pragya");//this will print the java.lang.String class as we are passing the string as a parameter
	/*	Class cls= l.getClass();//as the return type of getClass() is Class type
		System.out.println("Name Of the Class is  "+cls.getName());
		System.out.println("Name of the Super Class is    "+cls.getSuperclass().getName());*/
		
	}
	
	static void showInfo(Object obj)//this shows that Object class is the super class of all the Classes.
	{
		Class cls= obj.getClass();//as the return type of getClass() is Class type
		System.out.println("Name Of the Class is  "+cls.getName());
		System.out.println("Name of the Super Class is    "+cls.getSuperclass().getName());
	}

}


class Lab{
	int a=10;
	void m1()
	{
		System.out.println("Lab Class");
	}
}