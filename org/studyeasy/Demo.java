package org.studyeasy;

public class Demo {

	public static void main(String[] args) {
//		Laptop lappy=new Laptop();
//		System.out.println(lappy.getProcessor().getBrand());
		processor processor = new processor("intel", "798bc", 7, 5, 7, "6mb", "2.4ghz", "2.4ghz", "2.4ghz");
		GraphicCard graphicCard = new GraphicCard("nvidia", 890, "2 gb");
		Laptop gamingLaptop = new Laptop(17f, processor, "23df", "23tb", graphicCard, null, "light");

		System.out.println(gamingLaptop);
		System.out.println("\n");
//     here is from interface class material 

		System.out.println("this is output from interface class SAMSUNG and OnePlus");
		
		phone p = new SAMSUNG();
		System.out.println(p.processor());
		System.out.println(p.OS());
		System.out.println(p.RAM());

		phone p1 = new OnePlus();
		System.out.println(p1.processor());
		System.out.println(p1.OS());
		System.out.println(p1.RAM());

	}

}
