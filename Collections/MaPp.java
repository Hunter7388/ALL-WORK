package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MaPp {

	public static void main(String[] args) {
		
	Map<Integer, String> map = new HashMap<>();
	
	map.put(1, "Raju");
	map.put(3, "Raju");
	map.put(1, "Raju");
	map.put(2, "Mia");
	
	for (Entry<Integer, String> element : map.entrySet()) {
		//System.out.println(string);
		System.out.println(element.getValue());	
	}
	System.out.println(map.get(5));

	
	}
}














