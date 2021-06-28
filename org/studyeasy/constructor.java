package org.studyeasy;

public class constructor {
	String name;
	int number;

//	public void rocco() {
//		System.out.println("Rocco the hunter");
//	}

	constructor(int number) {
		this.number = number;
		System.out.println("inside constructor");
		System.out.println(number);
		name = "raju";

	}

	public static void main(String[] args) {

		constructor cs = new constructor(12);
		System.out.println(cs.name);
//		cs.rocco();
	}

}
