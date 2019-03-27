

public class Calc 
{
	public static void main(String[] args) 
	{
		int value1 = 3;
		int value2 = 2;
		
		
		int sum = value1 + value2;
		System.out.println("sum: "+ sum);
		
		int diff = value1 - value2;
		System.out.println("diff: "+ diff);
		
		int multiplication = value1 * value2;
		System.out.println("multiplication: "+ multiplication);
		
		int division = value1 / value2;
		System.out.println("division: "+ division);
		
		// division in double (considers decimals)
		double value1Dec = 3;
		double value2Dec = 2;
		double divInDouble = value1Dec / value2Dec;
		System.out.println("Division In Double: "+ divInDouble);
	}

}
