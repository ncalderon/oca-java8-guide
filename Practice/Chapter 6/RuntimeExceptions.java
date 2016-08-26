import static java.lang.System.out;

public class RuntimeExceptions {
	public static void main (String ... args) {
		//		throw new ArithmeticException();
		print(new Object());
	}

	public static void print (Object message) {
		if (message instanceof String)
			System.out.println(message);
		else
			throw new IllegalArgumentException("message must be a String type or covariant");
	}
}