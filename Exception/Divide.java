package Exception;

public class Divide {
	public void d2ivide() {
		
		int y = 0;
		
		if (y == 0) {
			System.out.println("its zero");
		} else {
			System.out.println("happy");}
		}

	public static void main(String args[]) {
		int x = 3;
		int y = 0;
		Divide d = new Divide();
		d.d2ivide();

		try {
			System.out.println(x / y);
		}

		catch (Exception e) {
			System.out.println("answer is zero");
		}


	
	}

}
