package InnerClass;

public class School {

	Teacher teacher = new Teacher();
	Teacher teacher1 = new Teacher("Rahul", 190, "ANTALIA");

	public static void main(String[] args) {
		School school = new School();
		System.out.println(school.teacher);
		System.out.println(school.teacher);
		System.out.println(school.teacher.getPlace());
		System.out.println(school.teacher1);

	}

}
