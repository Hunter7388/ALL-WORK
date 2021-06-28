package Generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int VehicleId;

	
	public Vehicle(int vehicleId) {
		super();
		VehicleId = vehicleId;
	}


	public int getVehicleId() {
		return VehicleId;
	}
	
	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}


}

class car extends Vehicle{
	
	private String CarModel;

	public car(int vehicleId, String carModel) {
		super(vehicleId);
		CarModel = carModel;
	}

	public String getCarModel() {
		return CarModel;
	}

	@Override
	public String toString() {
		return "car [CarModel=" + CarModel + "]";
	}
	
	
}
public class WildCards {

	public static void main(String[] args) {
		List<Vehicle> list  =  new ArrayList<>();
		list.add(new Vehicle(12));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new car (14, "A14"));
		list.add( new car (1212, "honda"));
		display(list);
		
	}
	
	public static void display(List<?  extends Vehicle> list)
	{
		for (Vehicle element : list) {  // for Upper  class Vehicle
			System.out.println(element);
		}
	}
	
	
//	public static void display(List<? super car> list)
//	{
//		for (Object element : list) {  // for lower class car
//			System.out.println(element);
//		}
//	}

}
