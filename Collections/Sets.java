package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sets {
public static void main(String [] args)
{
	
	
Set<String> set = new HashSet<>();
 set.add("sets");
 set.add("raju");
 set.add("kumar");
 set.add("ram");
 
 List<String> list =new ArrayList<>();
 list.addAll(set);
System.out.println(Collections.binarySearch(list, "sets"));
 System.out.println(list);
 Collections.sort(list);
 System.out.println(list); 

for (Object string : set) {
	System.out.println(string);
 System.out.println("***************");

 Set<Integer> setts = new LinkedHashSet<>();
  for(int i = 0 ; i<=30; i++)
 {
	 setts.add(i);
 }
  
  for (int str : setts) {
		System.out.println(str);
 }

  System.out.println("***************");
  
  
 Set<Integer> sets = new HashSet<>();
  for(int i = 0 ; i<=30; i++)
 {
	 sets.add(i);
 }
  
  for (int str : sets) {
		System.out.println(str);
 }


}

}
}

