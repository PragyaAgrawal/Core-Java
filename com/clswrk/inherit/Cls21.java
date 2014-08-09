package com.clswrk.inherit;

public class Cls21 {

	public static void main(String[] args) {
		
		Z ref= new Z();
		ref.x=99;
		ref.show();
	}
}


class T 
{
	int x=10;
	
}

class Z extends T
{
	void show()
	{
		T ref =new T();
		System.out.println(ref.x);
	}
}