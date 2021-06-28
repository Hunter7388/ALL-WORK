package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//import Generics.Names;

class Data<K,V> {
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
}


public class CustomSorting {

	public static void main(String[] args) {	

	Comparator<Data<Integer,String>> COMPARE_KEY= new 	Comparator<Data<Integer,String>>(){
		
		@Override
		public int compare(Data<Integer,String> obj1 , Data<Integer,String> obj2 ) {
			if (obj1.getKey() < obj2.getKey()) {
				return -1;
			} else if (obj1.getKey() > obj2.getKey())  {
				return 1;
			} else {
				return 0;
			}
		}

	};	
	
	Set<Data<Integer,String>> set = new TreeSet<>(COMPARE_KEY);
	
	set.add(new Data<Integer,String>(1,"Raju") );
	set.add(new Data<Integer,String>(6,"Kumar") );
	set.add(new Data<Integer,String>(3,"Hunter") );
	set.add(new Data<Integer,String>(4,"Rocco") );
	set.add(new Data<Integer,String>(5,"Chaal") );
	set.add(new Data<Integer,String>(7,"Raj") );
	set.add(new Data<Integer,String>(3,"Hunter") );
	set.add(new Data<Integer,String>(4,"Rocco") );
	set.add(new Data<Integer,String>(15,"Mia") );
	set.add(new Data<Integer,String>(3,"Hunter") );
	set.add(new Data<Integer,String>(4,"Rocco") );
	set.add(new Data<Integer,String>(5,"Chaal") );
	
	for (Data<Integer, String> data : set) {
		System.out.println(data);
		
	}
	}

}
