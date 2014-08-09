
public class Lab726 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dd dobj=new Dd();
		dobj.show(20, 20);//Ambiguous
	}

}
class Dd
{
	void show(byte a,int b)
	{
		System.out.println("show(char-int)");
	}
	
	void show(int a,byte b)
	{
		System.out.println("show(char-long)");
	}
}