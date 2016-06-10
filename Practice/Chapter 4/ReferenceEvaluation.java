class ReferenceEvaluation {
	public static void main (String ... args) {
		method(1); // long
		method(1L); // long
		method(new Long(1)); // Long
	}

	public static void method (long a) {
		System.out.println("long");
	}

	public static void method (Long a) {
		System.out.println("Long");
	}

}