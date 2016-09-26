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

1. Valid Java identifier can contain "$","[A-Za-z]","_" and [0-9]. But not begin with [0-9].

	Also you can have identifier like this "Public" because Java is case sensitive. You can have wathever reserved word you want using case sensitive.

2. Numeric Promotion:

	Numeric Promotion Rules
	1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
	2. If one of the values is integral and the other is floating-point, Java will automatically
	promote the integral value to the floating-point value’s data type.
	3. Smaller data types, namely byte, short, and char, are first promoted to int any time
	they’re used with a Java binary arithmetic operator, even if neither of the operands is
	int.
	4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

	Numeric Literals:

	- all floating point are a doble	
	- all integer number are int.

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

	But java will use the most specific when you be using it

5. Local variables don't get assigned default values. 
	The code fails to compile if a local variable is not explicity initialized and it's trying to use.

6. Java is completely CASE SENSITIVE that's include PACKAGE NAMES.

7. Values prefixex for number:

	0b ---> Binary Prefix
	0x ---> Hexadecimal Prefix
	0 for octal

8. Calling System.gc() has no effect on eligibility for garbage collection.

	Calling System.gc() suggests that Java might wish to run the garbage collector.
	Java is free to ignore the request. finalize() runs if an object
	attempts to be garbage collected.

9. Java doesn't has operator overloading and pointers. 

10. All of the arithmetic operators may be applied to any Java primitives, except boolean
	and String. Furthermore, only the addition operators + and += may be applied to String
	values, which results in String concatenation.



*/