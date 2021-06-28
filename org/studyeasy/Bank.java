package org.studyeasy;

public class Bank {
	
	float m = 12012;

	float intrest() {
		return (float)(0.06*m);

	}

	public static void main(String[] args) {
		Bank b = new SBI();
		b.intrest();
		Bank b1 = new AXIS();
		b1.intrest();
		System.out.println("SBI intrest  " + b.intrest());
		System.out.println("AXIS intrest  " +b1.intrest());

	}

}
