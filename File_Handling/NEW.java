package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NEW {

	public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book");
	file.mkdir();
	
	file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book\\Name.txt");
	try {
		file.createNewFile();
		System.out.println("File created");
		
	} catch (IOException e) {
		System.out.println("error occured, while creating the file");
	}
	 
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,false)))
	{
		bw.write("ABCD");
		bw.newLine();
		bw.write("1234");
		bw.newLine();
		bw.write("Maths");
		bw.newLine();
		bw.write("BIO");
		bw.newLine();
		bw.write("PHYSIS");
		bw.newLine();
		bw.close();
	} catch (IOException e) {
		System.out.println("error occured, while creating writing onto file");
	}
	
	try {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book\\Name.txt"));
       	 String line;
       	 while((line= br.readLine()) != null)
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
