import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main (String[] args) {
		
		String nlevel = "Appliances|Ranges|Electric Ranges";
		String[] levels = nlevel.split("\\|");
		System.out.println(levels.length);
		System.out.println(levels[0]);
		System.out.println(levels[1]);
		System.out.println(levels[2]);
	}

	/*for (int i=1; i < 50; i++)
	{
		if ( i % 2 == 0 )
	         System.out.println(i + " even number.");
	   //   else
	      //   System.out.println(i+"  odd number.");
	   }
	}*/

}  