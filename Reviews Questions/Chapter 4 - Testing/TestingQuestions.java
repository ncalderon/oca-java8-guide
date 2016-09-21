import static java.lang.System.out;

public abstract class TestingQuestions {
	public static void main (String ... args) {
		howMany(true, {true, true});
	}

	public static void howMany (boolean one, boolean ... many) {
		out.println(many.length);
		out.println("reached");

	}
}

// Test Cases Facts
/*

1. Only the access modifier or optional specifiers are allowed before the return type. But optional specifiers are allowed in any
order.

2. Array initializer isn't allowed passing to methods. For example(search another in question ch 4 no 5):
	....
	howMany(true, {true, true});
	....
3. Access Modifier

	■ private: Only accessible within the same class
	■ default (package private) access: private and other classes in the same package
	■ protected: default access and child classes
	■ public: protected and classes in the other packages

4. You cannot create Cyrcle inheritance, two classes inherit each other.

5. You cannot asign "void" like a type to any variable or member state of a class.

6. JavaBeans naming conventios for accessors and mutators

	- Properties are private. private int numEggs;
	- Getter methods begin with is if the property is a boolean. public boolean isHappy() {return happy;}
	- Getter methods begin with get if the property is not a boolean. public int getNumEggs() { return numEggs; }
	- Setter methods begin with set. public void setHappy(boolean happy) { this.happy = happy; }
	- The method name must have a prefix of set/get/is, followed by the first letter of the property in uppercase, followed by the rest of the property name.
	public void setNumEggs(int num) { numEggs = num;

7. Static methods are not allowed to call instance methods. Neither instance variables.

8. Static final variables must be set exactly once, and it must be in the declaration line or in a static initialization block

9. You cannot use a final instance variable before initilize it.

10. Number literals:

	 Floating-point literals are assumed to be double, unless postfixed with an f. For example:
	 double a = 1.0 // double
	 float f = 1.0 // it doesn't compile. It must be with postfixed. 1.0f would be correct.

11. When you concatenate two classes with + and one string, this operation will call the method toString of each class 
	involves in the operation.

12. You cannot call the default constructor created by the compiler if you have created one before. 
	Because the compiler won't add the default constructor since you have added your properly contrusctor o constructors.

13. You can call a private constructor from inside the same class using a static method 
	or in the same declaration of a variable member.

14. When java is choosing the most specify method by a call, java prefers autoboxing to varargs. For example:

	public class Create {
		Create(Integer num) {
			System.out.print("3 ");
		}
		Create(Object num) {
			System.out.print("4 ");
		}
		Create(int... nums) {
			System.out.print("5 ");
		}
		public static void main(String[] args) {
			new Create(100);
			new Create(1000L);
		}
	}

	For this the output would be: 3 4

15. Lambda expressions
	
	1. The parentheses are only optional when there is one parameter and it doesn’t have a type declared.
	For example:
					print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
					print((a, b) -> a.startsWith("test")); // COMPILE
	2. Lambdas work with interfaces that have only one method. 
	TODO: Review topics.

	3. Remember the one method in the interface called test()? It takes any one reference type parameter and returns a boolean.
	
*/