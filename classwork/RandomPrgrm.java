package classwork;

public class RandomPrgrm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Hello h=new Hello();
	}

}


class Hello
{
	static Hello h1= new Hello();//We can create the static obj only inside the class itself
	
	{
		System.out.println("Instance Block");
	}
	
	static
	{
		System.out.println("Static Block");
	}
}
