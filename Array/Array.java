package Array;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {

		String a[] = { "123", "123", "123", "123", "123", "`qsd123" };
		int b[] = new int[12];

		System.out.println("************************");

		ArrayList<Integer> NUMBER = new ArrayList<Integer>();
		NUMBER.add(32);
		NUMBER.add(33);
		NUMBER.add(34);
		NUMBER.add(37);
		NUMBER.add(36);
		System.out.println(NUMBER);

		System.out.println("************************");

		if (a[1].equals(a[0])) {
			System.out.println("yes it is eql ");
		} else {
			System.out.println("djcbuieubwdbcqd");
		}

		System.out.println("************************");
		for (String s : a) {
			System.out.println(s);
		}
		System.out.println("************************");
		for (int i : b) {
			System.out.println(i);
		}

	}
}
