package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Write_Reader {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book");
		file.mkdir();
		
		file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book\\Name.txt");		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			bw.write("Raju");
			bw.newLine();
			bw.write("RAJA");
			bw.newLine();
			bw.write("Kumar");
			bw.newLine();
			bw.write("Bhai");
			bw.newLine();
			System.out.println("complete writting");
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			
			BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book\\Name.txt"));
		    String line;
		    while((line=br.readLine())!= null)
		    {
		    	System.out.println(line);
		    }
		    br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
;