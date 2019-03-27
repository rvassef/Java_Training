

public class StringManipulation 
{

	public static void main(String[] args) 
	{
		// StringBuffer is advanced version of String
		StringBuffer sb = new StringBuffer();
		sb.append("satyam");
		
		System.out.println("Actaul string: "+ sb);
		System.out.println("Reverse string: "+ sb.reverse());
	}

}
