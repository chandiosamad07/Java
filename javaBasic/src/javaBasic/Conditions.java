package javaBasic;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 18;
		int time = 22;
		
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		if (time < 18) {
			  System.out.println("Good day.");
			} 
		else {
			  System.out.println("Good evening.");
			}
	
		if (time < 10) {
			  System.out.println("Good morning.");
			} else if (time == 22) {
			  System.out.println("Good day.");
			} else {
			  System.out.println("Good evening.");
			}
		
		if (time < 18) {
			  System.out.println("Good day.");
			} else {
			  System.out.println("Good evening.");
			}
		
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		
		int day = 3;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
	}

}
