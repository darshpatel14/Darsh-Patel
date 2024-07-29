package firstproject;

public class DemoEmployee {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Darsh Patel");
		emp.setEmail("xyz@gmail.com");
		emp.setDesignation("Developer");
		emp.setAddress("Ahmedabad");
		emp.setSalary(100000);
		
		System.out.println(emp);
	}

}
