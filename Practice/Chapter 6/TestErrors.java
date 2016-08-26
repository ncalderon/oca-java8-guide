import static java.lang.System.out;

public class TestErrors {

	// TESTING ERROR: ExceptionInInitializerError
	/*static {
		int [] countOfMoose = new int[3];
		int num = countOfMoose[-1];
	}*/
	public static void main (String ... args) {
		//out.println("Testing");
		doNotCallThis(1);
	}

	// TESTING ERROR; StackOverflowError
	public static void doNotCallThis (int num) {
		doNotCallThis(1);
	}
}