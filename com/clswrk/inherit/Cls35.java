package com.clswrk.inherit;

public class Cls35 {

	

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Ts ref = new Ts();
			ref.setX("JLC");
			System.out.println(ref.getX());
		}
}


	class St
	{
		int x;
		
		int getX()
		{
			return x;
		}
	}


	class Ts extends St
	{
		String x;
		void setX(String x)
		{
			this.x=x;
		}
	}

