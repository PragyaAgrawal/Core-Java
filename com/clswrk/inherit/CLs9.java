package com.clswrk.inherit;

public class CLs9 {
	
	public static void main(String[] args) {
		D ref =new D();
		System.out.println(ref.x);
	}

}

class C
{
	int x=99;
}

class D extends C{}
class E extends D{}
class F extends D{}
