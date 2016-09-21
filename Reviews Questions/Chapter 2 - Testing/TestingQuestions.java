import static java.lang.System.out;

public class TestingQuestions {

	public static void main (String ... args) {
		byte a = 5;
		byte b = 2;
		out.println();

	}

}

// Test Cases Facts
/*

1. Operators

	TODO: Study precendece operators

2. Modulus operations results between 0 and (y  - 1).

	For example: 11 % 3 = 2 = 3 - 1 = 2

3. Numeric Promotion Rules:
	1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
	2. If one of the values is integral and the other is floating-point, Java will automatically
	promote the integral value to the floating-point value’s data type.
	3. Smaller data types, namely byte, short, and char, are first promoted to int any time
	they’re used with a Java binary arithmetic operator, even if neither of the operands is	int.
	4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

4. For ternary operator parentheses are not required. That means that you can have a expression like this:

	int x = 5;
	System.out.println(x > 2? x < 4? 10:8:7);
	output: 8

5. One tricky infinitive loop
	
	for (int i = 0; i < 10;){
		i = i++;
	}

	i++ increments de i bu then asign the old value to i again what means i still with the same value in that case it is 0.

6.  You cannot campare different data types using relational operators(==, >=, <=, ect).

7. Advise: Be careful with variables out of scope like the question number 16 of Reviews Cuestion of chapter 2:

	do {
		int y = 0;
	} while(y <= 10);

	y = out of scope for the line of the while.

8. "For Loop" statement

	The structure of a basic for statement
	Parentheses (required)
	Semicolons (required)
	for(initialization; booleanExpression; updateStatement) {
	// Body
	} Curly braces required for block of multiple statements, optional for single statement

	1 Initialization statement executes
	2 If booleanExpression is true continue, else exit loop
	3 Body executes
	4 Execute updateStatements
	5 Return to Step 2

9. Data types supported by switch statements include the following:
	 int and Integer
	 byte and Byte
	 short and Short
	 char and Character
	 int and Integer
	 String
	 enum values

	 Note that boolean and long, and their associated wrapper classes, are not supported by switch statements

	 The values in each case statement must be compile-time constant values of the same data type as the switch value. 
	 This means you can use only literals, enum constants, or final constant variables of the same data type. By final constant
	 , we mean that the variable must be marked with the final modifier and initialized with a literal value 
	 in the same expression in which it is declared.

	 There is no requirement that the case or default statements be in a particular
	order.




*/
