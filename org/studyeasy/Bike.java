package org.studyeasy;

public class Bike {
	
	
	public void  run()
	{
		System.out.println("it can run");
	}
	
	public static void main(String[] args) {
	
	Bike b = new  Car();
	b.run();
	Bike b1 = new  Bike();
	b1.run();

	}

	}

