public class Question5 {

	public static void main (String ... args) {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		Integer integer = new Integer(5);
		if (integer == s2)
			System.out.println("3");
		if (s1 == s2)
			System.out.println("1");
		if (s1.equals(s2))
			System.out.println("2");
		
	}

}