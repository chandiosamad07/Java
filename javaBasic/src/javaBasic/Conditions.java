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
	}

}
