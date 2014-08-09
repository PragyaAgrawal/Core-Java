package ClsWrkCons;

public class Test25 {

	public static void main(String[] args) {
		System.out.println(Hey.a);
		
		int i =1234567890;
		float f=i;
		System.out.println(f);//1.23456794E9
		int result=i-(int)f;
		System.out.println(result);
	}
}


class Hey
{
	static int a =10;
	
	Hey()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("Static Block");
	}
	
	static Hey h=new Hey();
	
}