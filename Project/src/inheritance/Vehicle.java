package inheritance;

public class Vehicle {
	private String comp;

	public Vehicle() {

		this.comp = "Hyundai";
	}

	
	@Override
	public String toString() {
		return "Vehicle [comp=" + comp + "]";
	}

}
