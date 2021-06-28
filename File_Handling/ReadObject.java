package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
try (FileInputStream fil = new FileInputStream("C:\\\\Users\\\\rajuk\\\\eclipse-workspace\\\\hello world\\\\src\\\\Serializatio_n.dat")) {

				try(ObjectInputStream obj = new ObjectInputStream(fil)){
				Serializatio_n v1= (Serializatio_n) obj.readObject();
				Serializatio_n v2= (Serializatio_n) obj.readObject();
				System.out.println("Object 1 is "+ v1);
				System.out.println("Object 2 is "+ v2);
				
				
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}