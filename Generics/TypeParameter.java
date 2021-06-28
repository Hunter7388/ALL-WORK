package Generics;
class DataD<K,V>{
	private K key;
	private V value;
	
	public DataD(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public <E,N> void  display(E element , N number) {
		System.out.println("element: "+ element +" number: "+ number);
	}
	
}
public class TypeParameter {

	public static void main(String[] args) {
	DataD<Integer,String> data=new DataD<Integer ,String>(1,"Raju");
	System.out.println("Key: "+data.getKey()+" value: "+data.getValue());
	data.display("23", 23124.134);
	}

}
