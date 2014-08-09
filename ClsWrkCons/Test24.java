package ClsWrkCons;

public class Test24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tst t= new Tst();
		System.out.println(Tst.a);
	}

}


class Tst
{
	static int a=10;
	Tst()
	{
		System.out.println("CONS");
	}
	static
	{
		System.out.println("sb");
	}
	static Tst w=new Tst();
}
