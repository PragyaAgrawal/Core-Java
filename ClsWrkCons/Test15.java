package ClsWrkCons;

public class Test15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Stat.a);
	}

}



class Stat
{
	static{
		System.out.println(Stat.a);
	}
	
	static int a=20;
	static{
		System.out.println(Stat.a);
	}
	
	
}
