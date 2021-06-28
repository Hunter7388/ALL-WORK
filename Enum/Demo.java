package Enum;

public class Demo {
public static void main(String[] args) {
		
	Enum learn = Enum.GENERICS;
		
		switch(learn){
		case COLLECTIONS:
			System.out.println("step 2");
			break;
		case COREJAVA:
			System.out.println("step 3");
			break;
		case GENERICS:
			System.out.println("step 4");
			break;
		case JSPANDSERVLETS:
			System.out.println("step 5");
			break;
		case MUILTITHREADING:
			System.out.println("step 6");
			break;
		default:
			System.out.println("DEFAULT  ");
			break;
		}
	}
}