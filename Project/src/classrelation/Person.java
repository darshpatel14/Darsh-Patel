package classrelation;

public class Person {
	private String personname,personemail;
	private Address add;
	public String getPname() {
		return personname;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public String getPersonemail() {
		return personemail;
	}
	public void setPersonemail(String personemail) {
		this.personemail = personemail;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [personname=" + personname + ", personemail=" + personemail + ", add=" + add + "]";
	}
	
	
	
}
