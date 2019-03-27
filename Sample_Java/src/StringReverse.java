class StringReverse
{
	public static void main(String args[])
	{
		
		StringBuffer sb = new StringBuffer();
		sb.append("abced");
		
		System.out.println(sb.reverse());
		String myString = "abcde";
		String reverse = "";
		
		
		// get string length and get each character from ending
		int length = myString.length();
		System.out.println(length);
		for ( int i = length - 1 ; i >= 0 ; i-- )
		{
			reverse = reverse + myString.charAt(i);
			System.out.println(reverse);
		}
		System.out.println("Reverse of entered string is: "+reverse);
	}
}