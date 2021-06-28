package InnerClass;
class Address {
	String street;
	int pin;
	String District;
	String state;
	
	public Address() {
		this.street = "Bhore";
		this.pin = 831426;
		District = "Gopalganj";
		this.state = "Bihar";
	}

	@Override
	public String toString() {
		return "Address [[street=" + street + ", pin=" + pin + ", District=" + District + ", state=" + state + "]";
	}

	public Address(String street, int pin, String district, String state) {
		this.street = street;
		this.pin = pin;
		District = district;
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
