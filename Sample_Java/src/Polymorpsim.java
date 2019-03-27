class ploy
{
	
	public String getname( int i)
	{
		return "face 1";
	}
	
	public String getname( double d)
	{
		return "face 2";
	}
}


public class Polymorpsim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ploy p = new ploy();
		
		System.out.println(p.getname(1));
		System.out.println(p.getname(1.0));
		

	}

}
