package com.edx.week5;

public class Test4 {
	
	public static void main(String[] args) {
		
		int array[]={22, 99, 11, 99, 33};
		System.out.println(q2(array));
	}

	public static int q2(int[] array) {
		  
	       int index = 0;
	  
	       for (int i = 0; i < array.length; i++) {
	           if (array[i] < array[index]) index = i;
	       }
	  
	       return index;
	  
	}

}
