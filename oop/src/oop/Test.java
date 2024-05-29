package oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First obj = new First();
		System.out.println(obj.a);
		obj.sum(10, 12);
		
		//Encapsulation
		Person myObj = new Person();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	    
	    //Poli
	    Animal myPig = new Pig();
	    Animal myDog = new Dog();
	    Animal myAnimal = new Animal();
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	}

}
