package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
		LinkedList<String> Country = new LinkedList<>();
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
	}
	void printList(	List<String> country)
	{
		System.out.println("****************");
		for (String string : country) {
			System.out.println(string);
		}
		System.out.println("****************");
	}

}
