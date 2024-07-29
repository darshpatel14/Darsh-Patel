package firstproject;

public class Student {
	
	int rollno;
	String name;
	
	public Student() {
		this.rollno=30;
		this.name="Darsh Patel";
	}
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	
//	void getdata() {
//		rollno=30;
//		name="Darsh";
//	}
//	
//	void display()
//	{
//		System.out.println(name + rollno);
//	}
	
	

}
