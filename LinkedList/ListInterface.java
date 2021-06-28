package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> Country = new LinkedList<>();
		Country.add("India");
		Country.add("America");
		Country.add("Pakistan");	
		Country.add("China");
		Country.add("Nepal");
		Country.add("Japanu");
		System.out.println("SIMPLE DATA IN LIST");
	    new Basic().printList(Country);
		Country.add(1, "BHARAT");
		System.out.println("AFTER (BHARAT) DATA ADDED IN LIST");
		new Basic().printList(Country);
		Country.set(6,"Japan");
		System.out.println("AFTER ALTER JAPAN DATA IN LIST");
		new Basic().printList(Country);
		Country.remove(3);
		System.out.println("AFTER REMOVING PAKISTAN DATA IN LIST");
		new Basic().printList(Country);
		
		List<String> Country2 = new ArrayList<>();
		Country2.add("India");
		Country2.add("America");
		Country2.add("Pakistan");	
		Country2.add("China");
		Country2.add("Nepal");
		Country2.add("Japanu");
		System.out.println("SIMPLE DATA IN LIST 2");
	    new Basic().printList(Country);
	    Country2.add(1, "BHARAT");
		System.out.println("AFTER (BHARAT) DATA ADDED IN LIST");
		new Basic().printList(Country);
		Country2.set(6,"Japan");
		System.out.println("AFTER ALTER JAPAN DATA IN LIST");
		new Basic().printList(Country);
		Country2.remove(3);
		System.out.println("AFTER REMOVING PAKISTAN DATA IN LIST");
		new Basic().printList(Country);
	}
	void printList(	List<String> Country)
	{
		System.out.println("****************");
		for (String string : Country) {
			System.out.println(string);
		}
		System.out.println("****************");
	}

}
