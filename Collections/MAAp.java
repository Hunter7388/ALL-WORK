package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MAAp {

	public static void main(String[] args) {
	
		Map <Integer, String> Student = new HashMap<>();
		Student.put(1, "Raju");
		Student.put(1, "Raju");
		Student.put(3, "Raju");
		Student.put(4, "Raju");
		Student.put(5, "Raju");
		Student.put(6, "Raju");
		
//		for (Map.Entry<Integer, String> entry :Student.entrySet()) {
//			System.out.println(entry);
//			
//		}
		
		Iterator<Entry<Integer, String>> entry = Student.entrySet().iterator();

		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
	}

}
}
