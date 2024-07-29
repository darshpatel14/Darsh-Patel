package firstproject;

public class Student2 {
	String firstname,lastname;
	
	public Student2() {
		this.firstname="unknown";
		this.lastname="unknown";
	}
	
	public Student2(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student2 [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
