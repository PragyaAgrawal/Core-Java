package com.classwork.innercls;

public class Class7 {
	public static void main(String[] args) {
		new X().show();
	}
}
class X{
	static void show()
	{
	
		Z ref = new X().new Z();
		System.out.println(ref.xy);
	}

	class Z
	{
		int xy=99;
	}
}