package File_Handling;

import java.io.File;
import java.io.IOException;

public class Directory {

	public static void main(String[] args) throws IOException {
		File Directory = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\File_Handling_Work\\NEWFILE");
		Directory.mkdir();
		File file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\File_Handling_Work\\NEWFILE\\Rs.txt");
    // for creating new file
		file.createNewFile();
       
       
       // for deleting that file
       
//        if(file.delete())
//        {
//        	System.out.println("Done");
//        	
//        }
//        else {System.out.println("not delete");}
//	}

}

}