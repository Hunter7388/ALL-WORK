package InnerClass;

public class Student {
	int x = 10;
	Address y=new Address();
	


	public static void main(String[] args) {
		
		Student student=new Student();
		System.out.println(student.x);
		System.out.println(student.y);
		
		System.out.println(student.y.getPin());
		
		System.out.println(args[0]);
	}
}
