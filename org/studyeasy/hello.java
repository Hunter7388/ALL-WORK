package org.studyeasy;

public class hello {

	public static void main(String[] args) {
		int term = 16;
		for (int i = 1; i <=16; i++) {
//		for(int j=term;j>=i;j--){  
//		        System.out.print("* ");  
//		} 
			if (i % 2 == 0)
				System.out.println(i);// new line
		}
		System.out.println("all odd number now");
		for (int i= 1;  i<=16; i++) {
//			for(int j=term;j>=i;j--){  
//			        System.out.print("* ");  
//			} 
				if (i % 2 != 0)
					System.out.println(i);// new line
			}
	}
}