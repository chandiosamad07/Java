package javaBasic;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hello";
		System.out.println(greeting);
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
	
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"

		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate")); // Outputs 

		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));



	}

}
