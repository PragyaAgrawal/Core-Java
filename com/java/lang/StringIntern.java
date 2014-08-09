package com.java.lang;

public class StringIntern {
	
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Welcome";
		String str3=new String("Test string object");
		String str4=new String("Test another String");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("----------------");
		String str5=str3.intern();
		System.out.println(str5);
		System.out.println("----------------");
		str4= str2;
		System.out.println(str2==str4);
		System.out.println(str4);
	}

}
