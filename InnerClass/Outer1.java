package InnerClass;

public class Outer1 {

	public static void MethodinOuter() {

		System.out.println("Value of Inner1.x calling from MethodinOuter() " + Inner1.x);

	}

	public static class Inner1 {
		static int x = 0;

		public static void MethodinInner() {

			System.out.println("Value x of inner1 class is : " + x);
		}
	}

}