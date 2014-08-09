
public class Lab932 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pobj=new Employee();
		Employee eobj= (Employee)pobj; //Dynamic Dispatch
		pobj.sleeping();//in the case of static methods it will call the super class method only
		pobj.walking();
		
		eobj.sleeping();
	}

}
class Person
{
	void eating()
	{
		System.out.println("Person Eating");
	}
	
	void walking ()
	{
		System.out.println("Person Walking");
	}
	
	static void sleeping()
	{
		System.out.println("Person Sleeping");
	}
}


class Employee extends Person
{
	void walking ()
	{
		System.out.println("Employee Walking");
	}
	
	static void sleeping()
	{
		System.out.println("Employee Sleeping");
	}
	
	void working()
	{
		System.out.println("Employee Working");
	}
}




