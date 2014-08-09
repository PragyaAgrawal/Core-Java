package com.edx.week5;

public class Test5 {

	public static void main(String[] args) {
	
		char[] array = {'H', 'K', 'U', 'S', 'T'};
		change(array, 1, 3);
	}
	
	
	public static void change(char[] array, int index1, int index2) { 
		  
	       char temp = array[index2];
	       array[index1] = array[index2];
	       array[index2] = temp;
	       for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	      
	  
	}
}

