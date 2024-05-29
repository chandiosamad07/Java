package javaBasic;

public class Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		int x = 10;
		int y = 9;
		int myAge = 25;
		int votingAge = 18;

		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);  
		System.out.println(x > y); // returns true, because 10 is higher than 9	
		System.out.println(x == 10); // returns true, because the value of x is equal to 10
		System.out.println(myAge >= votingAge);


		if (myAge >= votingAge) {
			  System.out.println("Old enough to vote!");
			} 
		else {
			  System.out.println("Not old enough to vote.");
			}
	}

}
