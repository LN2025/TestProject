import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class PP {
	
	public static void main(String[] args) throws IOException {
		
		//System.out.println("Enter your name: ");
		//String name = System.console().readLine();
		//System.out.println(name);
		
		URL u = new URL("http://www.googe.com");
			URLConnection uc = u.openConnection();
	}

}
