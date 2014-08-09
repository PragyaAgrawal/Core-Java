package com.edx.week5;

public class Test7 {

	/**
	 * @param args
	 */
	static int size=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]=new int[4][4];
		for (int i = 0; i < size; i++) {
		    for (int j = 0; j < size; j++) {
		        arr[i][j] = size * j + i;
		    }
		    
		   
		}
		 System.out.println(arr[1][3]);
	}

}
