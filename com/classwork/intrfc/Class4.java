package com.classwork.intrfc;

public class Class4 {

	public static void main(String[] args) {
		byte by=123;
		new Test().show(by);
	}
}

class Test
{
	void show(int ab)
	{
		System.out.println("Show->int");
	}
	
	void show(char ab)
	{
		System.out.println("Show->char");
	}
}