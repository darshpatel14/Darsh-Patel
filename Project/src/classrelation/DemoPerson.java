package classrelation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address();
		add.setFlatno("E/16");
		add.setSocietyname("Suvas Appartment");
		add.setArea("Thaltej");
		add.setpincode(380061);
		
		Person p1 = new Person();
		p1.setPersonname("Darsh Patel");
		p1.setPersonemail("darshmnp@gmail.com");
		p1.setAdd(add);
		
		System.out.println(p1);
	}

}
