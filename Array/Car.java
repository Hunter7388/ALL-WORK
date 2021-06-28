package Array;

import java.util.ArrayList;

public class Car {
	static ArrayList<String> Cars = new ArrayList<>();
	
	public static void main(String[] args) {
		
    
		Cars.add("Volvo");
		Cars.add("BMW");
		Cars.add("Ford");
		Cars.add("Mazda");
		Cars.add("Nano");
		Cars.add("Mercedez");
		Cars.add("Tata");	
		Cars.add("Mahindra");
		Cars.add("Suzuki");
		
		Car  c  = new Car();
		c.displaylist(Cars);
		System.out.println("************************");
    	c.removeNameByString("Suzuki");
		System.out.println(Cars);
		System.out.println("************************"); 
		c.removePosition(3);
		c.displaylist(Cars);

	}
	public void displaylist(ArrayList<String> Cars) {
		for (String string : Cars) {
			System.out.println(string);
		}
	} 
 
	void removePosition(int position)
	{
		Cars.remove(position);
	}
	void removeNameByString(String name){
			Cars.remove(name);
		}


}
