import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadMe 
{

	public static void main(String args[]) throws Exception
	{
		File file = new File("C:\\Users\\kganted\\workspace\\TestSelenium\\src\\ReadMe.java");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line  = null;
		while ((line = br.readLine()) != null )
		{
			System.out.println(line);
		}
	}

}
