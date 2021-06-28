package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws Exception {

		someMethod();

	}
	public static void someMethod() throws FileNotFoundException{
	
		try {
			FileReader  in = new FileReader ("file.txt");
		}
		catch (FileNotFoundException e )
		{ System.out.println("meaasage from catch block ");}
	   
		 System.out.println("message from someMethod");
	}

}
