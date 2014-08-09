package com.example.claswrk;

public class Cls23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show('A','A');//it will give ambiguous error as we will not able to decide which method should be displayed.

	}

	static void show(char x,int a)
	{
		System.out.println("int");
	}
	
	static void show(long c,char a)
	{
		System.out.println("char");
	}
}
