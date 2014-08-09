package com.classwork.innercls;

public class Class11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test11.InnrTst11 obj = new Test11.InnrTst11();
	}

}

class Test11
{
	static int x=99;
	static class InnrTst11
	{
		static int x=88;
		
		void show()
		{
			System.out.println(x);
			System.out.println(Test11.this.x);
		//	System.out.println(Test11.x);Class12 it will run, we cannot use this keyword inside the static inner class 
		}
		
	}
	
	void tst()
	{
		System.out.println(Test11.this.x);//in the outer class it is valid to call the variable using the 
		//this keyword irrespective of it is static or non static.
	}
}