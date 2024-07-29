package firstproject;

public class DemoStudent {
	
	public static void main(String [] args)
	{
		// call get and set
//		Student student = new Student();
//		student.getdata();
//		student.display();
		
//		Student1 student1 = new Student1();
//		student1.setRollno(30);
//		student1.setName(" Darsh Patel");
//		System.out.println(student1.getRollno() + student1.getName());
		
		
		// constructor with parameter
		Student student = new Student(30,"Darsh");
		System.out.println(student);
		
		// constructor without parameter
		Student student1 = new Student();
		System.out.println(student1);
	

	}	
}
