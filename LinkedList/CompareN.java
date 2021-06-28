package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names>
{
     private String names ;

	public Names(String names) {
		this.names = names;
	}

   public int compareTO(Names obj)
   {
	   if (names.length()==obj.names.length())
	   {
		 return 0;
	   }
	   else if(names.length() > obj.names.length())
			 return 1;
	   else 
		   return -1;
   }

@Override
public int compareTo(Names o) {
	return 0;
}

}

public class CompareN {

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
