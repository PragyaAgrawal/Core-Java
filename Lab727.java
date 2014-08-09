
public class Lab727 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D obj = new D();
		obj.show('A', 'B');
	}

}


class D
{
	void show(char a,int b)
	{
		System.out.println("show(char-int)");
	}
	
	void show(char a,long b)
	{
		System.out.println("show(char-long)");
	}
}