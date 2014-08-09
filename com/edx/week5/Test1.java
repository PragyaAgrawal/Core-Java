package com.edx.week5;

public class Test1 {

	public static void main(String[] args) {
		int a = 6;
		int b = 42;
		int result1 = b / ++a;
		int result2 = b / a++;
		System.out.println(result1);
		System.out.println(result2);
		
		int i = 10;
		int j = 25;
		i += 5;
		j /= i;
		int result = i + j;
		
		System.out.println(result);
	}
}
