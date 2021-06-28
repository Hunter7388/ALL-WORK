package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Serializatio_n bike = new Serializatio_n("ABC",123);
		Serializatio_n car = new Serializatio_n("Car", 4268);
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Serializatio_n.dat");
		       try (ObjectOutputStream obj = new ObjectOutputStream(fos)){
		    	   obj.writeObject(bike);
		    	   obj.writeObject(car);
		       }
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
