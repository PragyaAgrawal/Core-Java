package ClsWrkCons;

public class Test20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heo h=new Heo();
		System.out.println(h.a);
	}

}

class Heo
{
	{
		this.a=10;
		System.out.println(this.a);
	}
	int a=20;
	//static int a=20;
}