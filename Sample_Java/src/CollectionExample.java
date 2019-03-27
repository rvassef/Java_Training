

import java.util.ArrayList;

public class CollectionExample 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		
		for (int number=0; number < list.size(); number ++)
		{
			System.out.println(list.get(number));
		}
	}
}
