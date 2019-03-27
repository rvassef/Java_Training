
public class Tables
{

	public static void main(String[] args) 
	{

		for (int i=1;i < 11; i ++)
		{
			for (int k=1; k < 11; k++)
			{
				int value = i * k;
				System.out.println(i +" * "+ k+ " = " + value);
			}
			System.out.println();
		}
	}

}
