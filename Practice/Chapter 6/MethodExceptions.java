class NoMoreCarrotsException extends java.lang.Exception {}

public class MethodExceptions {
	public static void main (String ... args) {
		try {

		} catch (java.io.FileNotFoundException io) {
			
		}
		//bad();
	}

	public static void bad () {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {
			System.out.print("Sad rabbit");
		}
	}

	public static void good () throws NoMoreCarrotsException {
		eatCarrot();
	}

	private static void eatCarrot () {

	}
}