package com.classwork.innercls;

import com.classwork.innercls.Test9.InnrTest;

public class Class9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test9 ref = new Test9();
	//	Test9.InnrTest ref = new Test9().new InnrTest();Class10
		//ref.show();
		System.out.println(ref.y);
		System.out.println(ref.x);
	}

}

class Test9{
	int x=99;
	class InnrTest
	{
		int y =88;
		/*void show()
		{
			System.out.println(x);
		}*/
	}
}