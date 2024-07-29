package classrelation;

public class Address {
	private String flatno,societyname,area;
	private int pincode;
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getSocietyname() {
		return societyname;
	}
	public void setSocietyname(String socname) {
		this.societyname = socname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getpincode() {
		return pincode;
	}
	public void setpincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", socname=" + societyname + ", area=" + area + ", pincode=" + pincode + "]";
	}
	
	
}
