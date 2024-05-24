package javaBasic;

public class DataType {

	public class Main {
		  public static void main(String[] args) {
		    int myNum = 5;               // integer (whole number)
		    float myFloatNum = 5.99f;    // floating point number
		    char myLetter = 'D';         // character
		    boolean myBool = true;       // boolean
		    String myText = "Hello";     // String    
		    System.out.println(myNum);
		    System.out.println(myFloatNum);
		    System.out.println(myLetter);
		    System.out.println(myBool);
		    System.out.println(myText);
		    
		 // Create variables of different data types
		    int items = 50;
		    float costPerItem = 9.99f;
		    float totalCost = items * costPerItem;
		    char currency = '$';

		    // Print variables
		    System.out.println("Number of items: " + items);
		    System.out.println("Cost per item: " + costPerItem + currency);
		    System.out.println("Total cost = " + totalCost + currency);
		  }
		}


}
