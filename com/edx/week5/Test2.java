package com.edx.week5;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact2(3,6));
	}
	
	/*public static int fact2(int n1, int n2) {  

	    int t = 1; // initialize t to 1       
	    for (int counter = n1; counter <= n2; counter++) {
	        t = t * counter;
	    }
	    return t;
	}*/
	
	public static int fact2(int n1, int n2) {  

	    int t = 1; // initialize t to 1       
	    for (int counter = n2; counter > n1; counter--) {
	        t = t * counter;
	    }
	    return t;
	}

}
