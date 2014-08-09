package com.classwork.innercls;

public class Class5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		M mobj =new M();
		mobj.show();
	}

}


class M
{
	void show()
	{
		R obj=this.new R();
		System.out.println(obj.x);
	}
	
	class R
	{
		private int x=99;
	}
}







