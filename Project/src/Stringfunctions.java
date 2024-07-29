
public class Stringfunctions {
	
	 public static void main(String[] args) {
	        String str = "Hello World";
	        
	        int length = str.length();
	        System.out.println("Length of String is:"+length);
	        
	        String lowerCase = str.toLowerCase();
	        System.out.println("String in lowercase: " + lowerCase);
	        
	        String upperCase = str.toUpperCase();
	        System.out.println("String in Uppercase: " + upperCase);
	        
	        String replacString = str.replace("World", "Earth");
	        System.out.println("Replaced String: " + replacString);
	        
	        char CharAt = str.charAt(10);
	        System.out.println("Character at index 10 is:  " + CharAt);
	 }

}
