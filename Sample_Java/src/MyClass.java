
public class MyClass 
{
	
	int i =10;
	public static void main(String[] args) 
	{
		
		// Object
		Animal pet = new Animal();
		String petname = pet.name;
		System.out.println("Name retrived is: "+petname);
		pet.behaviour();
	}
	
	void mymethod1()
	{
		System.out.println(i);
	}
}

//Class
class Animal
{
	String name1= null;
	
	public Animal()
	 {
		name1 ="cat";
	 }
	 
	String name = "any animal";
	int legs;
	
	public void behaviour()
	{
		System.out.println("This is an Animal "+name);
	}
}