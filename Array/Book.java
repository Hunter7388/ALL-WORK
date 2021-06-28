package Array;

import java.util.ArrayList;
import java.util.List;

    class intWrapper
{
  	public int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	@Override
	public String toString() {
		return "intValue=" + intValue ;
	}
	
  	
}
public class Book {
	static List<Integer> book = new ArrayList<Integer>();

	public static void main(String[] args) {

		book.add(0, 1);
		book.add(1, 12);
		System.out.println(book); // prints everything from list
		System.out.println(book.get(1)); // prints value at index 1

		ArrayList<intWrapper> bookNumber = new 	ArrayList<intWrapper>();
		bookNumber.add(new intWrapper(12));
		bookNumber.add(new intWrapper(122));
		bookNumber.add(new intWrapper(123));
		bookNumber.add(new intWrapper(124));
		bookNumber.add(new intWrapper(125));
		System.out.println(bookNumber);
		}

}
