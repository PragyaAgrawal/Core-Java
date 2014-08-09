package com.classwork.intrfc;

public class Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A ref = new A();
		//A ref = new C(); Class 2
		A ref = new B();//Class 3
		System.out.println("Hello Guys");
	}

}

class A{}
class B{}
//class B extends A{}
class C extends B{}