package com.classwork.innercls;

public class Class8 {

	public static void main(String[] args) {
		System.out.println(W.xy);
	}
}

class W
{
	static int xy=99;
	static class Tst
	{
		static 
		{
			System.out.println("Tst static block");
		}
	}
}