package Generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>
{
	private T myVarible;

	public Data(T myVarible) {
	this.myVarible = myVarible;
	}

	public T getMyVarible() {
		return myVarible;
	}

	@Override
	public String toString() {
	return "Data [myVarible=" + myVarible + "]";
	}
	
	
}
public class AnyType {

	public static void main(String[] args) {
	List<Data<Object>> element = new LinkedList<>();
	element.add(new Data<Object>("raju"));
	element.add(new Data<Object>(123));
	element.add(new Data<Object>(4.045f));
	element.add(new Data<Object>('&'));
	element.add(new Data<Object>(12d));

	AnyType any =new AnyType();
	any.print(element);
	}
	
	void print(List<Data<Object>> list) {
    ListIterator<Data<Object>> iterator =list.listIterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next().getMyVarible());
	}
	}

}
