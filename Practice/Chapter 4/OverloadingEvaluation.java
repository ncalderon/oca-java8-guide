class OverloadingEvaluation {
	public static void main (String ... args) {

		String str = "val";
		System.out.println(System.identityHashCode(str)); 
		String str2 = "val";
		System.out.println(System.identityHashCode(str2)); 
		String str3 = new String("val");
		System.out.println(System.identityHashCode(str3)); 
		System.out.println(str == str2? true:false); 
		Integer num1 = new Integer(1);
		System.out.println(System.identityHashCode(num1)); 
		int num2 = 1;
		System.out.println(System.identityHashCode(num2)); 
		System.out.println(num1 == num2? true : false);
	}

	public static void method(int ... values){
		System.out.println("Varargs method");
	}

	public static void method (int[] values[]) {
		System.out.println("int array method");
	}

}