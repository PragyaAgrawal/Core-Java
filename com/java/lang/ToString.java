package com.java.lang;

public class ToString {

	public static void main(String[] args) {
		Student stu=new Student();
		System.out.println(stu.toString());
		String str=stu.toString();
		System.out.println(str);
		
	}
}

class Student
{
	int a;
	void methd()
	{
		System.out.println("Student Class");
	}
}