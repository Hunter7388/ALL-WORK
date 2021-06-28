package Generics;

class Data<K extends Integer,V extends Bounded> {
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public <E  ,N extends Number> void display(E element, N number){
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}
 
public class Bounded {
 
	public static void main(String[] args) {
		Data<Integer,Bounded> data = new Data<Integer,Bounded>(1, new Bounded());
		data.display('$', 1);
		data.getValue().test();
        System.out.println(data.getKey());
	}
	public void test(){
		System.out.println("Testing....");
	}
 
}

