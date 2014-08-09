package com.edx.week5;

public class Test6 {
	
	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		for (i = 0; i < 3; i++) {
		    for (j = 0; j < 3; j++) {
		        if (j == 1) break;
		    }
		}

		System.out.println(i + " " + j);
	}

}
