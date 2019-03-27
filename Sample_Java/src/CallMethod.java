

public class CallMethod 
{
	// main Method
	public static void main(String[] args) 
	{
		String projectName = getname();
		System.out.println("project Name is "+ projectName);
		
		String password = getpassword();
		System.out.println("password is "+ password );
	}
	
	
	// user defined methods
	static String getname()
	{
		return "Adidas";
	}
	
	static String getpassword()
	{
		return "*********";
	}
}
