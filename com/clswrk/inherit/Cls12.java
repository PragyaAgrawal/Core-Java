package com.clswrk.inherit;

public class Cls12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         J ref = new J();
         System.out.println(ref.x);
	}

}

class G
{
	int x=99;
}

class H extends G{}
class I extends H{
	String x="JLC";
}
class J extends H{}
