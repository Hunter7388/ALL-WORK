package Exception;

public class Age {

	public int division(int a, int b) throws ArithmeticException{
	      int t = a/b;
	      return t; }

	public void  getAge(int age) {
		if (age<18)
		throw new ArithmeticException("Not Eligible for voting");
	
		else 
		{
			System.out.println("eligible");
		}
}

	public static void main(String[] args) {
		
		Age a =new Age();
		a.getAge(65);
		System.out.println("end of program");
		
		System.out.println("*******************");	
		  try{
		         System.out.println(a.division(15,0));
		      }
		      catch(ArithmeticException e){
		         System.out.println("You shouldn't divide number by zero");
		      }

	}

}
