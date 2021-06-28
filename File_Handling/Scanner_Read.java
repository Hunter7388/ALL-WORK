package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scanner_Read {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book");
		file.mkdir();
		
		file = new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book\\Name.txt");		
		
		
		Scanner sc = new Scanner(new File("C:\\Users\\rajuk\\eclipse-workspace\\hello world\\src\\Book\\Name.txt"));
		String line;
		while(sc.hasNext()) {
			line=sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		
		
		
	}}