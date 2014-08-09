package com.classwrk.modifier;

import com.example.pack1.A;
public class Cls8 extends A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B ref = new B();
		ref.show();
	}

}

class B extends A{
	protected void show(){
	}
}