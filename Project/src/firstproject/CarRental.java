package firstproject;

public class CarRental {
	
	private int CarId;
	private String CarType;
	private float Rent;
	
	
	public int getCarId() {
		return CarId;
	}
	public void setCarId(int carId) {
		CarId = carId;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	
	
	public float showCar(String Type) {
		if(Type.equals("SUV"))
		{
			Rent = (float) 2500.00;
		}
		else if(Type.equals("Van"))
		{
			Rent = (float) 800.00;
		}
		else if(Type.equals("Car"))
		{
			Rent = (float) 1000.00;
		}
		return Rent;
		
	}
	
	public float getRent(){
		showCar(CarType);
		return Rent;
	}
}
