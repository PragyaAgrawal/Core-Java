package com.classwork.innercls;

public class Class3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A$B obj= new A$B();
		System.out.println(obj.x);
	}

}

class A{}
class A$B{
	int x=10;
}