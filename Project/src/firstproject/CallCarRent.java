package firstproject;

public class CallCarRent {

	public static void main(String[] args)
	{
		CarRental cr = new CarRental();
		cr.setCarId(1);
		cr.setCarType("SUV");
		System.out.println(cr.getRent());
	}
}