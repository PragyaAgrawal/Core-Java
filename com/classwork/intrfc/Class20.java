package com.classwork.intrfc;

public class Class20 {

	public static void main(String[] args) {
		Hello in=new Hello();
	//	in.x=80;As the variable is by default final
		Hai in1=new Hai();
		System.out.println(in.x);
		System.out.println(in1.x);
	}
}


interface Inter1
{
	int x=90;//final static int x=90; is the actual syntax for it
}

class Hello implements Inter1{}
class Hai implements Inter1{}