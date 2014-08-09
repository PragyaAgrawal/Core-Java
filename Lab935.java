
public class Lab935 {

	public static void main(String[] args) {
		A aobj= new B();
		System.out.println(aobj.x);
	}
}


class A
{
	int x=90;
}

class B extends A
{
	
	String x="JLC";
}