package InnerClass;

public class Teacher {
	String name;
    int roll;
    String place;
    
	public Teacher() {
		super();
		this.name = "RAJU";
		this.roll = 1906264;
		this.place = "MANNAT";
	}
	
	

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", roll=" + roll + ", place=" + place + "]";
	}



	public Teacher(String name, int roll, String place) {
		super();
		this.name = name;
		this.roll = roll;
		this.place = place;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
    

}
