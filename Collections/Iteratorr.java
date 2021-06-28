package Collections;
import java.util.HashMap;
import java.util.Map;


public class Iteratorr{

	public static void main(String[] args) {
		 
		Map<Integer, String> student = new HashMap<>();
		student.put(3, "Priyanka");
		student.put(1, "Rahul");
		student.put(2, "Mia");
		student.put(7, "Angel");
		student.put(5, "Chaand");
		student.put(10, "Maqbul");
		
		for (Map.Entry<Integer, String> string : student.entrySet()) {
			System.out.println(string);	
		}
 
	/*	Iterator<Entry<Integer, String>> entry =   student.entrySet().iterator();
 
		while (entry.hasNext()) { 
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
		}*/
 
	}
}