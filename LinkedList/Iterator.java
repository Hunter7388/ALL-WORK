package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.studyeasy.Whileloop;

public class Iterator {

	public static void main(String[] args) {
		LinkedList<String> Country = new LinkedList<>();
		Country.add("India");
		Country.add("America");
		Country.add("Pakistan");
		Country.add("China");
		Country.add("Nepal");
		Country.add("Japanu");
		new Iterator().printList(Country);
		Country.sort(null);//for sorting in list
		new Iterator().printList(Country);
		Collections.reverse(Country);//for reverse sorting in list
		new Iterator().printList(Country);
	}

	void printList(List<String> country) {

		ListIterator<String> list = country.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
       System.out.println("****************");
	}

}
