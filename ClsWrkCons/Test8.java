package ClsWrkCons;

public class Test8 {

	public static void main(String[] args) {
		Hello h = new Hello();
	}
}

class Hello
{
	int a;
	Hello()
	{
		this(10);
		//System.out.println("Hello Constructor");
		
	}
	
	Hello(int a)
	{
		
		System.out.println("Hello Constructor");
		
	}
}