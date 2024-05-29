package javaBasic;

public class Methods {

	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	 static void myMethod(String fname) {
		    System.out.println(fname + " Refsnes");
		  }

	 static void myMethod(String fname, int age) {
		    System.out.println(fname + " is " + age);
		  }
	 
	 static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");

		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		    }

		  }
	 
	 //Overloading
	 static int plusMethodInt(int x, int y) {
		  return x + y;
		}

		static double plusMethodDouble(double x, double y) {
		  return x + y;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int myNum1 = plusMethodInt(8, 5);
	    double myNum2 = plusMethodDouble(4.3, 6.26);
	    myMethod();
	    myMethod("Liam");
	    myMethod("Jenny");
	    myMethod("Anja");
	    myMethod("Liam", 5);
	    myMethod("Jenny", 8);
	    myMethod("Anja", 31);
	    checkAge(20); 

	    System.out.println("int: " + myNum1);
	    System.out.println("double: " + myNum2);

	}

}
