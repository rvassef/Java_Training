import java.awt.Desktop;
import java.net.URI;
class OpenBrowser
{
	public static void main(String args[]) throws Exception
	{

		// Create Desktop object
		Desktop d=Desktop.getDesktop();

		System.setProperty("http.agent", "");

		// Browse a URL, say google.com
		d.browse(new URI("http://google.com"));
		

	}
}