class parent
{
	int property = 10000;
	String surname = "abc";
	
	public String age()
	{
		return "55";
	}
}

class Child extends parent
{
	public String age()
	{
		return "25"; 
	}
	
	public String age(int age)
	{
		return "25"; 
	}
}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		parent p = new parent();
		
		String activity = p.age();
		System.out.println("Parent is " +activity);
		System.out.println("Parent is " +p.property);
		
		Child child = new Child();
		activity = child.age();
		activity = child.age(10);
		
		System.out.println("Child is "+activity);
		System.out.println("Child is " +child.property);

	}

}
