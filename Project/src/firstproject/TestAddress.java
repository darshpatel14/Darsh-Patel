package firstproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAddress {
	
	public static void main(String[] args)
	{
		
		Address ad = new Address();
		
		ad.setSocietyName("Suvas");
		System.out.println(ad);
		
		Address ad1 = new Address("thaltej","Ahmedabad", 380061);
		System.out.println(ad1);
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter society name");
		String name;
		try {
			name = br.readLine();
			ad.setSocietyName(name);
			
			int pin = Integer.parseInt(br.readLine());
			ad.setPincode(pin);
			System.out.println(ad);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
