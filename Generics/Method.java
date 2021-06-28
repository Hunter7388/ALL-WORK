package Generics;

import java.util.ArrayList;
import java.util.List;
class Data3{
	
	public <E> void printListData(List<E> list)
	{
		for (E e : list) {
			System.out.println(e);	
		}
	}
	
	public <E> void printArrayData(E[] arrayData){
		for(E element: arrayData){
			System.out.println(element);
		}
	}
	
}
public class Method {

	public static void main(String[] args) {
		
		Data3 m =new Data3();
	
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);	
		list.add(4);			
		list.add(5);
	
		m.printListData(list);
	
		
		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");	
		list2.add("Four");		 	
		list2.add("Five");
		
		
		m.printListData(list2);

		String[] stringArray = {"One","two","Three"};
		Integer[] integerArray = {1,2,3,4};
		System.out.println("Printing String array");
		System.out.println("******************");
		
		m.printArrayData(stringArray);//Printing String array
		
		System.out.println("Printing integer array");
		System.out.println("******************");
		
		m.printArrayData(integerArray);//Printing integer array
		
		Double[] doubleArray = {2.0,5.0,4.6,8.5};
		System.out.println("Printing double array");
		System.out.println("******************");
		
		m.printArrayData(doubleArray);//Printing double array
		
		
	}


}
