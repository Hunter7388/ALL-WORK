package org.studyeasy;

public class loop {

	public static void main(String[] args) {
		int x = 194123;
		int sum = 0;
		while (true) {
			sum = sum + x % 10;
			x = x / 10;
			if (x < 10) {
				break;
			}
		}
		sum = sum + x;
		System.out.println(sum);

	}

}
