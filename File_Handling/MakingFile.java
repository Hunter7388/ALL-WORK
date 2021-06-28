package File_Handling;

import java.io.File;
import java.io.IOException;

public class MakingFile {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\rajuk\\Desktop\\FILE HANDLING\\JAYSITARAM.txt");
		file.createNewFile();
		System.out.println("src/Its done");
		
	}
}
