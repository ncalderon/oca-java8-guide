public class AssignEvaluation {

	public static void main (String ... args ) {
		String value = new String("main");
		method(value);
		System.out.println(value);		

	}

	public static void method (String val) {
		val = "method";
	}

}