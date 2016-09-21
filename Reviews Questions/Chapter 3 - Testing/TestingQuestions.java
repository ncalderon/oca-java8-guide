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
import java.util.List;
import java.util.Arrays;

public class TestingQuestions {

	
	
	public static void main (String ... args) {
		//                0,1,2,3,4,5     
		/*int [] ordered = {1,2,3,6,8,10};
		int [] unordered = {0,3,2,5,9,7,6,7};
		int x = 11;
		int y = Arrays.binarySearch(ordered, x);
		out.println(y);*/

		List<Integer> list = Arrays.asList(10, 4, -1, 0b1010);
		out.println(list.get(3));

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

3. Java does not allow you to compare different types using ==. For example String and StringBuilder.

4. A String concatenated with any other type gives a String.d
	For example

	String a = "a";
	a += false; // afalse
	a += 0L; // afalse0
	a += 0d; // afalse00

5. Strings from the pool are different the string build with String from the pool.
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
	- If initialize an array you must specified the size of it. Although it is legal to leave out the size for later
	dimensions of a multidimensional array, the first one is required. For example:

	int [][] scores = new int[5][];
	int [][] scores = new int[5][5];

7. An array is not able to change its size. Both an Array and an ArrayList are ordered and have indexes. 
	Neither is immutable because their elements can change.

8. An array does not override equals() and so uses object equality. ArrayList does
	override equals() and defines it as the same elements in the same order.

9. About Arrays class:

	Its method "int binarySearch(int[] a, int key)":

		They array "a" must be sorted prior to making this call. If it is not sorted. The result will be undefined.

		Returns: It will be the index of the search key, if it is contained in the array. Otherwise, (-(insertion point) - 1)

10. Collections API
	
	Sort:

		This method can sort either a List of numbers and a List of String. 
		In case of a list of numbers, the numbers are sort in the normal way. But in case of a List of String
		, the sort would be alphabetically which mean that the numbers will be first in their natural order
		regardless any contain letters. For example:

		For this: List<String> hex = new Arrays.asList({"30", "8", "3A", "FF"});
		The output would be = {"30", "3A", "8", "FF"}

11. ArraysList class:

	- ArrayList implements equality to mean the same elements in the same order are equals.

12. LocalDate API

	- You cannot get an instance from LocalDate. You must to use LocalDate.of(YYYY, MM, DD).
	- Month stars counting with 1 rather than 0(The old way using Calendar.FIELD used to start with 0).
	- A LocalDate does not have a time element. Therefore, it has no method to add hours and the code does not compile.
	- Dates are immutable. Therefore plus methods have to assign their return values or will be ignored. 
	
13. LocalDateTime API (TODO: For study it)

14. Period

	- Doesn't Allow method chaining. Because it always create a new object in its way. 
	For example: 
		Period period = Period.ofDays(5).ofYears(5);
	Will just stay with: 5 years. Because the method works in this way

		return create(years, 0, 0);:



	


*/