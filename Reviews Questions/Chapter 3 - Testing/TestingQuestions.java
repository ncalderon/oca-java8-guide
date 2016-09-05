/*String s = "Hello";
		String b = "Hello";
		String t = new String(s);
		String p = new String(t);

		if("Hello".equals(s))
			out.println("one");
		if("Hello".equals(t))
			out.println("two");
		if("Hello" == t)
			out.println("three");
		if("Hello" == s)
			out.println("four");
		if(t == p)
			out.println("t == p");
		if(t.equals(p))
			out.println("t.equals(p)");
		if(s == b)
			out.println("s == b");*/
import static java.lang.System.out;

public class TestingQuestions {

	
	
	public static void main (String ... args) {
		int [][] a;

	}
}

// Test Cases Facts
/*

1.  Comparing by "==" your are comparing by reference equality between two objects.
	But otherwise String.equals compare as reference equality and even values of two string against each other.

	Also, when you declare two String like this:

	String a = "Olivia";
	String b = "Olivia";

	if (a == b)	They are equals. Because both point to the same value in the Java String pool 

2. How substrings work:

	Substring method allowed you call with just one value what meaning begin at.

	For example:
	String a = "0123456789"; a.substring(5) = 56789

	Even, you can call this using the length where the result would be nothing = ""

	String a = "0123456789"; out.println(a.substring(10)); = ""

	** substring(int beginIndex)
     * Returns a string that is a substring of this string. The
     * substring begins with the character at the specified index and
     * extends to the end of this string. <p>
     * Examples:
     * <blockquote><pre>
     * "unhappy".substring(2) returns "happy"
     * "Harbison".substring(3) returns "bison"
        012345678
     * "emptiness".substring(9) returns "" (an empty string)
     * </pre></blockquote>
     *
     * @param      beginIndex   the beginning index, inclusive.

	** substring(int beginIndex, int endIndex)
     * Returns a string that is a substring of this string. The
     * substring begins at the specified {@code beginIndex} and
     * extends to the character at index {@code endIndex - 1}.
     * Thus the length of the substring is {@code endIndex-beginIndex}.
     * <p>
     * Examples:
     * <blockquote><pre>
     * "hamburger".substring(4, 8) returns "urge"
     * "smiles".substring(1, 5) returns "mile"
     * </pre></blockquote>
     *
     * @param      beginIndex   the beginning index, inclusive.
     * @param      endIndex     the ending index, exclusive.

3. Java does not allow you to compare different types using ===. For example String and StringBuilder.

4. A String concatenated with any other type gives a String.
	For exampleL

	String a = "a";
	a += false; // afalse
	a += 0L; // afalse0
	a += 0d; // afalse00

5. Strings from the pool are different the string build with String  from the pool.
	One comes directly from the string pool and the other comes from building using String operations.

6. Array in java:

	- Array is an ordered list
	- Arrays is an object.
	- int[] numbers1 = new int[3] When using this form to instantiate an array, set all the elements to the default value for
	  that type. 
	- You can initialize an array like this "int[] numbers2 = new int[] {42, 55, 99}" for this case you don't need to
	  specify the size because java knows what is the size by the array on the left side of equal sign

	  Also, As a shortcut, Java lets you write this: int[] numbers2 = {42, 55, 99};

	- Multiple arryas in declaration:

		int[] ids, types; = int [] ids; int types [];
		
		but this case is different:
		
		int ids[], types; = int ids[]; int types;
	- Arrays can be cast like a primitiv type or reference type.
	- If initialize an array you must specified the size of it. For example:

	int [][] scores = new int[5][];



*/