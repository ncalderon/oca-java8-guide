package aquarium;
class water {}



public class TestingQuestions {

	private String brand;
	private boolean empty;
	public static void main (String ... args) {

		TestingQuestions tq = new TestingQuestions ();

		System.out.println("Empty: " + tq.empty);
		System.out.println("Brand: " + tq.brand);
		/*String Double = "I'm a identifier called Double";
		Double Integer = 0d;
		System.out.println(Double.parseDouble("") + Integer);*/
	}

}

// Test Cases Facts
/*

1. Valid Java identifier can contain "$","[A-Za-z]","_" and [0-9](but not begin with them).

	Also you can have identifier like this "Public" because Java is case sensitive. You can have wathever reserved word you want using case sensitive.

2. You cannot declare a double like this:

	double d = 0;

	Because literals number are considered like a integer always so you need to convert it to valid Doble. Like this:

	double d = 0D; or double d = 0d; 
	double d = 0.0;

3. Same class is granted full privilege on objects of their kind.

	For example:

	class Person 
	{
	   private BankAccount account;

	   Person(BankAccount account)
	   {
	      this.account = account;
	   }

	   public Person someMethod(Person person)
	   {
	     // Here, you have access to this privete member because this it's from the same class where you are using

	     BankAccount a = person.account;
	   }
	}

4. You cannot import by classname two same classes

	For example:

	import aquarium.Water;
	import aquarium.jellies.Water;

	public class WaterFiller {
		Water water;
	}

	For this case should be:

	import aquarium.Water;
	import aquarium.jellies.*; // Or viceversa. Before line with *.

	public class WaterFiller {
		Water water;
	}	

5. Local variables don't get assigned default values. The code fails to compile if a local variable is not explicity initialized.

6. Java is completely CASE SENSITIVE that's include PACKAGE NAMES.

7. Values prefixex for number:

	0b ---> Binary Prefix
	0x ---> Hexadecimal Prefix

8. Calling System.gc() has no effect on eligibility for garbage collection.

	Calling System.gc() suggests that Java might wish to run the garbage collector.
	Java is free to ignore the request. finalize() runs if an object
	attempts to be garbage collected.

9. Java doesn't has operator overloading and pointers. 





*/