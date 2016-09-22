public class TestingQuestions {
	public static void main (String ... args) {

	}
}


// Test Cases Facts
/*

1. Local variables must be initialized before be used.

2. Overrided method cannot be more restrictive. For example:

	interface Hastail { int getTailLength()}
	abstract class Puma implements Hastail {
		protected int getTailLength() { return 4; }
	}

*/