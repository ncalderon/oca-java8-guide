class Animal {
	public Animal() {
		System.out.println("New Animal");
	}

	public void speak () {
		System.out.println("....");
	}
}

class Dog extends Animal {

	public static final String type = "CUATRUPEDO";

	public Dog () {
		System.out.println("New Dog");
	}

	@Override
	public void speak () {
		System.out.println("Haug Haug");
	}

	public void printType () {
		System.out.println(type);
	}
}

public class Inheritance {
	public static void main (String ... args) {
		System.out.println("******* New Dog");
		Dog dog = new Dog();
		System.out.println("******* Dog speaks");
		dog.speak();
		System.out.println("******* Printing type");
		dog.printType();
		System.out.println("******* Upcasting Dog to Animal");
		Animal animal = new Animal();		
		System.out.println("******* Animal speaks");
		animal.speak();
		System.out.println("******* Downcasting Animal to Dog.");
		Dog animalDog = (Dog) animal;
		System.out.println("******* Dog speaks");
		animalDog.speak();
		System.out.println("******* Dog printing its type");
		animalDog.printType();

	}
}