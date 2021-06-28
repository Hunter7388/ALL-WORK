package Exception;

import java.util.Scanner;

public class UserDefined extends Exception {
  
	  static int a;
//	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	a = myObj.nextInt();
 	public int UserDefined(int a)
	{
		return this.a= a ;
	}
	public static void main(String[] args) {
 	
		try { 
			  
			 if(a > 18)
             {
                 throw new UserDefined();    //throws an Exception if age is negative
             }
			 else {System.out.println("sahi hai ");}
		}
		catch (UserDefined r) { System.out.println("wedfr  " + r.UserDefined(23));}
	}

}
