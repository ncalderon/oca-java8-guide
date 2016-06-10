class TooManyConvertions {
	
	public static void main (String ... args) {
		method(5L);
		method(5L, 5L);
	}

	public static void method (Long l){
		System.out.println("Long");
	}

	public static void method (Long ... l){
		System.out.println("Long []");
	}


}